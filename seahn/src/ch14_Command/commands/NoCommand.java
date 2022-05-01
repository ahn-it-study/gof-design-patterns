package ch14_Command.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no slot");
    }

    @Override
    public void undo() {
        System.out.println("no slot");
    }
}
