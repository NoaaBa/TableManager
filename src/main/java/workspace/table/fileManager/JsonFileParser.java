package workspace.table.fileManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import workspace.table.objects.Schema;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonFileParser extends JsonManager {

    public ArrayList<Schema> JsonParser() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Schema> schemas = new ArrayList<>();
        Type schemaListType = new TypeToken<ArrayList<Schema>>(){}.getType();

        //ArrayList<Schema> schemas = gson.fromJson(userJson, userListType);

        int fileNum = 0, counter = 0;
        try {
            while (counter != getMaxJsonInFile()) {
                counter++;
                if (counter == getMaxJsonInFile()) {
                    schemas = gson.fromJson(new FileReader(getFileLocation() + fileNum), schemaListType);
                    fileNum++;
                    counter = 0;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file");
        }
        return schemas;
    }
}
