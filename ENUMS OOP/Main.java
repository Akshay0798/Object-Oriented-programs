public class Main {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,saturday,Sunday;
        //these are enum constant
        //every single one is public, static and final
        //since it is final u can create a child enums
        //type is Week
//         Week() {
//                    System.out.println("Constructor called for " + this); //calling everything bcoz
//                }

        @Override
        public void Hello() {
            System.out.println("yo");
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // this is not the enum concept, thats why
        // internally: public static final Week Monday = new Week();


        }


        public static void main(String[] args) {
        Week weeek;
        weeek=Week.Friday;
        weeek.Hello();

        System.out.println(Week.valueOf("Monday"));//returning a enums constant



//        for(Week day:Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(weeek.ordinal()); //position in its enum declaration

    }
}