package oopConcept.inheritanceDemo;

public class InheritancePractice3 extends InheritancePractice2{

    String timeZone;
    String State;


    public static void main(String[] args) {
        InheritancePractice3 obj = new InheritancePractice3();
        obj.name = "Tarikuzzaman";
        obj.location = "Chicago";

        obj.hello();

     //   InheritancePractice2 obj2 = new InheritancePractice2();
        obj.Zip = 43354;
        obj.group = "Selenium";
        obj.timeZone = "EST";
        obj.State = "New York";


    }
}
