public class DiscountType2 implements DiscountCalculator{
    double discount=0.50;

    @Override
    public void calculateBillAmount(double billAmt) {
        System.out.println("Bill Amount before discount: "+billAmt);
        double discountAmt = billAmt*discount;
        System.out.println("Discount for the user: "+discountAmt);
        System.out.println("Final Price to be paid by the user: "+(billAmt-discountAmt));
    }
}
