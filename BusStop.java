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

    /**
     * Creates an instance of a bus stop with a stop #, name, 
     * and an ArrayList of waiting Passengers
     * @param stopID
     * @param stopName
     */
    public BusStop(int stopID, String stopName) {
        this.stopID = stopID;
        this.stopName = stopName;
        this.waitingPassengers = new ArrayList<Passenger>();
    }

    /**
     * Returns the ID # of this bus stop
     * @return int stopID
     */
    public int getStopID() {
        return stopID;
    }

    /**
     * Returns the name of this bus stop
     * @return String stopName
     */
    public String getStopName() {
        return stopName;
    }

    /**
     * Adds a Passenger to the wait list
     * @param Passenger p to be added to the wait queue
     */
    public void addWaitingPassenger(Passenger p) {
        waitingPassengers.add(p);
    }

    /**
     * Removes a Passenger from the wait list
     * @param Passenger p to be removed from the wait list
     */
    public void removeWaitingPassenger(Passenger p) {
        waitingPassengers.remove(p);
    }
}
