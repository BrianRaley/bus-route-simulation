/**
 * Passenger class represents an individual passenger that will be
 * waiting for and boarding a public transit bus. Passenger will 
 * then stay on the bus until they reach their destination.
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

public class Passenger {
    //private int id;
    private int startingStop;       // the bus stop this passenger is starting from
    private int destinationStop;    // this passenger's destination
    // private int startingStopArrivalTime; // when passenger got to starting bus stop
    private int timeArrived;    // time this passenger arrived at bus stop
    private boolean westbound;

    /**
     * Creates an instance of a passenger with a destination
     * @param destination The passenger's destination bus stop
     */
    public Passenger(int startingStop, int destinationStop) {
        this.startingStop = startingStop;
        this.destinationStop = destinationStop;
        this.timeArrived = 0;
        if(startingStop < destinationStop) {
            this.westbound = true;
        }
        else {
            this.westbound = false;
        }
    }

    /**
     * Returns the starting bus stop of this passenger
     * @return int value of starting bus stop of passenger
     */
    public int getStart() {
        return startingStop;
    }

    /**
     * Sets the starting bus stop for this passenger
     * @param start int value of starting bus stop of passenger
     */
    public void setStart(int start) {
        this.startingStop = start;
    }

    /**
     * Returns the passenger's destination 
     * @return int value of passenger's destination
     */   
    public int getDestination() {
        return destinationStop;
    }

    /**
     * Sets the passenger's destination 
     * @param destination int value of passenger's destination
     */
    public void setDestination(int destination) {
        this.destinationStop = destination;
    }

    /**
     * Returns the time this passenger arrived at the bus stop
     * @return int value of time passenger arrived at bus stop
     */
    public int getTimeArrived() {
        return timeArrived;
    }

    /**
     * Returns true if passenger is traveling Westbound
     * @return boolean westbound
     */
    public boolean getDirection() {
        return westbound;
    }

    /**
     * toString method
     * @return String of passengers starting & destination stops
     */
    public String toString() {
        return "start: " + startingStop + " end: " + destinationStop;
    }
}