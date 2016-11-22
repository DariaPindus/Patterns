package old;

import old.commands.*;
import old.objects.CeilingFan;
import old.objects.GarageDoor;
import old.objects.Light;
import old.objects.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        GarageDoor door = new GarageDoor();
        CeilingFan fan = new CeilingFan();
        Stereo stereo = new Stereo();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command garageDoorOpen = new GarageDoorOpenCommand(door);
        Command garageDoorClose = new GarageDoorCloseCommand(door);
        Command ceilingOnHigh= new CeilingFanHighCommand(fan);
        Command ceilingOnLow= new CeilingFanDownCommand(fan);
        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        Command[] commands = {lightOff, garageDoorClose, stereoOn};
        Command partyOn = new PartyCommand(commands);
        Command[] commands1 = {lightOn, garageDoorOpen, stereoOff};
        Command partyOff = new PartyCommand(commands1);

        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(2, ceilingOnHigh, ceilingOnLow);
        remoteControl.setCommand(3, stereoOn, stereoOff);
        remoteControl.setCommand(4, partyOn, partyOff);

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
    }
}
