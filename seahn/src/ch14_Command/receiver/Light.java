package ch14_Command.receiver;

public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light on!!");
    };
    public void off() {
        System.out.println(location + " Light off!!");
    };
}
