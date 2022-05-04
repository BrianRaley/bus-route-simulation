/**
 * TrainStop class represents an instance of a train stop with a
 * queue of waiting passengers. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;

public class TrainStop {
    private int stopID;     // # of this train stop
    private String stopName;  // name of this train stop
    private ArrayList<Passenger> waitingPassengers;
    private int lowerBound;
    private int upperBound;
    private int timeToNextWestboundStop;
    private int timeToNextEastboundStop;
    private int totalBoards;

    /**
     * Creates an instance of a train stop with a stop #, name, 
     * and an ArrayList of waiting Passengers
     * @param stopID
     * @param stopName
     */
    public TrainStop(int stopID, String stopName, int lowerBound, int upperBound, int timeToNextWestboundStop, int timeToNextEastboundStop) {
        this.stopID = stopID;
        this.stopName = stopName;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.timeToNextWestboundStop = timeToNextWestboundStop;
        this.timeToNextEastboundStop = timeToNextEastboundStop;
        this.waitingPassengers = new ArrayList<Passenger>();
    }

    /**
     * Returns the ID # of this train stop
     * @return int stopID
     */
    public int getStopID() {
        return stopID;
    }

    /**
     * Returns the name of this train stop
     * @return String stopName
     */
    public String getStopName() {
        return stopName;
    }

    /**
     * Returns the time in minutes to the next westbound stop
     * @return int timeToNextWestboundStop
     */
    public int getTimeToNextWestboundStop() {
        return timeToNextWestboundStop;
    }

    /**
     * Returns the time in minutes to the next eastbound stop
     * @return int timeToNextEastboundStop
     */
    public int getTimeToNextEastboundStop() {
        return timeToNextEastboundStop;
    }

    /**
     * Returns the number of passengers currently waiting at this stop
     * @return int num of waiting passengers at this stop
     */
    public int getSizeOfWaitingPassengers() {
        return waitingPassengers.size();
    }

    /**
     * Returns the total number of passengers that boarded at this stop
     * @return
     */
    public int getTotalBoards() {
        return totalBoards;
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
    public Passenger removeWaitingPassenger(int index) {
        totalBoards++;
        return waitingPassengers.remove(index);
    }

    /**
     * Returns the ArrayList of passengers waiting at this stop
     * @return 
     */
    public ArrayList<Passenger> getWaitingPassengersQueue(){
        return this.waitingPassengers;
    }

    /**
     * Randomize number of passengers in range found from data. Make that many passengers at this stop
     * with id, starting stop of this stop, and random destination stop
     */
    public void populateStop(){
        int min = 0;
        int max = 12;
        int range = max - min + 1;

        int numOfPassengersWaiting = (int) (this.lowerBound + (Math.random() * (this.upperBound - this.lowerBound)));
        for(int i=0; i< numOfPassengersWaiting; i++){
            int destinationIndex = (int) ((Math.random() * range));
            waitingPassengers.add(new Passenger((this.stopID-1), destinationIndex));
            
        }
        //listPassengers();
    }

    /**
     * Prints all passengers at this stop to console
     */
    public void listPassengers(){
        System.out.println("              At stop " + (this.stopID-1) + "(" + getStopName() + ")" + " there is...");
        for(Passenger p : waitingPassengers){
            System.out.print(" starting at "+p.getStart());
            System.out.println(" and going to " + p.getDestination());
        }
    }

    /**
     * Removes all waiting passengers from a stop
     */
    public void clearStop() {
        waitingPassengers.clear();
    }

    /**
     * toString method
     * @return String of stop ID, time to next westbound stop, time to next eastbound stop
     */
    public String toString() {
        return stopID + " " + timeToNextWestboundStop + " " + timeToNextEastboundStop; 
    }
}