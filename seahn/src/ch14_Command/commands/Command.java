package ch14_Command.commands;

public interface Command {
    void execute();
    void undo();
}
