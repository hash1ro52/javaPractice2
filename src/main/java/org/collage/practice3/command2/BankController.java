package org.collage.practice3.command2;

import java.util.ArrayList;
import java.util.List;

public class BankController {
    private List<AbstractCommand> commandsToExecute = new ArrayList<>();
    private List<AbstractCommand> commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commandsToExecute.add(command);
    }

    public void executeAllPendingCommands() {
        for (AbstractCommand command : commandsToExecute) {
            command.execute();
            commandHistory.add(command);
        }
        commandsToExecute.clear();
    }

    public void undoCommand(int changesToUndo) {
        for (int i = 0; i < changesToUndo && !commandHistory.isEmpty(); i++) {
            AbstractCommand command = commandHistory.remove(commandHistory.size() - 1);
            command.undo();
        }
    }
}


