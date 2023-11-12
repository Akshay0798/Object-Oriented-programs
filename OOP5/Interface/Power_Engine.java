package Interface;

public class Power_Engine implements Engine{
    @Override
    public void start(){
        System.out.println("powerEngine start");
    }

    @Override
    public void stop() {
        System.out.println("powerEngine stop");
    }

    @Override
    public void acc() {
        System.out.println("powerEngine accelerate");
    }

}
