public class demo {
    public static class Print{
       String name = "John" + " " + "Doe";
    }

    public static void main(String[] args) {
        System.out.println("Learning java for  Selenium");
        for(int i = 0; i < 50 ; i++){
            if(i%2==0){
                System.out.println("Even Number : "+i);
            }
            else System.out.println("Odd Number : "+i);
        }
        //class
        Print myObj = new Print();
        System.out.println(myObj.name);
    }
}
