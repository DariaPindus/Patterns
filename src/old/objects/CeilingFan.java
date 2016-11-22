package old.objects;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan() {
        speed = OFF;
    }
    public void high() {
        speed = HIGH;
        System.out.println("Ceiling Fan was set in high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan was set in medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling Fan was set in low");
    }

    public void off() {
        System.out.println("Ceiling Fan was turned off");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
