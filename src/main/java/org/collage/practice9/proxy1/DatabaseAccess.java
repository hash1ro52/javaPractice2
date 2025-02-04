package org.collage.practice9.proxy1;

public interface DatabaseAccess {
    String executeQuery(int queryNumber);
    boolean commit();
    void rollback();
}
