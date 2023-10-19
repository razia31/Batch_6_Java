package interviewPrep;

import java.util.Scanner;

public class ConditionalStatement {

    public void ifElse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grades: ");
        int grade = sc.nextInt();

        if (grade > 80) {
            System.out.println("The grade is A");
        } else if ((grade > 60) && (grade == 80)) {
            System.out.println("The grade is B");

        } else if ((grade > 50) && (grade == 60)) {
            System.out.println("The grade is C");
        } else if ((grade > 45) && (grade == 50)) {
            System.out.println("The grade is D");
        } else if ((grade > 25) && (grade == 45)) {
            System.out.println("The grade is E");
        } else if ((grade < 25)) {
            System.out.println("The grade is F");
        }
    }

    public static void main(String[] args) {
        ConditionalStatement obj = new ConditionalStatement();
        obj.ifElse();
    }
}
