public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age,String name) {
        this.age = age;
        this.name=name;
        this.arr=new int[]{3,4,5,6,7};
    }
    public Human(Human other) {
        this.age = other.age;
        this.name=other.name;
    }
//    public Object clone() throws CloneNotSupportedException{
//        //shallow copy
//        return super.clone();
//    }

    //deep copy
        public Object clone() throws CloneNotSupportedException {
            Human supriya = (Human) super.clone();
            //it isn't pointed it creates new
            supriya.arr=new int[supriya.arr.length];
            for (int i = 0; i < supriya.arr.length; i++) {
                supriya.arr[i] = this.arr[i];
            }
          return supriya;
        }
}

