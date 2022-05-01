package ch14_Command.receiver;

public class Stereo {

    String cd;
    String location;
    int volume = 11;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo on!!");
    };
    public void off() {
        System.out.println(location + " Stereo off!!");
    };

    public void setCD(String cd) {
        this.cd = cd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
