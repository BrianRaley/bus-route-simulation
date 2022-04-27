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
    private int maxCapacity = 200;   // max # of passengers this bus can hold
    private int currentStopIndex; // current stop bus is at
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

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public int checkStopsTotal(){
        int sum = 0;
        for (TrainStop t : route) {
            sum += t.getWaitingPassengersQueue().size();
        }
        return sum;
    }

    /**
     * 
     */
    public void getNextStop() {
        if(ascending) {
            currentStopIndex++;
        }
        else {
            currentStopIndex--;
        }
    }

    public void assessDirection(){
        if(currentStopIndex == 12){
            ascending = false;
        }
        else if(currentStopIndex == 0){
            ascending = true;
        }
    }

    /**
     * Find out which station we are arriving at. Relieve passengers that want to get off here.
     * Add waiting passengers as long as there is room in the train. Move on to next station.
     */
    public void interact(){
        System.out.println("AT " + route.get(currentStopIndex).getStopName().toUpperCase());
        relievePassengersFromBus();
        assessDirection();
        addPassengersFromStop();
        getNextStop();
    }

    /**
     * 
     */
    public void relievePassengersFromBus(){
        // Collections.sort(passengers);
        for(int i=0; i<passengers.size(); i++){
            Passenger p = passengers.get(i);
            if(p.getDestination() == currentStopIndex){
                System.out.println("Removed " + p.getID());
                passengers.remove(p);
            }
        }
    }

    /**
     * Checks if train has room, if station still has people, if each passenger wants to go this
     * train's direction before allowing the passenger to board. If a given passenger wants to go other way,
     * the loop will skip that person on the next check using "lastP" variable
     */
    public void addPassengersFromStop(){
        int lastP = 0;
        TrainStop currentStation = route.get(currentStopIndex);
        while(passengers.size() < this.maxCapacity &&
                currentStation.getWaitingPassengersQueue().isEmpty() != true){
            if(lastP >= currentStation.getWaitingPassengersQueue().size()){
                break;
            }
            Passenger p = currentStation.getWaitingPassengersQueue().get(lastP);
            if(p.getWestbound() == this.ascending){
                currentStation.getWaitingPassengersQueue().remove(lastP);
                this.passengers.add(p);
                System.out.println("Boarded!!" + p.getID() + " from " + p.getStart());
            }
            else{
                lastP++;
                System.out.println("i'll pass...");
            }
        }
        if(passengers.size() >= this.maxCapacity){
            System.out.println("CAPACITY HAS BEEN REACHED");
        }
    }
}
