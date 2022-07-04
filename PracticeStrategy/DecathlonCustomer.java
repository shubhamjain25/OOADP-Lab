public abstract class DecathlonCustomer {

    String name;
    int age;
    DiscountCalculator dc;

    DecathlonCustomer(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){System.out.println("Name: "+name+" Age: "+age);}
    void calculateDiscount(double billAmt){dc.calculateBillAmount(billAmt);}

}
