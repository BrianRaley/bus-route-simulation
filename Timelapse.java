import java.util.Timer;
import java.util.TimerTask;
public class Timelapse {
    private int displayHour = 12, displayMinute = 0, minute = 0;
    GUI gui = new GUI();
    WestboundRoute westbound = new WestboundRoute();
    //Train t1 = new Train(1, 0, westbound.getWestboundRoute());

    public Timelapse() {
        
    }

    /**
     * Begins the simulation timer
     */
    public void start() {
        gui.initGUI();
        Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
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

                    incrementTimer();
                    
            }
        };
    
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
            minute++;
            displayMinute = 0;
            displayHour++;
            if(displayHour >= 12) {
                displayHour = 1;
            }
            //System.out.println(hour + ":0" + minute);
        }
        else {
            minute++;
            displayMinute++;
            //System.out.println(hour + ":" + minute);
        }
        gui.setTimer(getTimeString());
    }
}
