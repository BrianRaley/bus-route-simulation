import java.util.Timer;
import java.util.TimerTask;

public class Timelapse {
    private int hour = 12, minute = 0;
    //WestboundRoute westbound = new WestboundRoute();
    //Train t1 = new Train(1, 0, westbound.getWestboundRoute());

    public Timelapse() {
        
    }

    public void start() {
        Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    if(minute == 59) {
                        minute = 0;
                        hour++;
                        if(hour >= 12) {
                            hour = 1;
                        }
                        System.out.println(hour + ":0" + minute);
                    }
                    else if(minute < 9) {
                        minute++;
                        System.out.println(hour + ":0" + minute);
                    }
                    else {
                        minute++;
                        System.err.println(hour + ":" + minute);
                    }
                
                
            }
        };
    
        timer.scheduleAtFixedRate(task, 500, 1000);
    }

    public String getTimeString() {
        return hour + ":" + minute;    
    }
}
