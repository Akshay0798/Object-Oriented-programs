public class Main {
    public static void main(String[] args) {
        Human akshu =new Human(25,"Akshay",21000,true);
        Human suppu =new Human(27,"Supriya",21000,true);
        Human msd =new Human(39,"Mahi",2100000,true);


        System.out.println(akshu.name);
        System.out.println(suppu.name);


        System.out.println(Human.population);//use like that,only class
//        System.out.println(suppu.population);//don't use like that


    }
}