package interviewPrep;

public class LoopArray {
    // I want to print 1-10
    int i = 0;

    public void printNumber() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("the value of i = " + i);
        }

    }

    public static void main(String[] args) {
        LoopArray obj = new LoopArray();
        obj.printNumber();
    }
}


