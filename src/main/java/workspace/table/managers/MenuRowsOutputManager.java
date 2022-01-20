package workspace.table.managers;

import java.util.Scanner;

public class MenuRowsOutputManager {
    private int maxChoice = 5;

    public int getUserMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "1) Add a new row.\n2) Delete a row.\n" +
                "3) Update row.\n4) Print rows.\n5) Exit.");

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
