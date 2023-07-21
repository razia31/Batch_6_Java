package myFirstPackage;

public class Students {
    //variables or properties
    // the following variables are global variables.
    String name;
    int studentID;
    char gender;
    String group;
    static String schoolName = "Upright Tech Solutions"; //Static variable/Class variable

    public static void study(){ //custom method

        String location; // Local variable---born inside the method and die inside the same method.
        // Local variable of one method can not be used in another method.

        location = "USA";
        System.out.println(location);

        System.out.println("Students study to prepare the homework");
    }

    public void exam(){ //custom method
        int Zipcode;
        System.out.println("Students prepare for the exam every quarter of the year");
        study();
    }


    public static void main(String[] args) {
        Students obj = new Students(); // object of the "Students" class // Instantiate the class.
        //obj is reference variable.

        obj.name = "Arafat"; // initialize means assigning a value to the variable/ defining the variable
        obj.studentID = 101;
        obj.gender = 'M';
        obj.group = "Selenium";
       // obj.schoolName = "Upright Tech Solutions";


        System.out.println("The first name of the student is " + obj.name); //Using the Variable
        //When we merge String and a variable---we need to use + sign. the + sign called here concatenation.
        System.out.println(obj.studentID + " is the studentID number");
        System.out.println("The gender of the student is " + obj.gender);
        System.out.println( "The group that the student belongs to is " + obj.group);
        System.out.println("School name is " + schoolName);

        study();
        obj.exam();

        System.out.println("------------------------------------------");

        Students obj2 = new Students(); //Reference variable

        obj2.name = "Farzana"; // initialize means assigning a value to the variable/ defining the variable
        obj2.studentID = 102;
        obj2.gender = 'F';
        obj2.group = "API Testing";
        //obj2.schoolName = "Upright Tech Solutions";

        System.out.println(obj2.name + " is the first name of the student");
        System.out.println(obj2.studentID);
        System.out.println(obj2.gender);
        System.out.println(obj2.group);
        System.out.println(schoolName);

        study();
        obj2.exam();
    }


}
