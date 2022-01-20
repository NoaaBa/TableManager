package workspace.table.fileManager;

import workspace.table.managers.PropertiesFilesHandler;

public class JsonManager {

    private String fileLocation;
    private int maxJsonInFile;

    public JsonManager() {
        PropertiesFilesHandler propertiesFilesHandler = new PropertiesFilesHandler();
        this.fileLocation = propertiesFilesHandler.getDataSavedLocation();
        this.maxJsonInFile = 200;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public int getMaxJsonInFile() {
        return maxJsonInFile;
    }
}
