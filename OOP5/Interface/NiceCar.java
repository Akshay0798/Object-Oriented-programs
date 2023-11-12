package Interface;

public class NiceCar {
    //this car will have own engine
    private Engine engine;
    private Media mediaplayer = new CDPlayer();

    public NiceCar() {
        engine = new Power_Engine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        mediaplayer.start();
    }

    public void stopMusic() {
        mediaplayer.stop();
    }

    public void upgradeEngine() {
        this.engine = new Electric_Engine();
    }
}
