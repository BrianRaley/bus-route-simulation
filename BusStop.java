/**
 * BusStop class represents an instance of a bus stop with a
 * queue of waiting passengers. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;

public class BusStop {
    private int stopID;     // # of this bus stop
    private String stopName;  // name of this bus stop
    private ArrayList<Passenger> waitingPassengers;
}
