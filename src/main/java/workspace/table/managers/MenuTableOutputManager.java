package workspace.table.managers;

import java.util.Scanner;

public class MenuTableOutputManager {

    private int maxChoice = 5;

    public int getUserMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "1) Create a table.\n2) Delete table.\n" +
                "3) Print schema's table.\n4) Work on an existing table.\n5) Exit.");

        int userChoice = scanner.nextInt();
        while (!checkUserChoice(userChoice)) {
            System.out.println("Invalid input. Please enter a number from 1-" + maxChoice + ":");
            userChoice = scanner.nextInt();
        }
        return userChoice;
    }

    public boolean checkUserChoice(int userChoice) {
        if ((userChoice) < 0 || (userChoice > maxChoice)) {
            return false;
        }
        return true;
    }

    public int getMaxChoice() {
        return maxChoice;
    }
}
