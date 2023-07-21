package accessModifier;

public class Amodifier_2 extends Amodifier_1{

    public static void main(String[] args) {
        Amodifier_2 obj = new Amodifier_2();
        System.out.println(obj.minute);
      //  System.out.println(obj.hour);
        System.out.println(obj.day);

        obj.printMinute();
     //   obj.printHour();
        obj.printDay();
    }
}
