public class Billiards extends GamesOnTable{

    Sports sp;
    Billiards(Sports sp){
        this.sp=sp;
    }

    @Override
    public int getCurrentStock() {
        return 2+ sp.getCurrentStock();
    }
}
