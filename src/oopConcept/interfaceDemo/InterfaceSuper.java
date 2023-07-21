package oopConcept.interfaceDemo;

public interface InterfaceSuper {

    /*
    Interface and abstraction are pretty similar concept

    Interface also hiding the implementation and showing only functionality

    But interface is 100% abstraction that means there cannot be a non-abstract method in an
    Interface

    Any variable you add in the Interface are final by default

     */

    String customerName = "Bashir";
    int customerCardNo = 545440854;
    int cardExpDate = 1224;
    int cardCvv = 857;


    public void placeOder();



    public void reduceAmount();

}
