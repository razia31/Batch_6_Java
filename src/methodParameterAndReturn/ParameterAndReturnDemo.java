package methodParameterAndReturn;

public class ParameterAndReturnDemo {


//when the method states Void that means it is empty and there is no return
    public void add(int x, int y){ //this line is called method signature.. declared..parameterize
        int z = x+y;
        int a = z;
       // System.out.println(a);
      //  System.out.println(z);


       // System.out.println(x-y); //use
       // System.out.println(x+y);
       // System.out.println(x*y);
       // System.out.println(x/y);

    }
    //When the method states int that means there must be a return and it should be in integer form
  public int substract(int x, int y){
      int z = x-y;
      int a = z;
     // System.out.println("hi"); //this will not print because we are only supposed to get return in integer value

      return z;


  }

  public String studentsName(String name){
        return name;
  }


  public boolean gender(){
        boolean isMale = true;

        return isMale;
  }




    public static void main(String[] args) {
        ParameterAndReturnDemo obj = new ParameterAndReturnDemo();
       // obj.add( 5, 4); //called the method
       // System.out.println("----------------------------------------------------");
        //obj.add(9,10);

      //  obj.substract(20,5); // this is not going to return anything without it being assigned as follows:

        int newValue = obj.substract(20,5);
        System.out.println(newValue); //returning a particular data type

        String newName = obj.studentsName("Bashir");
        System.out.println(newName);

        boolean myGender = obj.gender();
        System.out.println(myGender);



    }


}

