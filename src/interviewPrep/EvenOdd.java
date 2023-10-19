package interviewPrep;

public class EvenOdd {
    /*

     */
    int number = 3;

    public void evenOdd(){
        //Any variable inside the method is called local variable
        if (number%2 == 0){
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd(); // I am creating an object of the class. instantiated the class
        //  creating an instance of the class
        obj.evenOdd();
    }
}
