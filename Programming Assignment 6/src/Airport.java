import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

class Plane {
    private int id;
    private int fuel;
    private int runwayTime;

    public Plane(int id, int fuel) {
        this.id = id;
        this.fuel = fuel;
        this.runwayTime = 0;
    }

    public int getFuelAmount() {
        return fuel;
    }

    public int getId() {
        return id;
    }

    public int getRunwayTime() {
        return runwayTime;
    }

    public void decrementFuel() {
        fuel--;
    }

    public void incrementTimeOnRunway() {
        runwayTime++;
    }
}

public class Airport {
    // Configurable parameters
    int departingRunwayTime = 5;
    int fuel = 150;
    int fuelNeededForFlight = 50;

    int totalPlanes = 0;
    int simulationTime;
    boolean planeDeparting = false;

    Queue<Plane> departing = new LinkedList<>();
    Queue<Plane> departed = new LinkedList<>();
    Queue<Plane> notEnoughFuel = new LinkedList<>();
    Plane planeOnRunway;

    public Airport(int simulationTime) {
        this.simulationTime = simulationTime;
    }

    void createNewPlane(int id) {

        Plane plane = new Plane(id, fuel);
        departing.add(plane);
        totalPlanes++;

    }

    boolean isRunwayEmpty() {
        return (planeOnRunway == null);
    }

    void removePlaneFromRunway() {
        planeOnRunway = null;

    }

    void decrementFuelOfAllPlanes() {
        for (Plane plane : departing) {
            plane.decrementFuel();
        }

    }

    void processDepartingQueue() {
        // The queue will be read when it is empty in some cases. Checking that it's not empty will fix this.
        while (isRunwayEmpty() && !departing.isEmpty()) {
            Plane plane = departing.poll();
            if (plane.getFuelAmount() >= fuelNeededForFlight) {
                planeOnRunway = plane;
            } else {
                notEnoughFuel.add(plane);

            }
        }
        /*  If the runway is empty, pick and remove the next plane from the departing queue
            Check if the plane picked next has enough fuel
            If not enough fuel, put the plane in not enough fuel queue, and pick another plane.
        */
    }

    void processPlaneOnRunway() {
        if (!(isRunwayEmpty())) {
            if (planeOnRunway.getRunwayTime() >= departingRunwayTime) {
                departed.add(planeOnRunway);
                removePlaneFromRunway();
            } else {
                planeOnRunway.incrementTimeOnRunway();
            }

        }

        /*  Check if the plane on runway's queue time met the runway time
            If it did, add to the departed queue and remove the plane from runway
            Else, just increment it's queue time
        */
    }

    void processRunway() {

        decrementFuelOfAllPlanes();
        processDepartingQueue();
        processPlaneOnRunway();
        /*  Decrement fuel for all the planes
            Process the departing queue
            Process the plane on runway
        */

    }

    void printSimulationInfo() {
        System.out.printf("\nSimulation time: %d\n", simulationTime);

        System.out.printf("Total Planes: %d\n", totalPlanes);
        System.out.printf("Planes that departed: %d\n", departed.size());
        if (planeDeparting)
            System.out.println("Plane on runway: 1");
        System.out.printf("Planes that don't have enough fuel: %d\n", notEnoughFuel.size());
    }

    void printDepartedQueue() {
        Iterator<Plane> it = departed.iterator();
        System.out.println("Planes departed queue:");
        while (it.hasNext()) {
            Plane plane = it.next();
            System.out.printf("[%d, %d]->", plane.getId(), plane.getFuelAmount());
        }
        System.out.println();
    }

    void printDepartingQueue() {
        Iterator<Plane> it = departing.iterator();
        System.out.println("Planes departing queue:");
        while (it.hasNext()) {
            Plane plane = it.next();
            System.out.printf("[%d, %d]->", plane.getId(), plane.getFuelAmount());
        }
        System.out.println();
    }


    void printNotEnoughFuelQueue() {
        Iterator<Plane> it = notEnoughFuel.iterator();
        System.out.println("Planes not enough fuel queue:");
        while (it.hasNext()) {
            Plane plane = it.next();
            System.out.printf("[%d, %d]->", plane.getId(), plane.getFuelAmount());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Airport runway = new Airport(50);

        int i = 0;
        do {
            if (i < runway.simulationTime)
                runway.createNewPlane(i + 1);
            // After the simulation time, planes may be left in departing queue. Process them.
            runway.processRunway();
            i++;
        } while (i < runway.simulationTime || runway.departing.size() > 0);

        runway.printSimulationInfo();
        runway.printDepartedQueue();
        runway.printNotEnoughFuelQueue();
    }
}

