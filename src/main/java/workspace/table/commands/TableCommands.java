package workspace.table.commands;

import workspace.table.objects.TableRows;

public interface TableCommands {
    public void deleteTable();
    public void printTable();

    public void addNewRow(String entityName);
    public void deleteRow(int rowId);
    public void updateRow(int rowId, String updatedName);
    public void searchRow(int colId, TableRows searchDetails);
}
