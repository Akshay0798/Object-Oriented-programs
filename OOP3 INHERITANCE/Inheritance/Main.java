package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(2,4,6);
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        Box box1=new Box(new Box(4));
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        BoxWeight box2=new BoxWeight();
        System.out.println(box2.h +" "+ box2.weight) ;

        BoxWeight box3=new BoxWeight(2,4,6,80);
        System.out.println(box3.w +" "+ box3.weight);


    }
}
