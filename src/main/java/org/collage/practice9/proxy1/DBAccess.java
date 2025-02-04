package org.collage.practice9.proxy1;

public class DBAccess implements DatabaseAccess {
    private String url;
    private boolean isOpen;

    public DBAccess(String url) {
        this.url = url;
        this.isOpen = true;
    }

    @Override
    public String executeQuery(int queryNumber) {
        return "Executing query #" + queryNumber + " on " + url;
    }

    @Override
    public boolean commit() {
        return true;
    }

    @Override
    public void rollback() {
        System.out.println("Rollback executed");
    }
}
