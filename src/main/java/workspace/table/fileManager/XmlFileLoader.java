package workspace.table.fileManager;

import com.thoughtworks.xstream.XStream;
import workspace.table.managers.PropertiesFilesHandler;
import workspace.table.objects.Schema;
import workspace.table.objects.SchemasManager;
import workspace.table.objects.Table;
import workspace.table.objects.TableRows;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XmlFileLoader {

    public void loadFile(ArrayList<Schema> schemas) {
        XStream xstream = new XStream();
        xstream.alias("rows", TableRows.class);
        xstream.alias("tables", Table.class);
        xstream.alias("schema", Schema.class);
        xstream.addImplicitCollection(SchemasManager.class, "schemas");

        SchemasManager schemaList = new SchemasManager();
        for (Schema schema : schemas) {
            schemaList.getSchemas().add(schema);
            try {
                xstream.toXML(schemaList, new FileWriter(new PropertiesFilesHandler().getDataSavedLocation() + ".xml"));
            } catch (IOException e) {
                System.out.println("Could not parse the data to xml.");
            }
        }
    }
}
