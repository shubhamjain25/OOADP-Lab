public class RgCustomer extends DecathlonCustomer{

    RgCustomer(String name, int age){
        super(name, age);
        dc = new DiscountType1();
    }

    @Override
    void display() {
        System.out.println("Welcome back regular customer");
        super.display();
    }
}
