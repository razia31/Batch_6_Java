package javaOperators;

public class JavaOperatorsDemo {

    //Arithmatic
    //Relational
    //Logical Operator
    //Assignment Operator

    public static void arithmaticOperators(){
        //Arithmatic operators are ---- +,- ,* ,/ ...

        int a = 20;
        int b = 9;
        int result = 0;
        //default value of int is 0, default value of String is null, default value of boolean is false

        result = a+b;
        System.out.println(result);

        result = a-b;
        System.out.println(result);

        result = a*b;
        System.out.println(result);

       // float height = 5.5f;
      //  System.out.println(height);

        float height = 20/9f;
        System.out.println(height);
        float fraction = (float) a/b; //type casting
        System.out.println(fraction);

        // type casting---trying to forcefully put bigger number in shorter storage
       // byte      Stores whole numbers from -128 to 127
       // short     Stores whole numbers from -32,768 to 32,767

        byte wheels = 4;
        short x = wheels;
        System.out.println(x);

        short regNo = 32767;
       // byte y = (byte) regNo; //we do not do this because it will crash
        //System.out.println(y);


    }

    public static void relationalOperators(){
        // relational Operators are >, <, >=, <=, !=, will return boolean Value
        int a = 20;
        int b = 9;
        boolean result = false;

        result = a>b;
        System.out.println(result);

        result = a<b;
        System.out.println(result);

        result = a>=b; //greater or equal
        System.out.println(result);

        result = a!=b; //not equal
        System.out.println(result);

    }

    public static void logicalOperators(){
        //logical Operators are && (and), || (or), also return boolean value

        int a = 20;
        int b = 9;
        int c = 5;

        boolean result1 = (a>b) && (b<c);
        System.out.println(result1);

        boolean result2 = (b<a) || (a>c);
        System.out.println(result2);

        boolean result3 = (a>b) || (b<a) && (a<c);
        System.out.println(result3);


    }

    public static void main(String[] args) {
      //  JavaOperatorsDemo obj = new JavaOperatorsDemo();
     //   obj.arithmaticOperators();
        arithmaticOperators();

        System.out.println("------------------------------------");

        relationalOperators();

        System.out.println("------------------------------------");

        logicalOperators();

    }
}
