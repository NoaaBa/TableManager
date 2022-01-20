package workspace.table.managers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesHandler {

    Properties generalProperties = new Properties();

    public PropertiesFilesHandler() {
        String propertiesFilePath = "src/main/resources/SchemaData.properties";
        try (FileInputStream fileProperties = new FileInputStream(propertiesFilePath)) {
            this.generalProperties.load(fileProperties);

        } catch (IOException ex) {
            System.out.println("Couldn't open the files paths locations properties file. " + this.getClass().getName());
        }
    }

    public String getDataSavedLocation() {
        return this.generalProperties.getProperty("dataSaveLocation");
    }
}
