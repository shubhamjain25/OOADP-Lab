import java.util.*;

public class Store extends Subject{

    String name;
    float discount;
    ArrayList<Observer> ol;

    Store(String name, float discount){
        this.discount=discount;
        this.name=name;
        ol = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        ol.add(o);
        System.out.println("Added Customer "+o+" to Store "+name);
    }

    @Override
    public void unregister(Observer o) {
        ol.remove(ol.indexOf(o));
        System.out.println("Removed Customer "+o+" from Store "+name);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:ol)
            o.update(discount);
    }

    void setDiscount(String festival, float d){
        discount=d;
        System.out.println("New Discount Offer on Account of "+festival);
        notifyObservers();
    }


}
