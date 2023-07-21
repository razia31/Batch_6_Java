package controlFlowStatements;

public class Loop {
    static int limit = 5;
    public static void loopIntro(){
        //Please print 1 to 10
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        //how many kinds of loop are there? i. While loop ii. For loop iii. for each loop (Array) iv.Do-While loop
        /*how many parts of the loop?
        i.initialization
        ii.condition
        iii.execution
        iv.increment/decrement
         */

    }

    /*public static void whileLoop(){
        int a = 1; // Initialize
        while (a<=10) { //condition
            System.out.println("the value of a " + a); //statement
            a++; //Increment
        }

    }

    public static void whileLoop (int limit){
        int a = 1;
        while (a<=limit){
            System.out.println("the value of a "+ a);
            a++;
        }
    }*/

    public static void whileLoop (int initialize,int limit) { //parameterization
        int a = initialize; //initialize
        while (initialize <= limit) { //condition
            System.out.println("the value of a " + initialize); //statement
            initialize++; //Increment
        }
    }
    public static void whileLoop2() { //number of iteration is unknown
        int a = 50; // Initialization
        while (a >= 1) { //condition
            System.out.println("the value of a " + a); //statement
            a= a - 2; //decrement/ increment
        }
    }

    public static void forLoop(){ //number of iteration is already known
        for (int i = limit; i>=1; i--){
            System.out.println("The value of a " + i);
        }

 }

    public void doWhileLoop(){
        int y = 5; //initialization
        do{
            System.out.println("the value of y "+ y); //statement
            y++; //Increment/decrement
        }
        while (y<=10); // Condition
 }
 //can you implement Fibonacci sequence using loop
    /*
    0 (FN), 1(SN), 1(TN), 2, 3, 5, 8, 13, 21 --- We actually use this to pointing our stories, size the stories.

     */

    public void fibonacci(){
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 1; i<=7; i++){
           int thirdNumber= firstNumber+secondNumber;

           firstNumber=secondNumber;
           secondNumber=thirdNumber;

            System.out.println(thirdNumber);

        }
    }

    public void shape(){
      //shape-1
        /*
 *
 **
 ***
 ****
 *****
 ******
 *******
        */
        for (int i= 1; i<=10; i++){ //creating rows

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");


  /*      //shape-2
 *******
 ******
 *****
 ****
 ***
 **
 *
    */
        int n= 10;
        for (int i =0; i<n; i++){
            for (int j = i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
// loopIntro();
//
//  whileLoop(50,100); //call the method... giving an argument (giving a value)
//
//  whileLoop2();
//
//  forLoop();

       Loop obj = new Loop(); //
     //  obj.forLoop(); //
      //  obj.doWhileLoop();
       // obj.fibonacci();
        obj.shape();

    }
}
