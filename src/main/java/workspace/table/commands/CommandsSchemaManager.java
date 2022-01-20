package workspace.table.commands;

import workspace.table.objects.SchemasManager;
import workspace.table.objects.Schema;

import java.util.Scanner;

public class CommandsSchemaManager {

    private SchemasManager schemasManager;

    public CommandsSchemaManager(SchemasManager schemasManager) {
        this.schemasManager = schemasManager;
    }

    public void runCommand(int userChoice) {
        Scanner scanner = new Scanner(System.in);
        if(userChoice == 1) {
            System.out.println("Enter schemas' name:");
            schemasManager.getSchemas().add(new Schema(scanner.next()));
        } else if (userChoice == 2) {
            System.out.println("Enter schemas' name:");
            String schemaName = scanner.next();
            for (Schema schema:schemasManager.getSchemas()) {
                if(schema.getSchemaName().equals(schemaName)) {
                    CommandsTableManager commandsTableManager = new CommandsTableManager(schema);
                    commandsTableManager.run();
                }
            }
        } else if (userChoice == 3) {
            System.out.println(schemasManager);
        }
    }
}
