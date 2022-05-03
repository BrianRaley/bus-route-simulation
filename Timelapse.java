/**
 * This class maintains the simulation by using a Timer with TimerTasks.
 * Each interval simulates the passing of one minute as a train travels 
 * along a set route.
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
public class Timelapse {
    private int displayHour = 12, displayMinute = 0;
    GUI gui = new GUI();
    WestboundRoute westbound = new WestboundRoute();
    ArrayList<TrainStop> westRoute = westbound.getWestboundRoute();

    // Initialize train 1, starting in Lindenwold and traveling Westbound
    Train train1 = new Train(1, 0, westRoute, true);
    // Initialize train 2, starting at 15/16th & Locust and traveling Eastbound
    Train train2 = new Train(2, 12, westRoute, false);

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            populateStops();
            trainOps();
            incrementTimer();  
            //System.out.println(getTimeString());
            //System.out.println("Train 1 current stop: " + train1.getcurrentStopIndex());       
            //System.out.println("Time to next stop: " + train1.getTimeToNextStop() + "\n");
            }
    };

    /**
     * Constructor - initializes the GUI
     */
    public Timelapse() {
        gui.initGUI();
    }

    /**
     * Begins the simulation
     */
    public void start() {
        train1.setTimeToNextStop(westbound.getWestboundRoute().get(0).getTimeToNextWestboundStop());
        train2.setTimeToNextStop(westbound.getWestboundRoute().get(12).getTimeToNextEastboundStop());

        populateStops();
        train1.interact();
        train2.interact();

        gui.setTrainACurrentStop(westRoute.get(train1.getcurrentStopIndex()).getStopName());
        gui.setTrainBCurrentStop(westRoute.get(train2.getcurrentStopIndex()).getStopName());

        //System.out.println(getTimeString());
        //System.out.println("Train 1 current stop: " + train1.getcurrentStopIndex());
        //System.out.println("Time to next stop: " + train1.getTimeToNextStop() + "\n");

        timer.scheduleAtFixedRate(task, 500, 2000);
    }

    /**
     * Returns the current simulated time as a String
     * @return String of time in format HH:MM
     */
    public String getTimeString() {
        if(displayMinute <= 9) {
            return displayHour + ":0" + displayMinute;
        }
        return displayHour + ":" + displayMinute;    
    }

    /**
     * Increments timer and display time by one minute
     */
    public void incrementTimer() {
        if(displayMinute == 59) {
            displayMinute = 0;
            displayHour++;
            if(displayHour >= 12) {
                displayHour = 1;
            }
            //System.out.println(hour + ":0" + minute);
        }
        else {
            displayMinute++;
            //System.out.println(hour + ":" + minute);
        }
        gui.setTimer(getTimeString());
    }

    /**
     * Adjusts the GUI values for passengers waiting at each stop
     */
    public void populateStops() {
        for(TrainStop stop : westbound.getWestboundRoute()) {
            stop.populateStop();
            int stopNum = stop.getStopID();
            switch(stopNum) {
                case 1:
                    gui.setStop1Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 2:
                    gui.setStop2Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 3:
                    gui.setStop3Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 4:
                    gui.setStop4Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 5:
                    gui.setStop5Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 6:
                    gui.setStop6Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 7:
                    gui.setStop7Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 8:
                    gui.setStop8Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 9:
                    gui.setStop9Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 10:
                    gui.setStop10Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 11:
                    gui.setStop11Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 12:
                    gui.setStop12Total(stop.getSizeOfWaitingPassengers());
                    break;
                case 13:
                    gui.setStop13Total(stop.getSizeOfWaitingPassengers());
                    break;
            }
        }
    }

    /**
     * Train operations to be performed during each interval of simulated time
     */
    public void trainOps() {
        train1.advance();
        train2.advance();

        gui.setTrainACurrentPassengers(train1.getNumOfPassengers());
        gui.setTrainBCurrentPassengers(train2.getNumOfPassengers());

        if(train1.getIsStopped()) {
            train1.interact();
            gui.setTrainACurrentStop(westRoute.get(train1.getcurrentStopIndex()).getStopName()); 
        }
        else {
            gui.setTrainACurrentStop("In Transit...");
        }

        if(train2.getIsStopped()) {
            train2.interact();
            gui.setTrainBCurrentStop(westRoute.get(train2.getcurrentStopIndex()).getStopName()); 
        }
        else {
            gui.setTrainBCurrentStop("In Transit...");
        }
    }

    /**
     * Stops the simulation
     */
    public void stopSimulation() {
        task.cancel();
        timer.cancel();
    }

    /**
     * Resumes the simulation from a stopped state
     */
    public void resumeSimulation() {
        timer = new Timer();
        task = new TimerTask() {
            public void run() {
                populateStops();
                trainOps();
                incrementTimer(); 
            }
        };
        timer.scheduleAtFixedRate(task, 500, 2000);
    }

    /**
     * Resets & restarts the simulation
     */
    public void reset() {
        displayHour = 12;
        displayMinute = 0;

        train1.clearTrain();
        train1.setCurrentStopIndex(0);

        train2.clearTrain();
        train2.setCurrentStopIndex(12);

        for(int i = 0; i < westRoute.size(); i++) {
            westRoute.get(i).clearStop();
        }

        populateStops();

        resumeSimulation();
    }
}