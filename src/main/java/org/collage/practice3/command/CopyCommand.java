package org.collage.practice3.command;

public class CopyCommand extends AbstractCommand{
    public void execute() {
        System.out.println("Executing Copy Command");
    }

    @Override
    public void undo() {
        System.out.println("Undoing Copy Command");
    }
}