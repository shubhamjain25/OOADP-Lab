public class PatternClient {

    public static void main(String[] args){

        Sports sp1=new IndoorSports();
        System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());
        sp1=new Billiards(sp1);
        System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());

        sp1 = new Snooker(sp1);
        System.out.println("Total Indoor Sports Stock:"+sp1.getCurrentStock());
    }

}
