package workspace.table.objects;

import java.time.LocalDate;

public class TableRows {

    private int entityId;
    private String entityName;
    private LocalDate dateEntityCreated;

    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

    public TableRows(String entityName, RandomizedEntityIDs randomizedEntityIDs) {
        this.entityName = entityName;
        this.entityId = randomizedEntityIDs.randomizeNum();
        this.dateEntityCreated = LocalDate.now();
    }

    public int getEntityId() {
        return entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public LocalDate getDateEntityCreated() {
        return dateEntityCreated;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setDateEntityCreated(LocalDate dateEntityCreated) {
        this.dateEntityCreated = dateEntityCreated;
    }

    @Override
    public String toString() {
        return "Row{" +
                "entityId=" + entityId +
                ", entityName='" + entityName + '\'' +
                ", dateEntityCreated=" + dateEntityCreated +
                '}';
    }
}
