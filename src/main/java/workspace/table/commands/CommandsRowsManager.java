package workspace.table.commands;

import workspace.table.managers.MenuRowsOutputManager;
import workspace.table.objects.Table;
import workspace.table.objects.TableRows;

import java.util.Scanner;

public class CommandsRowsManager {

    private Table table;
    private int userChoice;

    public CommandsRowsManager(Table table) {
        this.table = table;
        this.userChoice = 0;
    }

    public void run() {
        MenuRowsOutputManager menuRowsOutputManager = new MenuRowsOutputManager();
        while(userChoice != menuRowsOutputManager.getMaxChoice()) {
            userChoice = menuRowsOutputManager.getUserMenu();
            runCommands();
        }
    }

    private void runCommands() {
        Scanner scanner = new Scanner(System.in);
        if (userChoice == 1) {
            System.out.println("Enter Row's name:");
            this.table.addNewRow(scanner.next());
        } else if(userChoice == 2) {
            System.out.println("Enter Row's ID to remove:");
            int rowId = scanner.nextInt();
            for (TableRows row:table.getTableRows()) {
                if(row.getEntityId() == rowId) {
                    table.deleteRow(row.getEntityId());
                }
            }
        } else if(userChoice == 3) {
            System.out.println("Enter Row's ID to update:");
            int rowId = scanner.nextInt();
            for (TableRows row:table.getTableRows()) {
                if(row.getEntityId() == rowId) {
                    System.out.println("Enter new Row's name:");
                    this.table.updateRow(rowId, scanner.next());
                }
            }
        } else if(userChoice == 4) {
            System.out.println(this.table);
        }
    }
}
