
public class ParkingGarage {

    Car spot1;
    Car spot2;
    Car spot3;
    Car emptySpot = new Car("", "");

    private ParkingGarage() {

        this.spot1 = emptySpot;
        this.spot2 = emptySpot;
        this.spot3 = emptySpot;
    }

    private void parkCar(Car car) {
        if (!(this.spot1.isParked())) {
            this.spot1 = car;
            spot1.parkCar();
        } else if (!(this.spot2.isParked())) {
            this.spot2 = car;
            spot2.parkCar();
        } else if (!(this.spot3.isParked())) {
            this.spot3 = car;
            spot3.parkCar();
        } else {
            System.out.println("Sorry, all spots are full");
        }
    }


    private void checkOutCar(String license) {
        if ((this.spot1.getLicensePlate()).equals(license)) {
            this.spot1.leaveGarage();
            this.spot1 = emptySpot;

        } else if ((this.spot2.getLicensePlate()).equals(license)) {
            this.spot2.leaveGarage();
            this.spot2 = emptySpot;
        } else if ((this.spot3.getLicensePlate()).equals(license)) {
            this.spot3.leaveGarage();
            this.spot3 = emptySpot;
        }
    }


    private void viewAvailableSlots() {
        System.out.println("Available slots: ");
        System.out.print("Spot 1: ");
        if (spot1.isParked()) {
            System.out.println("Occupied by " + spot1.getLicensePlate());
        } else {
            System.out.println("Available");
        }
        System.out.print("Spot 2: ");
        if (spot2.isParked()) {
            System.out.println("Occupied by " + spot2.getLicensePlate());
        } else {
            System.out.println("Available");
        }
        System.out.print("Spot 3: ");
        if (spot3.isParked()) {
            System.out.println("Occupied by " + spot3.getLicensePlate());
        } else {
            System.out.println("Available");
        }

    }


    public static void main(String[] args) {
        ParkingGarage garage = new ParkingGarage();

        Car car1 = new Car("Toyota Camry", "ABC123");
        Car car2 = new Car("Ford Mustang", "XYZ789");
        Car car3 = new Car("Honda Pilot", "aBc123");
        garage.viewAvailableSlots();
        garage.parkCar(car1);
        garage.parkCar(car2);
        garage.viewAvailableSlots();
        garage.checkOutCar(car1.getLicensePlate());
        garage.viewAvailableSlots();

    }
}