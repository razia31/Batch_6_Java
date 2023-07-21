package myFirstPackage;

public class Cars { // Curly braces

    // properties --- Variables
    // Functions --- Methods


    // What is class --- logical entity
    // What is object --- physically exist, that has some properties and value

    /* Cars ---class

    Properties .... values
    color --- white, black, blue
    wheels --- 4
    mirrors --- 2

    object...

    my car
    your car

    Students ---class

    hands - 2
    grade - 5
    books - true
    uniform - true
    studentID - 101


    Class is a blueprint--- replica


    Teacher ---
    Cow -

    cars --- class

    properties --- color, wheels, backdoor, back mirror, engine --- how the object looks like
    behaviour --- run fast, speed faster, change the gear, carries goods --- how it functions

    my car,
    Jewel's car
    Ashraf's car
    your car

    we can not write anything outside the class boundary because the compiler can not
    compile it & it will be an error

    */

    // camel case ---
    // Package always starts with lower case, no space but the other words should be upper case
    // Class always starts with upper case, no space but the other words should be upper case

    // different different values are called Data Types

     /* Data Types

    Primitive (old) data types --- starts with lowercase

    byte      Stores whole numbers from -128 to 127
    short     Stores whole numbers from -32,768 to 32,767
    int	      Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long      Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double    Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean	  Stores true or false values
    char	  Stores a single character/letter or ASCII values

    Non-Primitive (new) Data Types --- starts with uppercase
    String
    Class
    Array

      */

    //Variables has three parts -- i. Declaring ii.defining/initializing iii. using

    // I can declare variables inn two places i. inside class ii.inside method
    // when I declare inside class --- this is called instance/ global Variable
    // when I declare variable inside any method --- that is called local variable
     byte wheels;
     short milage;
      int regNo;
      //long ---
     float height;
     double length;
     boolean isEV;
     char FirstLetter;
       String color;



//
//    byte wheels = 4;
//    short milage = 32767;
//    int regNo = 2147483647;
//
//    //long ---
//    //need to indicate it is float value
//    float height = 3.235455f;
//    double length = 100.85085205235825;
//    boolean isEV = false;
//    char FirstLetter = 'T';
//    String color = "Red";

/* Is Java is 100% object-oriented Programming Language ---
   Answer --- Because of primitive data types. these are not class... i cannot create objects of
   primitive data types...

 */

   public void speed() { //Functions --- Method -- custom method
       System.out.println("Car can be operated speedily");

   }
   public void changingGear() {  // Functions --- Method -- custom method
    System.out.println("Gear can be changed frequently in the car");
    }

// IDE -- Integrated Development Environment

    public static void main(String[] args) {  //special method given by Java itself
       // whatever command I pass here, it will run

        byte wheels = 4;  //declaring ---- local variable
        wheels = 4; //defining/initializing
        short milage = 32767;
        int regNo = 2147483647;

        //long ---
        //need to indicate it is float value
        float height = 3.235455f;
        double length = 100.85085205235825;
        boolean isEV = false;
        char FirstLetter = 'T';
        String color = "Red";

        System.out.println(wheels);
        System.out.println(milage);
        System.out.println(length);
        System.out.println(isEV);
        System.out.println(FirstLetter);
        System.out.println(color);

        System.out.println("---------------------------------------------------");

        Cars mycar = new Cars(); //object of the cars class

        mycar.wheels = 4;
        mycar.milage = 32767;
        mycar.regNo = 2147483647;
        mycar.height = 3.235455f;
        mycar.length = 100.85085205235825;
        mycar.isEV = false;
        mycar.FirstLetter = 'n';
        mycar.color = "Red";

        System.out.println(mycar.wheels);
        System.out.println(mycar.milage);
        System.out.println(mycar.length);
        System.out.println(mycar.isEV);
        System.out.println(mycar.FirstLetter);
        System.out.println(mycar.color);

        //calling the method/function
        mycar.speed();
        mycar.changingGear();

        System.out.println("---------------------------------------------------");


        Cars jewelscar= new Cars();

        jewelscar.wheels = 4;
        jewelscar.milage = 32334;
        jewelscar.regNo = 214343647;
        jewelscar.height = 3.2343455f;
        jewelscar.length = 100.853352525;
        jewelscar.isEV = true;
        jewelscar.FirstLetter = 'M';
        jewelscar.color = "White";

        System.out.println(jewelscar.wheels);
        System.out.println(jewelscar.milage);
        System.out.println(jewelscar.length);
        System.out.println(jewelscar.isEV);
        System.out.println(jewelscar.FirstLetter);
        System.out.println(jewelscar.color);

        //calling the method
        jewelscar.speed();
        jewelscar.changingGear();
    }


}
