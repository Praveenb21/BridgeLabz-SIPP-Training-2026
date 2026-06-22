public class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("--------------------------");
    }

    // Display all Cars
    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("\n===== Cars =====");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    // Display all Bikes
    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n===== Bikes =====");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP80AB101", "Praveen", "Car");
        vehicles[1] = new Vehicle("UP80AB102", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP80AB103", "Amit", "Car");
        vehicles[3] = new Vehicle("UP80AB104", "Rohit", "Bike");
        vehicles[4] = new Vehicle("UP80AB105", "Sohan", "Car");
        vehicles[5] = new Vehicle("UP80AB106", "Mohan", "Bike");
        vehicles[6] = new Vehicle("UP80AB107", "Ankit", "Car");
        vehicles[7] = new Vehicle("UP80AB108", "Vikas", "Bike");
        vehicles[8] = new Vehicle("UP80AB109", "Karan", "Car");
        vehicles[9] = new Vehicle("UP80AB110", "Deepak", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}