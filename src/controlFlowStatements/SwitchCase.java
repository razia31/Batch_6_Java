package controlFlowStatements;

public class SwitchCase {

    int a = 5;
    public void switchCaseStatement(){
        switch (a){

            case 1 :
                System.out.println("the value of a is 1");
                break;
            case 2 :
                System.out.println("the value of a is 2");
                break;
            case 3 :
                System.out.println("the value of a is 3");
                break;
            case 4 :
                System.out.println("the value of a is 4");
                break;
            case 5 :
                System.out.println("the value of a is 5");
                break;
            case 6 :
                System.out.println("the value of a is 6");
        }
    }

    public static void main(String[] args) {

        SwitchCase obj = new SwitchCase();
        obj.switchCaseStatement();

    }
}
