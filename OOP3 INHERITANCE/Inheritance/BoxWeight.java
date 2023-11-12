package Inheritance;
//child class
public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=65;
    }

    public BoxWeight(double le, double wd, double ht, double weight) {
        super(le, wd, ht); //super : calling parent class constructor
        //used to initialized value present in parent class
        this.weight = weight;
    }
}

