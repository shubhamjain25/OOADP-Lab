package PracticeAbstractfactory;

public class PatternClient {
    public static void main(String[] args){
        SportsCategoryFactory reg1 = new RegularSportsFactory();
        reg1.getIndoorRegularSports().getSports();
        reg1.getOutdoorRegularSports().getSports();

        SportsCategoryFactory reg2 = new DifferentlyAbledSportsFactory();
        reg2.getIndoorRegularSports().getSports();
        reg2.getOutdoorRegularSports().getSports();
    }
}
