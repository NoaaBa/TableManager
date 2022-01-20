package workspace.table.objects;

import java.util.ArrayList;

public class Schema {

    private String schemaName;
    private ArrayList<Table> tables;

    public Schema(String schemaName) {
        this.schemaName = schemaName;
        this.tables = new ArrayList<>();
    }

    public String getSchemaName() {
        return schemaName;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Schema{" +
                "schemaName='" + schemaName + '\'' +
                ", tables=" + tables +
                '}';
    }
}
