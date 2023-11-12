public class Singalton2 {
    public static void main(String[] args) {
        Abcd obj = Abcd.getInstance();
    }
}
class Abcd{
    public static Abcd obj=new Abcd();//obj static it simply means this static object will be created
    // and its beyond memory when class is loded so it wiill be global variable,
    //so even you are not using an object it will be in your memory
    //so it calls eagerly instance creation
    private Abcd(){
        System.out.println("instance created");
    }
    public static Abcd getInstance()
    {
        if (obj==null){
            obj=new Abcd();
        }
        //obj=new Abcd();
        return obj;
    }
}
