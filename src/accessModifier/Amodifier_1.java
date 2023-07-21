package accessModifier;

public class Amodifier_1 {
    /*
    Public  variables and methods are accessible across the project.

    Private variables and methods are accessible only its own class.
    To solve this issue we use encapsulation.

    No access/Package Private variables and methods are accessible only within its own package.
    To solve this issue we use protected Access modifier.

     */

    public int minute = 60;
    private int hour = 24;
    protected String day = "Wednesday"; //No access/Package Private

    public void printMinute(){
        System.out.println("public AM");
    }
    private void printHour(){
        System.out.println("private AM");
    }
    protected void printDay(){
        System.out.println("PackagePrivate AM");
    }


    public static void main(String[] args) {
        Amodifier_1 obj = new Amodifier_1();
        System.out.println(obj.minute);
        System.out.println(obj.hour);
        System.out.println(obj.day);

        obj.printMinute();
        obj.printHour();
        obj.printDay();
    }

}
