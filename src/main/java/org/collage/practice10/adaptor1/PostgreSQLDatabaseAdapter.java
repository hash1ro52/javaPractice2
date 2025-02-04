package org.collage.practice10.adaptor1;

public class PostgreSQLDatabaseAdapter implements DatabaseAdapter {
    private String url;

    public PostgreSQLDatabaseAdapter(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connected to PostgreSQL: " + url);
    }

    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL: " + url);
    }

    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}
