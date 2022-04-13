/**
 * BusStop class represents an instance of a bus stop with a
 * queue of waiting passengers. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;

public class TrainStop {
    private int stopID;     // # of this bus stop
    private String stopName;  // name of this bus stop
    private ArrayList<Passenger> waitingPassengers;
    private int lowerBound;
    private int upperBound;

    /**
     * Creates an instance of a bus stop with a stop #, name, 
     * and an ArrayList of waiting Passengers
     * @param stopID
     * @param stopName
     */
    public TrainStop(int stopID, String stopName, int lowerBound, int upperBound) {
        this.stopID = stopID;
        this.stopName = stopName;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.waitingPassengers = new ArrayList<Passenger>();
        populateStop();
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

    public ArrayList<Passenger> getWaitingPassengersQueue(){
        return this.waitingPassengers;
    }

    /**
     * Randomize number of passengers in range found from data. Make that many passengers at this stop
     * with id, starting stop of this stop, and random destination stop
     */
    public void populateStop(){
        int numOfPassengersWaiting = (int) (this.lowerBound + (Math.random() * (this.upperBound - this.lowerBound)));
        for(int i=0; i< numOfPassengersWaiting; i++){
            int destinationIndex = (int) (this.stopID + (Math.random() * (12 - this.stopID)));
            waitingPassengers.add(new Passenger(i, (this.stopID-1), destinationIndex));
            
        }
        // listPassengers();
    }

    public void listPassengers(){
        System.out.println("              At stop " + (this.stopID-1) + "(" + getStopName() + ")" + " there is...");
        for(Passenger p : waitingPassengers){
            System.out.print("Passenger " + p.getID());
            System.out.print(" starting at "+p.getStart());
            System.out.println(" and going to " + p.getDestination());
        }
    }
}
