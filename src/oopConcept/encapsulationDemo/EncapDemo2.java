package oopConcept.encapsulationDemo;

public class EncapDemo2 {


    public static void main(String[] args) {
        EncapDemo obj = new EncapDemo();
        obj.setSSN(22345845);
      int mySSN = obj.getSSN();
        System.out.println(mySSN);

        obj.setName("Razia");
        String myName = obj.getName();
        System.out.println(myName);

    }
}
