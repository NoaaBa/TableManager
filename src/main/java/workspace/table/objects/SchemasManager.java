package workspace.table.objects;

import workspace.table.fileManager.JsonFileLoader;
import workspace.table.fileManager.JsonFileParser;
import workspace.table.objects.Schema;

import java.util.ArrayList;

public class SchemasManager {

    private ArrayList<Schema> schemas;

    // Function reads schemas from the saved file.
    public SchemasManager() {
        JsonFileParser jsonFileParser = new JsonFileParser();
        this.schemas = jsonFileParser.JsonParser();
    }

    public void updateSchemas() {
        JsonFileLoader jsonFileLoader = new JsonFileLoader();
        jsonFileLoader.saveSchemaToFile(this.schemas);
    }

    public ArrayList<Schema> getSchemas() {
        return this.schemas;
    }

    @Override
    public String toString() {
        return "SchemasManager{" +
                "schemas=" + schemas +
                '}';
    }
}
