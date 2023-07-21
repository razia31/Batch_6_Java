package oopConcept.polymorphismDemo;

public class OverRidingSub extends OverRidingSuper{
    // Create a method about Upright Course and add location
@Override
    public void UprightCourse(){
//        String group = "Selenium";
//        System.out.println("This is our group "+ group);
//        int duration = 4;
//        int numberofTopics = 6;
    super.UprightCourse();
        String location= "USA";
        System.out.println(location);

}

    public static void main(String[] args) {
        OverRidingSub obj = new OverRidingSub();
        obj.UprightCourse();
    }


    }