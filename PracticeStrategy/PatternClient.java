public class PatternClient {

    public static void main(String[] args){

        RgCustomer c1 = new RgCustomer("Shubham", 20);
        c1.display();
        c1.calculateDiscount(1000);

        System.out.println("<--------------->");

        FtCustomer c2 = new FtCustomer("Jain", 25);
        c2.display();
        c2.calculateDiscount(1000);
    }

}
