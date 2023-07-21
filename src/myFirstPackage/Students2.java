package myFirstPackage;

public class Students2 {

    public static void main(String[] args) {
        Students obj3 = new Students();

        obj3.name = "Lisa";
        obj3.gender = 'F';
        obj3.studentID = 103;

        System.out.println(obj3.name);
        System.out.println(obj3.gender);
        System.out.println(obj3.studentID);

        System.out.println(Students.schoolName);
        Students.study();
    }
}
