package old.objects;


public class Stereo {
    String cd;
    int vol;

    public void on(){
        System.out.println("Stereo is on");
    }

    public void setCd(){
        this.cd = "Default";
    }

    public void setVolume(int vol){
        this.vol = vol;
    }

    public void off() {
        System.out.println("Stereo is off");
    }
}
