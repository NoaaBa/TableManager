package workspace.table.commands;

import workspace.table.managers.MenuTableOutputManager;
import workspace.table.objects.Schema;
import workspace.table.objects.Table;

import java.util.Scanner;

public class CommandsTableManager {

    private Schema schema;
    private int userChoice;

    public CommandsTableManager(Schema schema) {
        this.schema = schema;
        this.userChoice = 0;
    }

    public void run() {
        MenuTableOutputManager menuTableOutputManager = new MenuTableOutputManager();
        while(userChoice != menuTableOutputManager.getMaxChoice()) {
            userChoice = menuTableOutputManager.getUserMenu();
            runCommands();
        }
    }

    private void runCommands() {
        Scanner scanner = new Scanner(System.in);
        if (userChoice == 1) {
            System.out.println("Enter Table's name:");
            this.schema.getTables().add(new Table(scanner.next()));
        } else if(userChoice == 2) {
            System.out.println("Enter Table's name to remove:");
            String tableName = scanner.next();
            schema.getTables().removeIf(table -> table.getTableName().equals(tableName));
        } else if(userChoice == 3) {
            System.out.println(schema);
        } else if(userChoice == 4) {
            System.out.println("Enter Table's name to work on:");
            String tableName = scanner.next();
            for (Table table:schema.getTables()) {
                if(table.getTableName().equals(tableName)) {
                    CommandsRowsManager commandsRowsManager = new CommandsRowsManager(table);
                    commandsRowsManager.run();
                }
            }
        }
    }

}
