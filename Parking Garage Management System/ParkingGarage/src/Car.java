class Car {
    String make;
    String licensePlate;
    boolean isParked;
    boolean inGarage;

    // Parameterized constructor
    public Car(String sentMake, String sentLicensePlate) {
        make = sentMake;
        licensePlate = sentLicensePlate;
        isParked = false;
        inGarage = false;
    }

    // Default constructor
    public Car() {
        this.make = "";
        this.licensePlate = "";
        this.isParked = false;
        this.inGarage = false;

    }

    public void parkCar() {
        this.isParked = true;
        this.inGarage = true;
        System.out.println("Parking '" + this.make + "' with license plate " + this.licensePlate);
    }

    public boolean isParked() {
        return this.isParked;
    }

    public void leaveGarage() {
        this.inGarage = false;
        this.isParked = false;
        System.out.println("Checking out '" + this.make + "' with license plate " + this.licensePlate);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String sayParkedStatus() {
        if (!(this.isParked)) {
            return ("Not parked.");
        } else {
            return ("Parked");
        }
    }

    @Override
    public String toString() {
        return ("Make: " + this.make + " License Plate: " + licensePlate + " Status: " + sayParkedStatus());
    }
}

