package scannerDemo;

import java.util.Scanner;

public class ScannerPractice {
    // There is a Scanner class... created by Java
    //Why do we use scanner? We use Scanner to read user input from the console.

    public void myscanner(){
        System.out.println("hello");
        // in means input. We can take user input from the console.
        //out means output. We can print output to the console.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your First Name");
       // scan.nextLine(); //allows you to write in the console and read from the console
        // String Input
        String myName = scan.nextLine();
        System.out.println("I am reading my name from the console " + myName);


        System.out.println("Enter street Address");
        int myStreetAddress = scan.nextInt();
        System.out.println("My Street address is " + myStreetAddress);


        //Homework
        System.out.println("Enter car wheels");
        byte myWheels = scan.nextByte();
        System.out.println("Number of wheels on my car is  " + myWheels);

        System.out.println("Enter Salary");
        long mySalary = scan.nextLong();
        System.out.println("My salary is " + mySalary);

        System.out.println("Enter Mileage");
        short myMileage = scan.nextShort();
        System.out.println(myMileage + " is my mileage");

        System.out.println("Enter Height");
        float myHeight = scan.nextFloat();
        System.out.println("My height is " + myHeight);

        System.out.println("Enter Car Length");
        double myCarlength = scan.nextDouble();
        System.out.println("My Car length is " + myCarlength);

        System.out.println("My car is EV");
        boolean isEV = scan.nextBoolean();
        System.out.println("My car is EV " + isEV);

        System.out.println("My car regNo");
        long regNo = scan.nextLong();
        System.out.println("My car regNo is " + regNo);




    }

    public static void main(String[] args) {
        ScannerPractice obj = new ScannerPractice(); // instantiated the class...
        obj.myscanner();


    }

}
