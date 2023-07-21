package arrayDemo;

public class ArrayPractice {
    //single variable can take only one value
//int[]age = {20,21,22,23};
    //Array Variable
   String [] name = {"Bashir", "Akshara", "Tarikuzzaman"}; //follows index order ... 0,1,2,...
    //old way-
    //String name[] = name String[3];


    //String name1[] = new String[] {"Bashir","Akshara", "Tarikuzzaman"};

    //what is characteristics of Array --- it is fixed in length
    //Array is Static --- because fixed in length


    public void arrayDemo1(){
//name[0] = "Bashir";
//name[1] = "Akshara";
//name[2] = "Tarikuzzaman";

//        System.out.println("The name of the instructor is " + name[0]);
//        System.out.println("The name of the instructor is " + name[1]);
//        System.out.println("The name of the instructor is " + name[2]);

       // System.out.println("The name of the instructor is " + name[3]);

//
//        for (int i =0; i<name.length; i++) {
//            System.out.println(name[i]);
//        }

        //for each loop
        for (String studentsName:name) {
            System.out.println(studentsName);
        }

        int lengthofArray = name.length;
        System.out.println(lengthofArray);



        /* Very common interview question:
        What are the java exceptions you have encountered
        i.Arrayindexoutofbounderexception
        ii.NumberFormatException
         */

        }

    String students = "Sumaia";
     int i = 2;


    public static void main(String[] args) {
        ArrayPractice obj = new ArrayPractice();
        obj.arrayDemo1();
    }
}
