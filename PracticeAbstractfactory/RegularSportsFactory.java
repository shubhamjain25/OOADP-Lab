package PracticeAbstractfactory;

public class RegularSportsFactory implements SportsCategoryFactory{

    public OutdoorRegularSports getOutdoorRegularSports(){
        return new Cricket();
    }


    public IndoorRegularSports getIndoorRegularSports(){
        return new Badminton();
    }

}
