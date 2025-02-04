package org.collage.practice10.adaptor1;

public class MySQLDatabaseAdapter implements DatabaseAdapter {
    private String url;

    public MySQLDatabaseAdapter(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connected to MySQL: " + url);
    }

    public void disconnect() {
        System.out.println("Disconnected from MySQL: " + url);
    }

    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
