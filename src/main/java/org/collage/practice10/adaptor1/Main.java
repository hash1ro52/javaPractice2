package org.collage.practice10.adaptor1;

public class Main {
    public static void main(String[] args) {
        DatabaseAdapter mysqlAdapter = new MySQLDatabaseAdapter("mysql://localhost:3306/db");
        DatabaseController mysqlController = new DatabaseController(mysqlAdapter);
        mysqlController.performOperations();

        DatabaseAdapter postgresAdapter = new PostgreSQLDatabaseAdapter("postgres://localhost:5432/db");
        DatabaseController postgresController = new DatabaseController(postgresAdapter);
        postgresController.performOperations();
    }
}
