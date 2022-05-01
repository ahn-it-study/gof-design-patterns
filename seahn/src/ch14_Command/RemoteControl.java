package ch14_Command;


import ch14_Command.commands.Command;
import ch14_Command.commands.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    private static final int commandSize = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[commandSize];
        offCommands = new Command[commandSize];

        Command noCommand = new NoCommand();
        for (int i = 0; i < commandSize; i++ ) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] == null) return;
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        if (onCommands[slot] == null) return;
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public void allOn() {
        System.out.println("All Light on");
        for (int i = 0; i < commandSize; i++ ) {
            onCommands[i].execute();
        }
    }

    public void allOff() {
        System.out.println("All Light off");
        for (int i = 0; i < commandSize; i++ ) {
            offCommands[i].execute();
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--------Remote Control --------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append(onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
