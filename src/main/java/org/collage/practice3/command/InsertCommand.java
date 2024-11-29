package org.collage.practice3.command;

public class InsertCommand extends AbstractCommand{
    private String text;
    private int insertPosition;

    public InsertCommand(String text, int insertPosition) {
        this.text = text;
        this.insertPosition = insertPosition;
    }

    @Override
    public void execute() {
        System.out.println("Executing Insert Command: Inserting text '" + text + "' at position " + insertPosition);
    }

    @Override
    public void undo() {
        System.out.println("Undoing Insert Command: Removing text '" + text + "' from position " + insertPosition);
    }
}