package Electric_Vehicle_Charging;
public class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.5; // Rs per unit

    // Instance Variables
    private String stationId;
    private double unitsConsumed;

    // Constructor
    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill 
    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    public void displayStationDetails() {
        System.out.println("\nStation ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate + "/unit");
        System.out.println("Bill Amount: ₹" + calculateBill());
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 90);
        ChargingStation s4 = new ChargingStation("CS104", 200);
        ChargingStation s5 = new ChargingStation("CS105", 175);

        System.out.println("===== Bills at Current Rate =====");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("\nTotal Stations: "
                + ChargingStation.totalStations);

        // Change electricity rate
        ChargingStation.electricityRate = 10.0;

        System.out.println("\n===== Bills After Rate Change =====");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}
