public class Snooker extends GamesOnTable{

    Sports sp;

    Snooker(Sports sp){
        this.sp = sp;
    }

    @Override
    public int getCurrentStock() {
        return 2+sp.getCurrentStock();
    }
}
