package workspace.table.objects;

import java.util.ArrayList;
import java.util.Random;

public class RandomizedEntityIDs {

    private static int randomMax = 1000;

    private ArrayList<Integer> allRandomizedNumbers;

    public RandomizedEntityIDs() {
        this.allRandomizedNumbers = new ArrayList<>();
    }

    public int randomizeNum() {
        Random rand = new Random();
        // Generate random integers in range 0 to randomMax.
        int randInt = rand.nextInt(randomMax);

        // Checking if the number doesn't already exist in table.
        while(allRandomizedNumbers.contains(randInt)) {
            randInt = rand.nextInt(randomMax);
        }
        return randInt;
    }

}
