import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        /**
         * Instantiate all stops with id, name, lower bound of paassengers in an interval,
         * upper bound of paassengers in an interval. (based on data collection for each stop)
         **/
        ArrayList<TrainStop> route = new ArrayList<TrainStop>();
        TrainStop STOP_1 = new TrainStop(1, "Lindenwold", 10, 20);
        route.add(STOP_1);
        TrainStop STOP_2 = new TrainStop(2, "Ashland", 10, 20);
        route.add(STOP_2);
        TrainStop STOP_3 = new TrainStop(3, "Woodcrest", 10, 20);
        route.add(STOP_3);
        TrainStop STOP_4 = new TrainStop(4, "Haddonfield", 10, 20);
        route.add(STOP_4);
        TrainStop STOP_5 = new TrainStop(5, "Westmont", 10, 20);
        route.add(STOP_5);
        TrainStop STOP_6 = new TrainStop(6, "Collingswood", 10, 20);
        route.add(STOP_6);
        TrainStop STOP_7 = new TrainStop(7, "Ferry Avenue", 10, 20);
        route.add(STOP_7);
        TrainStop STOP_8 = new TrainStop(8, "Broadway", 10, 20);
        route.add(STOP_8);
        TrainStop STOP_9 = new TrainStop(9, "City Hall", 10, 20);
        route.add(STOP_9);
        TrainStop STOP_10 = new TrainStop(10, "8th & Market St.", 10, 20);
        route.add(STOP_10);
        TrainStop STOP_11 = new TrainStop(11, "9/10th & Locust St.", 10, 20);
        route.add(STOP_11);
        TrainStop STOP_12 = new TrainStop(12, "12/13th & Locust St.", 10, 20);
        route.add(STOP_12);
        TrainStop STOP_13 = new TrainStop(13, "15/16th & Locust St.", 10, 20);
        route.add(STOP_13);

        // Instatiate bus with id=1, in Lindenwold, with train route access
        Train trainOne = new Train(1, 0, route);
        
        // this loop has the train interact with each stop
        for(int i=0; i<route.size(); i++){
            trainOne.interact();
        }
    }
}
