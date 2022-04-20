import java.util.Timer;
import java.util.TimerTask;

public class Timelapse {
    private int hour = 12, minute1 = 0, minute2 = 0;

    public Timelapse() {
        
    }

    public void start() {
        Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    if(minute1 == 5 && minute2 == 9) {
                        minute1 = 0;
                        minute2 = 0;
                        hour++;
                        if(hour >= 12) {
                            hour = 1;
                        }
                    }
                    else if(minute2 == 9) {
                        minute2 = 0;
                        minute1++;
                    }
                    else {
                        minute2++;
                    }
                
                System.out.println(hour + ":" + minute1 + minute2);
            }
        };
    
        timer.scheduleAtFixedRate(task, 500, 1000);
    }

    public String getTimeString() {
        return hour + ":" + minute1 + minute2;    
    }
}
