package ch14_Command.commands;

import ch14_Command.receiver.Light;
import ch14_Command.receiver.Stereo;

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("모짜르트");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
