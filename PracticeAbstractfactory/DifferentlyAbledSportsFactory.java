package PracticeAbstractfactory;

public class DifferentlyAbledSportsFactory implements SportsCategoryFactory{

        public OutdoorRegularSports getOutdoorRegularSports(){
            return new Football();
        }


        public IndoorRegularSports getIndoorRegularSports(){
            return new TableTennis();
        }


}
