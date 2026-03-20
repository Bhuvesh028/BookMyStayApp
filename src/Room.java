// Abstract Room class representing a generic hotel room
public abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sq ft");
        System.out.println("Price per night: $" + pricePerNight);
    }
}

// SingleRoom class extending Room
class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 200, 75.0);
    }
}

// DoubleRoom class extending Room
class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 350, 120.0);
    }
}

// SuiteRoom class extending Room
class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 600, 250.0);
    }
}

// Main application to create rooms and display availability
class HotelApp {
    public static void main(String[] args) {
        // Create room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details for Single Room
        System.out.println("=== Single Room ===");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        // Display details for Double Room
        System.out.println("\n=== Double Room ===");
        dbl.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        // Display details for Suite Room
        System.out.println("\n=== Suite Room ===");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);

        System.out.println("\nApplication finished.");
    }
}