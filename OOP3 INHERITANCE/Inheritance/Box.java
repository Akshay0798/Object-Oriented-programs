package Inheritance;

class Box {
     double l;
     double w;
     double h;

    Box(){
    this.l=-1;
    this.w=-1;
    this.h=-1;
    }

    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double le, double wd, double ht) {
        this.l = le;
        this.w = wd;
        this.h = ht;
    }
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;

    }

    public void Information() {
        System.out.println("Running Box");
    }
}

