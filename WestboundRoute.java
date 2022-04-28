import java.util.ArrayList;

public class WestboundRoute {
    public ArrayList<TrainStop> westbound = new ArrayList<TrainStop>();
    TrainStop STOP_1 = new TrainStop(1, "Lindenwold", 10, 20, 2);
    TrainStop STOP_2 = new TrainStop(2, "Ashland", 10, 20, 1);
    TrainStop STOP_3 = new TrainStop(3, "Woodcrest", 10, 20, 3);
    TrainStop STOP_4 = new TrainStop(4, "Haddonfield", 10, 20, 2);
    TrainStop STOP_5 = new TrainStop(5, "Westmont", 10, 20, 2);
    TrainStop STOP_6 = new TrainStop(6, "Collingswood", 10, 20, 2);
    TrainStop STOP_7 = new TrainStop(7, "Ferry Avenue", 10, 20, 4); 
    TrainStop STOP_8 = new TrainStop(8, "Broadway", 10, 20, 2);  
    TrainStop STOP_9 = new TrainStop(9, "City Hall", 10, 20, 5);
    TrainStop STOP_10 = new TrainStop(10, "8th & Market St.", 10, 20, 2);
    TrainStop STOP_11 = new TrainStop(11, "9/10th & Locust St.", 10, 20, 1);
    TrainStop STOP_12 = new TrainStop(12, "12/13th & Locust St.", 10, 20, 1); 
    TrainStop STOP_13 = new TrainStop(13, "15/16th & Locust St.", 10, 20, 0);
        
    public WestboundRoute() {
        westbound.add(STOP_1);
        westbound.add(STOP_2);
        westbound.add(STOP_3);
        westbound.add(STOP_4);
        westbound.add(STOP_5);
        westbound.add(STOP_6);
        westbound.add(STOP_7);
        westbound.add(STOP_8);
        westbound.add(STOP_9);
        westbound.add(STOP_10);
        westbound.add(STOP_11);
        westbound.add(STOP_12);
        westbound.add(STOP_13);
    }

    public ArrayList<TrainStop> getWestboundRoute() {
        return westbound;
    }

    public int size() {
        return westbound.size();
    }

    public String toString() {
        return westbound.toString();
    }

    //public int getTimeToNextStop(int index) {
    //    return westbound.get(index).getTimeToNextStop();
    //}
}
