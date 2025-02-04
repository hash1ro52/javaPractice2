package org.collage.practice9.proxy1;

public class Main {
    public static void main(String[] args) {
        DatabaseAccess db = new DBAccessProxy("jdbc:mysql://localhost:3306/bank");
        DatabaseController controller = new DatabaseController(db);

        controller.addClient();
        controller.removeClient();
    }
}
