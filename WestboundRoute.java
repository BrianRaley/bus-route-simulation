/**
 * This class represents the Westbound Patco route.
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;

public class WestboundRoute {
    public ArrayList<TrainStop> westbound = new ArrayList<TrainStop>();
    TrainStop STOP_1 = new TrainStop(1, "Lindenwold", 0, 8, 2, -1);
    TrainStop STOP_2 = new TrainStop(2, "Ashland", 0, 4, 1, 3);
    TrainStop STOP_3 = new TrainStop(3, "Woodcrest", 0, 6, 3, 2);
    TrainStop STOP_4 = new TrainStop(4, "Haddonfield", 0, 4, 2, 3);
    TrainStop STOP_5 = new TrainStop(5, "Westmont", 0, 4, 2, 2);
    TrainStop STOP_6 = new TrainStop(6, "Collingswood", 0, 3, 2, 2);
    TrainStop STOP_7 = new TrainStop(7, "Ferry Avenue", 0, 5, 4, 2); 
    TrainStop STOP_8 = new TrainStop(8, "Broadway", 0, 10, 2, 3);  
    TrainStop STOP_9 = new TrainStop(9, "City Hall", 0, 4, 5, 1);
    TrainStop STOP_10 = new TrainStop(10, "8th & Market St.", 0, 22, 2, 5);
    TrainStop STOP_11 = new TrainStop(11, "9/10th & Locust St.", 0, 4, 1, 2);
    TrainStop STOP_12 = new TrainStop(12, "12/13th & Locust St.", 0, 5, 1, 1); 
    TrainStop STOP_13 = new TrainStop(13, "15/16th & Locust St.", 0, 22, -1, 1);
        
    /**
     * Constructor - adds all stops to the route
     */
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

    /**
     * Returns an ArrayList of TrainStops on this route
     * @return ArrayList<TrainStop> westbound
     */
    public ArrayList<TrainStop> getWestboundRoute() {
        return westbound;
    }

    /**
     * Returns the number of TrainStops within the Westbound route
     * @return size of the Westbound route ArrayList
     */
    public int size() {
        return westbound.size();
    }

    /**
     * toString method
     */
    public String toString() {
        return westbound.toString();
    }
}