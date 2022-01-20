package workspace.table.managers;

import java.util.Scanner;

public class MenuSchemaOutputManager {

    private int maxChoice = 4;

    public int getUserMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "1) Create a schema.\n2) Work on an existing schema.\n" +
                "3) Get list of schemas.\n4) Exit.");

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
