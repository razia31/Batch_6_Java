package interviewPrep;

public class ThrowThrows {
    public void exceptionDemo() throws  Exception {

//            FileInputStream fis = new FileInputStream("text");
//
//        Thread.sleep(3000);

        int []number = new int[3];
        number[0] = 100;
        number[1] = 200;
        number[2] = 300;

        for ( int i=0; i<number.length; i++){
            if (number[i]>2) {
                throw new ArrayIndexOutOfBoundsException("Hi please check the number");
                System.out.println(number[i]);
            }

        }
        }

    public static void main(String[] args) throws Exception {
        ThrowThrows obj = new ThrowThrows();
        obj.exceptionDemo();
    }
}
