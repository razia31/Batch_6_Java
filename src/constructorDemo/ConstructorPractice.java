package constructorDemo;

public class ConstructorPractice {
/* Constructor is a special method that hold the same name as class. We can parameterize the constructor
and give argument while creating an object.

There are two types of constructor:
i. Parameterized
ii. Default

Constructor won't return anything.
 */
    String name;
    int id;
    String location;
    boolean isMale;

    public ConstructorPractice(String name,int id,String location,boolean isMale){
       this. name = name;
       this. id = id;
       this. location = location;
       this. isMale = isMale;

    }

    public ConstructorPractice(){ //default parameterized
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice("Arafat",101, "New York", true);
//        obj.name = "Arafat";
//        obj.id = 101;
//        obj.location = "New York";
//        obj.isMale = true;

        System.out.println(obj.name +" "+obj.id +" "+obj.location+" "+obj.isMale);


        System.out.println("----------------------------");

        ConstructorPractice obj2 = new ConstructorPractice("Suriya",102,"New Jersey",false);
//        obj2.name = "Suriya";
//        obj2.id = 102;
//        obj2.location = "New Jersey";
//        obj2.isMale = false;

        System.out.println(obj2.name +" "+obj2.id +" "+obj2.location+" "+obj2.isMale);


        System.out.println("----------------------------");

        ConstructorPractice obj3 = new ConstructorPractice("Sarita",103,"Texas",false);
//        obj3.name = "Sarita";
//        obj3.id = 103;
//        obj3.location = "Texas";
//        obj3.isMale = false;

        System.out.println(obj3.name +" "+obj3.id +" "+obj3.location+" "+obj3.isMale);

        ConstructorPractice obj4 = new ConstructorPractice();
    }
}
