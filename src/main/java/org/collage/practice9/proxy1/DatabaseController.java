package org.collage.practice9.proxy1;

public class DatabaseController {
    private DatabaseAccess dbHandle;

    public DatabaseController(DatabaseAccess dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient() {
        System.out.println(dbHandle.executeQuery(1));
    }

    public void removeClient() {
        System.out.println(dbHandle.executeQuery(2));
    }
}
