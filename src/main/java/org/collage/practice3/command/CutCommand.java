package org.collage.practice3.command;

public class CutCommand extends AbstractCommand{
    private String text;
    private int startLine;

    public CutCommand(String text, int startLine) {
        this.text = text;
        this.startLine = startLine;
    }

    @Override
    public void execute() {
        System.out.println("Executing Cut Command: Cutting text '" + text + "' from line " + startLine);
    }

    @Override
    public void undo() {
        System.out.println("Undoing Cut Command: Restoring text '" + text + "' to line " + startLine);
    }
}
