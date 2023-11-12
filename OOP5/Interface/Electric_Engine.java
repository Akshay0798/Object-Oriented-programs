package Interface;

public class Electric_Engine implements Engine{
    @Override
    public void start() {
        System.out.println("electricEngine start");
    }

    @Override
    public void stop() {
        System.out.println("electricEngine stop");
    }

    @Override
    public void acc() {
        System.out.println("electricEngine accelerate");
    }
}
