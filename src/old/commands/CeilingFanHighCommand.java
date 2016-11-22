package old.commands;


import old.objects.CeilingFan;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        switch (prevSpeed){
            case CeilingFan.HIGH :
                System.out.println("Is already highest vol");
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.high();
                break;
            case CeilingFan.LOW:
                ceilingFan.medium();
                break;
            case CeilingFan.OFF:
                ceilingFan.low();
                break;
        }
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium ();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
