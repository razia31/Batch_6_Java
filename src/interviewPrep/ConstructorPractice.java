package interviewPrep;

public class ConstructorPractice {
    String name;
    String group;
    int batch;

    public ConstructorPractice(String name, String group, int batch) {
        this.name = name;
        this.group = group;
        this.batch = batch;

    }

    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice("Arafat","Evening",2);
//        obj.name = "Arafat";
//        obj.group = "Evening";
//        obj.batch = 2;

        ConstructorPractice obj1 = new ConstructorPractice("Anjuman","Afternoon",1);
//        obj.name = "Anjuman";
//        obj.group = "Afternoon";
//        obj.batch = 1;

    }
}
