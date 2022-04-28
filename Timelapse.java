import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
public class Timelapse {
    private int displayHour = 12, displayMinute = 0, minute = 0;
    //WestboundRoute westbound = new WestboundRoute();
    //Train t1 = new Train(1, 0, westbound.getWestboundRoute());
    static JFrame frame;
    static JLabel timerLabel;

    public Timelapse() {
        
    }

    /**
     * Begins the simulation timer
     */
    public void start() {
        initGUI();
        Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    incrementTimer();
            }
        };
    
        timer.scheduleAtFixedRate(task, 500, 1000);
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
     * Initializes GUI
     */
    public void initGUI() {
        frame = new JFrame("Train Simulation");

        timerLabel = new JLabel();
        Dimension size = timerLabel.getPreferredSize();
        timerLabel.setBounds(10, 10, size.width, size.height);

        JPanel panel = new JPanel();
        panel.add(timerLabel);
        
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
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
        timerLabel.setText(getTimeString());
        System.out.println(minute);
    }
}
