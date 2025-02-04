package org.collage.practice9.proxy1;

public class DBAccessProxy implements DatabaseAccess {
    private DBAccess dbHandle;

    public DBAccessProxy(String url) {
        this.dbHandle = new DBAccess(url);
    }

    @Override
    public String executeQuery(int queryNumber) {
        System.out.println("[LOG] Executing query: " + queryNumber);
        String result = dbHandle.executeQuery(queryNumber);
        System.out.println("[LOG] Query executed");
        return result;
    }

    @Override
    public boolean commit() {
        return dbHandle.commit();
    }

    @Override
    public void rollback() {
        dbHandle.rollback();
    }
}
