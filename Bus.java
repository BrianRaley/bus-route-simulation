/**
 * Bus class represents an instance of a public transit bus
 * that will be carrying passengers from stop to stop. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.ArrayList;

public class Bus {
    private int ID;     // ID of this bus
    private boolean ascending;      // true if first stop is 1
    private int maxCapacity = 56;   // max # of passengers this bus can hold
    private int nextStop;   // next stop of this bus
    //private int fuel;     // current fuel 
    private ArrayList<Passenger> passengers;    // passengers on the bus

    /** 
     * Creates an instance of a bus with an ID
     * @param id
     */
    public Bus(int id) {
        this.ID = id;
        this.ascending = true;
        this.passengers = new ArrayList<Passenger>();
        this.nextStop = 0;
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

    /**
     * 
     */
    public void setNextStop() {
        if(ascending) {
            nextStop++;
            if(nextStop == 14) {
                ascending = false;
            }
        }
        else {
            nextStop--;
            if(nextStop == 1) {
                ascending = true;
            }
        }
    }

    
}
