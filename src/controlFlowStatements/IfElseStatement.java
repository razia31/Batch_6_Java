package controlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {
    //Conditional Statement... it has two parts --- i. condition and ii. block
    //the following variables are global variables...
    int a = 2;
    int b = 4;
    int c = 7;

    /* There are few types of conditional statement

    i. if Statement
    ii. If else Statement
    iii. If else Ladder
    iv. Nested If else
     */


    public void ifStatement (){
        if (a==2){
            System.out.println("a is equal to 2");
            String hi = "hello";
            System.out.println(hi);
        }
    }

    public void ifElseStatement() {
        if (a == 1) {
            System.out.println("a is equal to 1");
        } else { //else is without condition
            System.out.println("the value of a is something else");
        }

        if (b%2 ==0){
            System.out.println("This is a even number");
        }
        else {
            System.out.println("this is a odd number");
        }
    }

    public void ifElseLadder(){
        //int a = 2;
        //int b = 5;
        //int c = 7;

        Scanner scan = new Scanner(System.in);

        System.out.println("Print your a number");
        int a = scan.nextInt();
        System.out.println("Print your b number");
        int b = scan.nextInt();
        System.out.println("Print your c number");
        int c = scan.nextInt();


        if ((a<b)&&(b<c)){
            System.out.println("a<b and b<c");
        }
        else if ((a>c)||(c<b)){
            System.out.println("a>c or c<b");
        }
        else if ((a+b<c)&&(a>b)){
            System.out.println("a+b<c and a>b");
        }
        else {
            System.out.println("nothing matches");
        }
    }

    public void nestedIfElseStatement () {

        //int a = 2;
        //int b = 5;
        //int c = 7;

        if ((a > c) && (c < b)) {
            System.out.println("a<b and b<c");
        } else if ((a > c) || (c < b)) {
            System.out.println("a>c or c<b");
        } else if ((a + b < c) && (a > b)) {
            System.out.println("a+b<c and a>b");
        } else {

            if ((a * b > c) && (a < c)) {
                System.out.println("a*b>c && a<c");
            } else if ((a + b < c) && (a > b)) {
                System.out.println("a+b<c and a>b");
            } else {
                System.out.println("nothing matches");
            }
        }
    }


    public static void main(String[] args) {
        IfElseStatement obj = new IfElseStatement();
       // obj.ifStatement();
        //obj.ifElseStatement();
       // obj.ifElseLadder();
        obj.nestedIfElseStatement();

    }

}
