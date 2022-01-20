package workspace.table.fileManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import workspace.table.objects.Schema;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JsonFileLoader extends JsonManager {

    public void saveSchemaToFile(ArrayList<Schema> schemas) {
       ArrayList<Schema> smallerJson = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        int counter = 0, fileNum = 0;
        try {
            for (Schema schema : schemas) {
                smallerJson.add(schema);
                counter++;
                if (counter == getMaxJsonInFile()) {
                    gson.toJson(smallerJson, new FileWriter(getFileLocation() + fileNum + ".json"));
                    fileNum++;
                    smallerJson.clear();
                    counter = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing CSV to json. " + this.getClass().getName());
        }
    }
}