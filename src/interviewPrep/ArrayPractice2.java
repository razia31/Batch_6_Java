package interviewPrep;

public class ArrayPractice2 {
    //find even or odd numbers from the following list... 2, 3, 4,6, 7 ,9

    int[] numbers = {2, 3, 4, 6, 7, 9};
    public void arrayDemo2() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);


            if (numbers[i] %2 == 0) {
                System.out.println(numbers[i] + " This is an even number");
            } else if (numbers[i] %2 != 0) {
                System.out.println(numbers[i] + " This is an odd number");
            }
        }

    }

    public static void main(String[] args) {
        ArrayPractice2 obj = new ArrayPractice2();
        obj.arrayDemo2();
    }
}
