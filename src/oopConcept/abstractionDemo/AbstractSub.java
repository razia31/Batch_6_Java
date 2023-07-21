package oopConcept.abstractionDemo;

public class AbstractSub extends AbstractSuper{

//This class is for implementation

    public void placeOder() {
        super.cardDetails();
        System.out.println(customerName);
        System.out.println(customerCardNo);
        System.out.println(cardExpDate);
        System.out.println(cardCvv);
        System.out.println("Sending the info to the bank database");

    }


    public void reduceAmount() {
        System.out.println("Reduce Amount");

    }


    public static void main(String[] args) {
        AbstractSub obj = new AbstractSub();
        obj.placeOder();
        obj.reduceAmount();
    }
}
