public class Customer extends Observer{

    String name;
    float discount;
    Subject st;

    Customer(Subject st, String name){
        this.name=name;
        this.st = st;
        st.register(this);
    }

    void update(float discount) {
        // TODO Auto-generated method stub
        this.discount=discount;
        System.out.println(name+ ",you get a discount of "+discount+"%");
    }

    public String toString(){
        return name;
    }
}
