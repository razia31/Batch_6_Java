package finalKeyword;

public final class FinalSuper {

    /*

       Final variable cannot be modified

       Final method cannot be overridden

       Final class cannot be extended

     */

    final String name = "Bashir"; // instance variable

    //Once we make a variable Final,we can not update it

    public void UprightTechSolution(){

        String mode = "online";
    }


    public static void main(String[] args) {
        FinalSuper obj = new FinalSuper();
      //  obj.name= "Tipu";

        System.out.println(obj.name);
    }

}
