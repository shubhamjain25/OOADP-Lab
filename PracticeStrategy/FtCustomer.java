public class FtCustomer extends DecathlonCustomer{

    FtCustomer(String name, int age){
        super(name, age);
        dc = new DiscountType2();
    }

    @Override
    void display() {
        System.out.println("Hi there first time customer");
        super.display();
    }
}
