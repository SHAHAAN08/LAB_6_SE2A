
class Distance {

    int kilometers;
    int meters;

    // Constructor
    Distance(int kilometers, int meters) {

        this.kilometers = kilometers;
        this.meters = meters;
    }

    // Method to add two Distance objects
    Distance add(Distance other) {

        int totalMeters = meters + other.meters;

        int totalKilometers =
            kilometers + other.kilometers;

        // Convert extra meters into kilometers
        totalKilometers += totalMeters / 1000;

        totalMeters = totalMeters % 1000;

        return new Distance(
            totalKilometers,
            totalMeters
        );
    }

    // Display distance
    void display() {

        System.out.println(
            kilometers + " KM " + meters + " M"
        );
    }
}

public class MJHTSK {

    public static void main(String[] args) {

        // Create first distance
        Distance d1 = new Distance(5, 750);

        // Create second distance
        Distance d2 = new Distance(3, 600);

        // Add distances
        Distance result = d1.add(d2);

        System.out.print("First Distance: ");
        d1.display();

        System.out.print("Second Distance: ");
        d2.display();

        System.out.print("Total Distance: ");
        result.display();
    }
}
