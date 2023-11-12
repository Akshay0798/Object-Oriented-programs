package Interface;

public class Car implements Engine,Break {

    //these are abstract method
    @Override
    public void Disk_break() {
        System.out.println("calling Disk_break method inside Car");
    }

    @Override
    public void start() {
        System.out.println("calling start method inside Car");
    }

    @Override
    public void stop() {
        System.out.println("calling stop method inside Car");
    }

    @Override
    public void acc() {
        System.out.println("calling acc method inside Car");
    }
}
