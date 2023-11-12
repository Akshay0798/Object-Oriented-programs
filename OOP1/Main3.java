public class Main3 {
    public static void main(String[] args) {
//        sttudent std=new sttudent();
//        System.out.println(std.mark);
//
//        sttudent std2=new sttudent(2,"supriya",101);
//        System.out.println(std2.mark);

        sttudent one=new sttudent();
        System.out.println(one.namee);

        sttudent two=one;
        one.namee="Suppu";
        System.out.println(two.namee);
    }
}
class sttudent {
    int rol;
    String namee;
    float mark;

    sttudent(){
        this.rol=1;
        this.namee ="Akshay";
        this.mark=100.0f;
    }

    sttudent(int roll,String name,float marks){
        //here this will replace with std2
        this.rol=roll;
        this.namee=name;
        this.mark=marks;
    }
}
