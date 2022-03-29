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
    private boolean inService;      //
    private int maxCapacity = 56;   // max # of passengers this bus can hold
    private int currCapacity;     // current # of passengers on this bus
    private int nextStop;   // next stop of this bus
    //private int fuel;
    private ArrayList<Passenger> passengers;    // passengers on the bus

    /** 
     * Creates an instance of a bus with an ID
     */
    public Bus(int id) {
        this.ID = id;
        this.inService = true;
        this.currCapacity = 0;
        this.passengers = new ArrayList<Passenger>(maxCapacity);
        this.nextStop = 0;
    }


    public void setNextStop() {
        if(nextStop < 14) {
            nextStop++;
        }
        if(nextStop == 14) {
            nextStop--;
        }
    }

    
}
