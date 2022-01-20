package workspace.table;

import workspace.table.commands.CommandsSchemaManager;
import workspace.table.managers.MenuSchemaOutputManager;
import workspace.table.objects.SchemasManager;

public class Main {

    public static void main(String[] args) {
        runCommandsInput();
    }

    public static void runCommandsInput() {
        MenuSchemaOutputManager menuManager = new MenuSchemaOutputManager();
        SchemasManager schemasManager = new SchemasManager();
        schemasManager.loadSchemas();

        int userMenuChoice = 0;
        while (userMenuChoice != menuManager.getMaxChoice()) {
            userMenuChoice = menuManager.getUserMenu();
            runSchema(userMenuChoice, schemasManager);
        }

        // All schemas are updated whenever the program ends.
        schemasManager.updateSchemas();
    }

    public static void runSchema(int userChoice, SchemasManager schemasManager) {
        CommandsSchemaManager commandsSchemaManager = new CommandsSchemaManager(schemasManager);
        commandsSchemaManager.runCommand(userChoice);
    }

}
