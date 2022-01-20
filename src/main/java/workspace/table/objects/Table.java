package workspace.table.objects;

import workspace.table.commands.TableCommands;

import java.util.ArrayList;

public class Table implements TableCommands {

    private String tableName;
    private ArrayList<TableRows> tableRows;
    private RandomizedEntityIDs randomizedEntityIDs;

    public Table(String tableName) {
        this.tableName = tableName;
        this.tableRows = new ArrayList<>();
        randomizedEntityIDs = new RandomizedEntityIDs();
    }

    public String getTableName() {
        return tableName;
    }

    @Override
    public void deleteTable() {
        this.tableRows.clear();
    }

    @Override
    public void printTable() {
        for (TableRows col: this.tableRows) {
            System.out.println(col);
        }
    }

    @Override
    public void addNewRow(String entityName) {
        this.tableRows.add(new TableRows(entityName, this.randomizedEntityIDs));
    }

    public TableRows getRow(int rowId) {
        for (TableRows row: tableRows) {
            if(row.getEntityId() == rowId) {
                return row;
            }
        }
        return null;
    }

    @Override
    public void deleteRow(int rowId) {
        this.tableRows.remove(getRow(rowId));
    }

    @Override
    public void updateRow(int rowId, String updatedName) {
        getRow(rowId).setEntityName(updatedName);
    }

    @Override
    public void searchRow(int rowId, TableRows searchDetails) {

    }

    public String printRow(int rowId) {
        return (getRow(rowId)).toString();
    }

    public ArrayList<TableRows> getTableRows() {
        return tableRows;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableName='" + tableName + '}';
    }
}
