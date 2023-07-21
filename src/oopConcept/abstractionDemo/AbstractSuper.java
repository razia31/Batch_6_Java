package oopConcept.abstractionDemo;

public abstract class AbstractSuper {
    // Abstraction is a process where we hide the implementation and show only functionality

    //Abstract class cannot be instantiated

    //In an abstract class there can be abstract and non-abstract methods

    //Abstract class can be 0% - 100% abstraction

    String customerName;
    int customerCardNo;
    int cardExpDate;
    int cardCvv;

    public abstract void placeOder();



    public abstract void reduceAmount();

    public void cardDetails(){

        customerName = "Bashir";
        customerCardNo = 545440854;
        cardExpDate = 1224;
        cardCvv = 857;

    }

//    public void moreCardDetails(){
//        cardDetails();
//    }

    public static void main(String[] args) {
      //  AbstractSuper obj = new AbstractSuper();

    }
}
