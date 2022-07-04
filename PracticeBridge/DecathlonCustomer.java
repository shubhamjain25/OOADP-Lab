public abstract class DecathlonCustomer {
    String name;
    String typeOfCust="";
    int age;
    Discount d;

    DecathlonCustomer(String name, int age, Discount d){
        this.name = name;
        this.age = age;
        this.d = d;
    }

    void setDiscount(Discount newDiscount){
        d = newDiscount;
    }

    void showDetails(float billAmt){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Type: "+typeOfCust);
        System.out.println("Amount: "+billAmt);
        System.out.println("Discount: "+d.calculateDiscount(billAmt));
        System.out.println("Amt Payable: "+(billAmt - d.calculateDiscount(billAmt)));
        System.out.println("<------------------------->");
    }
}
