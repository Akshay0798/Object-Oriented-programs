package Interface;

public class Main {
    public static void main(String[] args) {
//        Car obj=new Car();
//        obj.Disk_break();

        //in media also have start stop and engine also
        //if I want only engine start stop
//        Engine obj1 = new Car();
//        obj1.stop();

        NiceCar obj3=new NiceCar();
        obj3.start(); //it will be default one
        obj3.startMusic();
        obj3.upgradeEngine();
        obj3.start();
    }
}
