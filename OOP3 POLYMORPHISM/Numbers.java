public class Numbers {
    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(1,2);
        obj.sum(3,4,5);

    }
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
