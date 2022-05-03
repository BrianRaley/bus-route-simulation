/**
 * Train class represents an instance of a Patco train
 * that will be carrying passengers from stop to stop. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;
// import java.util.Collections;

public class Train {
    private int ID;     // ID of this train
    ArrayList<TrainStop> route;     // the route the train is on
    private boolean westbound;      // true if train is traveling westbound
    private boolean isStopped = true;
    private int maxCapacity = 1000;   // max # of passengers this train can hold
    private int currentStopIndex; // current stop bus is at
    private int timeToNextStop;     // time in minutes until next stop
    private ArrayList<Passenger> passengers;    // passengers on the bus

    /** 
     * Creates an instance of a bus with an ID
     * @param id
     */
    public Train(int id, int currentStopIndex, ArrayList<TrainStop> route, boolean westbound) {
        this.ID = id;
        this.currentStopIndex = currentStopIndex;
        this.route = route;
        this.passengers = new ArrayList<Passenger>();
        this.westbound = westbound;
        // this.nextStop = 0;
    }

    /**
     * Returns the bus ID
     * @return int ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Returns max capacity of this bus
     * @return int maxCapacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Set the max capacity of this bus
     * @param max int
     */
    public void setMaxCapacity(int max) {
        this.maxCapacity = max;
    }

    /**
     * Returns the current stop index of this train
     * @return int currentStopIndex
     */
    public int getcurrentStopIndex() {
        return currentStopIndex;
    }

    /**
     * Sets the current stop index
     * @param index
     */
    public void setCurrentStopIndex(int index) {
        currentStopIndex = index;
    }

    /**
     * Returns true if the train is stopped
     * @return boolean isStopped
     */
    public boolean getIsStopped() {
        return isStopped;
    }

    /**
     * Get the current # of passengers on the train
     * @return int value of # of passengers currently on the train
     */
    public int getNumOfPassengers() {
        return passengers.size();
    }

    /**
     * Returns the time in minutes until the next stop on the route
     * @return int timeToNextStop
     */
    public int getTimeToNextStop() {
        return timeToNextStop;
    }

    /**
     * Sets the time (in minutes) until the next stop
     * @param time until next stop 
     */
    public void setTimeToNextStop(int time) {
        timeToNextStop = time;
    }

    /**
     * Returns true if the train is traveling westbound
     * @return boolean westbound
     */
    public boolean getWestbound() {
        return westbound;
    }

    /**
     * Removes all passengers from the train
     */
    public void clearTrain() {
        passengers.clear();
    }

    /**
     * Advances the train by 1 minute of simulated time
     */
    public void advance() {
        timeToNextStop--;
        isStopped = false;
        if(timeToNextStop == 0 && westbound) {
            currentStopIndex++;
            setTimeToNextStop(this.route.get(getcurrentStopIndex()).getTimeToNextWestboundStop());
            // Train is stopped
            isStopped = true;
            //System.out.println("Stopping at: " + route.get(currentStopIndex).getStopName());
        }
        // Train is changing from Westbound to Eastbound
        else if(timeToNextStop <= -1 && westbound) {
            setTimeToNextStop(route.get(getcurrentStopIndex()).getTimeToNextEastboundStop());
            westbound = false;
        }

        else if(timeToNextStop == 0 && !westbound) {
            currentStopIndex--;
            setTimeToNextStop(route.get(getcurrentStopIndex()).getTimeToNextEastboundStop());
            if(currentStopIndex <= 0) {
                westbound = true;
            }
            // Train is stopped
            isStopped = true;
            //System.out.println("Stopping at: " + route.get(currentStopIndex).getStopName());
        }
        // Train is changing from Eastbound to Westbound
        else if(timeToNextStop <= -1 && !westbound) {
            setTimeToNextStop(this.route.get(getcurrentStopIndex()).getTimeToNextWestboundStop());
            westbound = true;
        }
    }

    /**
     * Adds and removes passengers when the train makes a stop. 
     */
    public void interact(){
        relievePassengersFromTrain();
        addPassengersFromStop();
    }

    /**
     * Removes passengers from the train 
     */
    public void relievePassengersFromTrain(){
        // Collections.sort(passengers);
        for(int i=0; i<passengers.size(); i++){
            Passenger p = passengers.get(i);
            if(p.getDestination() == currentStopIndex){
                //System.out.println("Removed: " + p);
                passengers.remove(p);
            }
        }
    }

    /**
     * Adds passengers from the current stop to the train
     */
    public void addPassengersFromStop(){
        // System.out.println("passengers added");
        TrainStop currentStation = route.get(currentStopIndex);
        while(passengers.size() < this.maxCapacity &&
              currentStation.getWaitingPassengersQueue().isEmpty() != true){
            Passenger p = currentStation.getWaitingPassengersQueue().remove(0);
            //System.out.println("Added: " + p);
            if((p.getDirection() && getWestbound()) ||
                !p.getDirection() && !getWestbound()) {
                    this.passengers.add(p);
            }
        }
    }
}