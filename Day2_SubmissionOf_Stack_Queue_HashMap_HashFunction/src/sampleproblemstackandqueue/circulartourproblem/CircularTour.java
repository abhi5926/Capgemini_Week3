package sampleproblemstackandqueue.circulartourproblem;

public class CircularTour {

    static class PetrolPump {
       // Attributes
        int petrol;
        int distance;
        // Creating Constructor
        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
   // Method
    public static int tour(PetrolPump[] pumps, int n) {
        int start = 0;
        int surplusPetrol = 0;
        int deficitPetrol = 0;

        // Traverse all pumps
        for (int i = 0; i < n; i++) {
            surplusPetrol += pumps[i].petrol - pumps[i].distance;


            if (surplusPetrol < 0) {
                // Reset the starting point to the next pump
                start = i + 1;
                deficitPetrol += surplusPetrol;
                surplusPetrol = 0;
            }
        }

        // If total surplus petrol + deficit is >= 0, a valid tour exists
        return (surplusPetrol + deficitPetrol >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        // Test case
        PetrolPump[] pumps = new PetrolPump[] {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5),
                new PetrolPump(3, 4)
        };

        int n = pumps.length;

        int result = tour(pumps, n);
        if (result == -1) {
            System.out.println("No solution exists");
        } else {
            System.out.println("The circular tour can be started at pump " + result);
        }
    }
}

