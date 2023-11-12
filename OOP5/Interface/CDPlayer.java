package Interface;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("inside CDPlayer Media start");

    }

    @Override
    public void stop() {
        System.out.println("inside CDPlayer Media stop");
    }
}
