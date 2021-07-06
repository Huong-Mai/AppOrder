package com.hmai.firstapp.model;

import java.io.Serializable;

public class Table implements Serializable {
    private String idTable;
    private String tableName;
    private String tableStatus;

    public Table() {
    }

    @Override
    public String toString() {
        return "Table{" +
                "idTable='" + idTable + '\'' +
                ", tableName='" + tableName + '\'' +
                ", tableStatus='" + tableStatus + '\'' +
                '}';
    }

    public String getIdTable() {
        return idTable;
    }

    public void setIdTable(String idTable) {
        this.idTable = idTable;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }
}
