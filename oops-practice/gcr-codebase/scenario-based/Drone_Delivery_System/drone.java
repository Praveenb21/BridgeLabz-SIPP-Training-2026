public class drone {
    private String droneId;
    private int batteryPercentage;

    static String companyName = "Sky Logistics";

    public drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println(droneId + " started delivery.");
        } else {
            System.out.println(droneId + " cannot start delivery. Battery too low!");
        }
    }
    
    public void displayStatus() {
        System.out.println("\nDrone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {

        drone d1 = new drone("D101", 80);
        drone d2 = new drone("D102", 50);
        drone d3 = new drone("D103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("\nShared Company Name:");
        System.out.println(drone.companyName);
    }
}
