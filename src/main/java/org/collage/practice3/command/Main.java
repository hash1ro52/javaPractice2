package org.collage.practice3.command;

public class Main {
    public static void main(String[] args) {
        WindowController controller = new WindowController();

        AbstractCommand copyCommand = new CopyCommand();
        AbstractCommand cutCommand = new CutCommand("Sample text", 2);
        AbstractCommand insertCommand = new InsertCommand("Inserted text", 5);

        controller.addCommand(copyCommand);
        controller.addCommand(cutCommand);
        controller.addCommand(insertCommand);

        System.out.println("Executing all commands:");
        controller.executeAllPendingCommands();

        System.out.println("\nUndoing last 2 commands:");
        controller.undoCommand(2);
    }
}