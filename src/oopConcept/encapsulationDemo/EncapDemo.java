package oopConcept.encapsulationDemo;

public class EncapDemo {

  private int SSN;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSSN() {
    return SSN;
  }

  public void setSSN(int SSN) {
    this.SSN = SSN;
  }



  public static void main(String[] args) {
    EncapDemo obj = new EncapDemo();
    // obj.SSN = 22345845;
  }
}
