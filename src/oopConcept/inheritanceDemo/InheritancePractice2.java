package oopConcept.inheritanceDemo;

public class InheritancePractice2 extends InheritancePractice {

    int Zip;
    String group;


    public static void main(String[] args) {
        InheritancePractice2 obj = new InheritancePractice2();
        obj.name= "Bashir";
        obj.location= "New York";

        obj.hello();

        obj.Zip = 11254;
        obj.group = "Selenium";
    }
}
