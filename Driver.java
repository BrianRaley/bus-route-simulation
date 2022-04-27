import java.util.ArrayList;
public class Driver {
    static int time = 0;
    public static void main(String[] args) {

        /**
         * Instantiate all stops with id, name, lower bound of paassengers in an interval,
         * upper bound of paassengers in an interval. (based on data collection for each stop)
         **/
        //ArrayList<TrainStop> route = new ArrayList<TrainStop>();
        
        
        //WestboundRoute westbound = new WestboundRoute();

        // Instatiate bus with id=1, in Lindenwold, with train route access
        //Train trainOne = new Train(1, 0, westbound.getWestboundRoute());
        
        // this loop has the train interact with each stop
        //for(int i=0; i<westbound.size(); i++){
        //    trainOne.interact();
        //}

        
        Timelapse t = new Timelapse();
        t.start();
        
    }
}
