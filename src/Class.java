public class Class {
    public static  class myClass{
        int x;
        int y;
        public  myClass(){
            x = 8;
            y = 9;
        }
        public int sum(){
            return x+y;
        }
    }
    public static void main(String[] args) {
        myClass myObj = new myClass();
        System.out.println(myObj.sum());
        System.out.println(myObj.sum());
    }
}
