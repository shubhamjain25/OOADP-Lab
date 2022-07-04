public class PatternClient {
    public static void main(String[] args){
        DecathlonCustomer c1 = new FstCustomer("Shubham", 20, new Discount1());
        c1.showDetails(1000);

        c1.setDiscount(new Discount2());
        c1.showDetails(1000);

        c1.setDiscount(new Discount3());
        c1.showDetails(1000);
    }
}
