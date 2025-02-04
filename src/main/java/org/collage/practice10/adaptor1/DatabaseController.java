package org.collage.practice10.adaptor1;

public class DatabaseController {
    private DatabaseAdapter adapter;

    public DatabaseController(DatabaseAdapter adapter) {
        this.adapter = adapter;
    }

    public void performOperations() {
        adapter.connect();
        adapter.executeQuery("SELECT * FROM users");
        adapter.disconnect();
    }
}
