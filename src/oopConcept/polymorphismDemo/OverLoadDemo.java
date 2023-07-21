package oopConcept.polymorphismDemo;

public class OverLoadDemo {

    /* Polymorphism is another OOP Principle. Poly means Many... morphism means form.
    That means many forms.

    That means we can have many forms of method.

    There are two types of Polymorphism:
    i. Method Overloading
    ii. Method Overriding

    Let's say you are working on Three Applications. Each application has different url
    and different login information.

    Method overloading can be achieved by keeping the same method name with different number of
    parameter, different data types, and different order of parameter.

     */

    /**
     * This method is created for www.macys.com
     * @param username
     * @param passsword
     */

    public void login(String username, int passsword){ // method signature
        //www.macys.com
        System.out.println("Macys front-end credential");
    }

    /**
     * This method is created for www.macyscard.com
     * @param username
     * @param pin
     * @param password
     */
    public void login(String username, int pin, int password){
        //www.macyscard.com
        System.out.println("Macy's card credential");
    }

    /**
     * This method is created for macys backend
     * @param nummber
     * @param hostUsername
     */
    public void login(int nummber, String hostUsername){
        //www.mysql.com
        System.out.println("macy's backend credential");
    }

    public static void main(String[] args) {
        OverLoadDemo obj = new OverLoadDemo();
        obj.login(43545,"Bashir");
        obj.login("Bashir",345);
        obj.login("BashirTipu",123,45456);

    }

}
