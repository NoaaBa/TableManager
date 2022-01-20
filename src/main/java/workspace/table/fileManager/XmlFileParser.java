package workspace.table.fileManager;

import workspace.table.managers.PropertiesFilesHandler;
import workspace.table.objects.Schema;
import workspace.table.objects.SchemasManager;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class XmlFileParser {
    public void parseFile() {
        try {
            FileInputStream file = new FileInputStream(new PropertiesFilesHandler().getDataSavedLocation());
            JAXBContext jaxbContext = JAXBContext.newInstance(SchemasManager.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            SchemasManager que = (SchemasManager) jaxbUnmarshaller.unmarshal(file);

            ArrayList<Schema> list=que.getSchemas();
            for(Schema ans:list) {
                System.out.println(
                        ans
                );
            }
        } catch (JAXBException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
