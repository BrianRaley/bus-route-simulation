import java.util.ArrayList;

public class EastboundRoute {
    public ArrayList<TrainStop> eastbound = new ArrayList<TrainStop>();
    TrainStop STOP_1 = new TrainStop(1, "15/16th & Locust St.", 10, 20, 1);
    TrainStop STOP_2 = new TrainStop(2, "12/13th & Locust St.", 10, 20, 1);
    TrainStop STOP_3 = new TrainStop(3, "9/10th & Locust St.", 10, 20, 2);
    TrainStop STOP_4 = new TrainStop(4, "8th & Market St.", 10, 20, 5);
    TrainStop STOP_5 = new TrainStop(5, "City Hall", 10, 20, 1);
    TrainStop STOP_6 = new TrainStop(6, "Broadway", 10, 20, 3);
    TrainStop STOP_7 = new TrainStop(7, "Ferry Avenue", 10, 20, 2); 
    TrainStop STOP_8 = new TrainStop(8, "Collingswood", 10, 20, 2);  
    TrainStop STOP_9 = new TrainStop(9, "Westmont", 10, 20, 2);
    TrainStop STOP_10 = new TrainStop(10, "Haddonfield", 10, 20, 3);
    TrainStop STOP_11 = new TrainStop(11, "Woodcrest", 10, 20, 2);
    TrainStop STOP_12 = new TrainStop(12, "Ashland", 10, 20, 3); 
    TrainStop STOP_13 = new TrainStop(13, "Lindenwold", 10, 20, 0);
        
    public EastboundRoute() {
        eastbound.add(STOP_1);
        eastbound.add(STOP_2);
        eastbound.add(STOP_3);
        eastbound.add(STOP_4);
        eastbound.add(STOP_5);
        eastbound.add(STOP_6);
        eastbound.add(STOP_7);
        eastbound.add(STOP_8);
        eastbound.add(STOP_9);
        eastbound.add(STOP_10);
        eastbound.add(STOP_11);
        eastbound.add(STOP_12);
        eastbound.add(STOP_13);
    }

    public ArrayList<TrainStop> getEastboundRoute() {
        return eastbound;
    }

    public int size() {
        return eastbound.size();
    }

    public String toString() {
        return eastbound.toString();
    }
}
