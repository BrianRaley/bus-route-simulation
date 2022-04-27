/**
 * Bus class represents an instance of a public transit bus
 * that will be carrying passengers from stop to stop. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;
// import java.util.Collections;

public class Train {
    private int ID;     // ID of this bus
    ArrayList<TrainStop> route;
    private boolean ascending;      // true if first stop is 1
    private int maxCapacity = 56;   // max # of passengers this bus can hold
    private int currentStopIndex; // current stop bus is at
    private int timeToNextStop = 0;     // time in minutes until next stop
    // private int nextStop;   // next stop of this bus
    //private int fuel;     // current fuel 
    private ArrayList<Passenger> passengers;    // passengers on the bus

    /** 
     * Creates an instance of a bus with an ID
     * @param id
     */
    public Train(int id, int currentStopIndex, ArrayList<TrainStop> route) {
        this.ID = id;
        this.currentStopIndex = currentStopIndex;
        this.route = route;
        this.ascending = true;
        this.passengers = new ArrayList<Passenger>();
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
     * Get the current # of passengers on the bus
     * @return int value of # of passengers currently on the bus
     */
    public int getNumOfPassengers() {
        return passengers.size();
    }

    public int getTimeToNextStop() {
        return timeToNextStop;
    }

    public void setTimeToNextStop() {
        
    }

    /**
     * 
     */
    public void getNextStop() {
        if(ascending) {
            currentStopIndex++;
            if(currentStopIndex == 12) {
                ascending = false;
            }
        }
        else {
            currentStopIndex--;
            if(currentStopIndex == 0) {
                ascending = true;
            }
        }
    }

    

    /**
     * Find out which station we are arriving at. Relieve passengers that want to get off here.
     * Add waiting passengers as long as there is room in the train. Move on to next station.
     */
    public void interact(){
        // System.out.println(currentStation.getStopName());
        relievePassengersFromBus();
        addPassengersFromStop();
        getNextStop();
    }

    /**
     * 
     */
    public void relievePassengersFromBus(){
        // System.out.println("passengers let go");
        // Collections.sort(passengers);
        for(int i=0; i<passengers.size(); i++){
            Passenger p = passengers.get(i);
            if(p.getDestination() == currentStopIndex){
                passengers.remove(p);
            }
        }
    }

    /**
     * 
     */
    public void addPassengersFromStop(){
        // System.out.println("passengers added");
        TrainStop currentStation = route.get(currentStopIndex);
        while(passengers.size() != this.maxCapacity &&
              currentStation.getWaitingPassengersQueue().isEmpty() != true){
            Passenger p = currentStation.getWaitingPassengersQueue().remove(0);
            this.passengers.add(p);
        }
    }
}
