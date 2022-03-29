/**
 * Passenger class represents an individual passenger that will be
 * waiting for and boarding a public transit bus. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

public class Passenger {
    private int startingStop;       // the bus stop this passenger is starting from
    private int destinationStop;    // this passenger's destination
    private int timeArrived;    // time this passenger arrived at bus stop

    /**
     * Creates an instance of a passenger with a destination
     * @param destination The passenger's destination bus stop
     */
    public Passenger(int startingStop, int destinationStop) {
        this.startingStop = startingStop;
        this.destinationStop = destinationStop;
        this.timeArrived = 0;
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
     * Sets the time this passenger arrived at the bus stop
     * @param timeArrived int value of time passenger arrived at bus stop
     */
    public void setTimeArrived(int timeArrived) {
        if(timeArrived < 0) {
            throw new IllegalArgumentException("Invalid arrival time");
        }
        this.timeArrived = timeArrived;
    }
}
