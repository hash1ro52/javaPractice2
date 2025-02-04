package org.collage.practice10.adaptor1;

public interface DatabaseAdapter {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
