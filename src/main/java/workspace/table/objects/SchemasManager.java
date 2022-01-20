package workspace.table.objects;

import workspace.table.fileManager.XmlFileLoader;
import workspace.table.fileManager.XmlFileParser;

import java.util.ArrayList;

public class SchemasManager {

    private ArrayList<Schema> schemas;

    public SchemasManager() {
        this.schemas = new ArrayList<>();
    }

    // Function reads schemas from the saved file.
    public void loadSchemas() {
        XmlFileParser xmlFileParser = new XmlFileParser();
        xmlFileParser.parseFile();
    }

    // Function loads the schemas details into a file.
    public void updateSchemas() {
        XmlFileLoader xmlFileLoader = new XmlFileLoader();
        xmlFileLoader.loadFile(this.schemas);
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
