package old.commands;


import old.objects.Stereo;

public class StereoOnCommand implements Command{

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(3);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
