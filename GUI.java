/**
 * This class builds the GUI. 
 * 
 * System Simulation & Modeling - Spring 2022 - Dr Safko
 * Team 6: Brian Raley, Emerson Henkel, Doug White
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class GUI {
    static JFrame frame;
    static JLabel timerLabel, waiting, totalBoards;

    static JLabel stop1, stop2, stop3, stop4, stop5, stop6, stop7, stop8, stop9, stop10, stop11, stop12, stop13;
    static JTextField stop1Total, stop2Total, stop3Total, stop4Total, stop5Total, stop6Total, stop7Total, stop8Total, stop9Total, stop10Total, stop11Total, stop12Total, stop13Total;
    static JTextField stop1Boards, stop2Boards, stop3Boards,stop4Boards, stop5Boards, stop6Boards, stop7Boards, stop8Boards, stop9Boards, stop10Boards, stop11Boards, stop12Boards, stop13Boards;

    static JLabel trainA, trainB, totalPassengers, currentStop;
    static JTextField trainATotalPassengers, trainACurrentStopName, trainBTotalPassengers, trainBCurrentStopName;
    
    static JLabel total;
    static JTextField totalCompleted;

    static JButton start, stop, reset, resume;

    static Timelapse t;

    /**
     * Constructor
     */
    public GUI() {

    }

    /**
     * Main method - Initializes GUI and prepares for simulation
     * @param args
     */
    public static void main(String[] args) {
        t = new Timelapse();
    }

    /**
     * Initializes GUI 
     */
    public void initGUI() {
        frame = new JFrame("Train Simulation");

        // Initializing all labels
        timerLabel = new JLabel("Current time: 12:00" );
        waiting = new JLabel("Waiting Riders");
        totalBoards = new JLabel("Total Boards");

        stop1 = new JLabel("Stop 1: Lindenwold");
        stop2 = new JLabel("Stop 2: Ashland");
        stop3 = new JLabel("Stop 3: Woodcrest");
        stop4 = new JLabel("Stop 4: Haddonfield");
        stop5 = new JLabel("Stop 5: Westmont");
        stop6 = new JLabel("Stop 6: Collingswood");
        stop7 = new JLabel("Stop 7: Ferry Ave");
        stop8 = new JLabel("Stop 8: Broadway");
        stop9 = new JLabel("Stop 9: City Hall");
        stop10 = new JLabel("Stop 10: 8th & Market");
        stop11 = new JLabel("Stop 11: 9/10th & Locust");
        stop12 = new JLabel("Stop 12: 12/13th & Locust");
        stop13 = new JLabel("Stop 13: 15/16th & Locust");

        currentStop = new JLabel("Current Stop");
        totalPassengers = new JLabel("Total Riders");

        trainA = new JLabel("Train A");
        trainB = new JLabel("Train B");

        total = new JLabel("Total rides completed");
    
        // Initializing all text fields
        stop1Total = new JTextField();
        stop2Total = new JTextField();
        stop3Total = new JTextField();
        stop4Total = new JTextField();
        stop5Total = new JTextField();
        stop6Total = new JTextField();
        stop7Total = new JTextField();
        stop8Total = new JTextField();
        stop9Total = new JTextField();
        stop10Total = new JTextField();
        stop11Total = new JTextField();
        stop12Total = new JTextField();
        stop13Total = new JTextField();

        stop1Boards = new JTextField();
        stop2Boards = new JTextField();
        stop3Boards = new JTextField();
        stop4Boards = new JTextField();
        stop5Boards = new JTextField();
        stop6Boards = new JTextField();
        stop7Boards = new JTextField();
        stop8Boards = new JTextField();
        stop9Boards = new JTextField();
        stop10Boards = new JTextField();
        stop11Boards = new JTextField();
        stop12Boards = new JTextField();
        stop13Boards = new JTextField();

        trainACurrentStopName = new JTextField();
        trainATotalPassengers = new JTextField();

        trainBCurrentStopName = new JTextField();
        trainBTotalPassengers = new JTextField();

        totalCompleted = new JTextField();

        // Initializing buttons
        start = new JButton("Start");
        start.setEnabled(true);

        resume = new JButton("Resume");
        resume.setEnabled(false);

        stop = new JButton("Stop");
        stop.setEnabled(false);

        reset = new JButton("Reset");
        reset.setEnabled(false);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.start();
                start.setEnabled(false);
                stop.setEnabled(true);
                reset.setEnabled(false);
            }
        });

        stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.stopSimulation();
                stop.setEnabled(false);
                reset.setEnabled(true);
                resume.setEnabled(true);
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.reset();
                start.setEnabled(false);
                resume.setEnabled(false);
                stop.setEnabled(true);
                reset.setEnabled(false);
            }
        });

        resume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.resumeSimulation();
                resume.setEnabled(false);
                stop.setEnabled(true);
                start.setEnabled(false);
                reset.setEnabled(false);
            }
        });
        
        // Adding components to panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.add(timerLabel);
        panel.add(waiting);
        panel.add(totalBoards);

        // Buttons
        panel.add(start);
        panel.add(stop);
        panel.add(reset);
        panel.add(resume);

        // Stops
        panel.add(stop1);
        panel.add(stop2);
        panel.add(stop3);
        panel.add(stop4);
        panel.add(stop5);
        panel.add(stop6);
        panel.add(stop7);
        panel.add(stop8);
        panel.add(stop9);
        panel.add(stop10);
        panel.add(stop11);
        panel.add(stop12);
        panel.add(stop13);

        panel.add(stop1Total);
        panel.add(stop2Total);
        panel.add(stop3Total);
        panel.add(stop4Total);
        panel.add(stop5Total);
        panel.add(stop6Total);
        panel.add(stop7Total);
        panel.add(stop8Total);
        panel.add(stop9Total);
        panel.add(stop10Total);
        panel.add(stop11Total);
        panel.add(stop12Total);
        panel.add(stop13Total);

        panel.add(stop1Boards);
        panel.add(stop2Boards);
        panel.add(stop3Boards);
        panel.add(stop4Boards);
        panel.add(stop5Boards);
        panel.add(stop6Boards);
        panel.add(stop7Boards);
        panel.add(stop8Boards);
        panel.add(stop9Boards);
        panel.add(stop10Boards);
        panel.add(stop11Boards);
        panel.add(stop12Boards);
        panel.add(stop13Boards);

        // Train info
        panel.add(currentStop);
        panel.add(totalPassengers);

        panel.add(trainA);
        panel.add(trainACurrentStopName);
        panel.add(trainATotalPassengers);

        panel.add(trainB);
        panel.add(trainBCurrentStopName);
        panel.add(trainBTotalPassengers);

        panel.add(total);
        panel.add(totalCompleted);

        // Setting component positions
        timerLabel.setLocation(10, 10);
        waiting.setLocation(170, 10);
        totalBoards.setLocation(280, 10);

        stop1.setLocation(10, 30);
        stop1Total.setLocation(170, 30);
        stop1Boards.setLocation(280, 30);

        stop2.setLocation(10, 50);
        stop2Total.setLocation(170, 50);
        stop2Boards.setLocation(280, 50);

        stop3.setLocation(10, 70);
        stop3Total.setLocation(170, 70);
        stop3Boards.setLocation(280, 70);

        stop4.setLocation(10, 90);
        stop4Total.setLocation(170, 90);
        stop4Boards.setLocation(280, 90);

        stop5.setLocation(10, 110);
        stop5Total.setLocation(170, 110);
        stop5Boards.setLocation(280, 110);

        stop6.setLocation(10, 130);
        stop6Total.setLocation(170, 130);
        stop6Boards.setLocation(280, 130);

        stop7.setLocation(10, 150);
        stop7Total.setLocation(170, 150);
        stop7Boards.setLocation(280, 150);

        stop8.setLocation(10, 170);
        stop8Total.setLocation(170, 170);
        stop8Boards.setLocation(280, 170);

        stop9.setLocation(10, 190);
        stop9Total.setLocation(170, 190);
        stop9Boards.setLocation(280, 190);

        stop10.setLocation(10, 210);
        stop10Total.setLocation(170, 210);
        stop10Boards.setLocation(280, 210);

        stop11.setLocation(10, 230);
        stop11Total.setLocation(170, 230);
        stop11Boards.setLocation(280, 230);

        stop12.setLocation(10, 250);
        stop12Total.setLocation(170, 250);
        stop12Boards.setLocation(280, 250);

        stop13.setLocation(10, 270);
        stop13Total.setLocation(170, 270);
        stop13Boards.setLocation(280, 270);

        totalPassengers.setLocation(170, 300);
        currentStop.setLocation(280, 300);

        trainA.setLocation(10, 320);
        trainATotalPassengers.setLocation(170, 320);
        trainACurrentStopName.setLocation(280, 320);

        trainB.setLocation(10, 340);
        trainBTotalPassengers.setLocation(170, 340);
        trainBCurrentStopName.setLocation(280, 340);

        total.setLocation(10, 360);
        totalCompleted.setLocation(170, 360);

        start.setLocation(10, 400);
        resume.setLocation(10, 426);
        stop.setLocation(130, 400);
        reset.setLocation(250, 400);

        // Setting component sizes
        timerLabel.setSize(150, 16);
        waiting.setSize(150, 16);
        totalBoards.setSize(150, 16);

        stop1.setSize(150, 16);
        stop1Total.setSize(50, 16);
        stop1Boards.setSize(50, 16);

        stop2.setSize(150, 16);
        stop2Total.setSize(50, 16);
        stop2Boards.setSize(50, 16);

        stop3.setSize(150, 16);
        stop3Total.setSize(50, 16);
        stop3Boards.setSize(50, 16);

        stop4.setSize(150, 16);
        stop4Total.setSize(50, 16);
        stop4Boards.setSize(50, 16);

        stop5.setSize(150, 16);
        stop5Total.setSize(50, 16);
        stop5Boards.setSize(50, 16);

        stop6.setSize(150, 16);
        stop6Total.setSize(50, 16);
        stop6Boards.setSize(50, 16);

        stop7.setSize(150, 16);
        stop7Total.setSize(50, 16);
        stop7Boards.setSize(50, 16);

        stop8.setSize(150, 16);
        stop8Total.setSize(50, 16);
        stop8Boards.setSize(50, 16);

        stop9.setSize(150, 16);
        stop9Total.setSize(50, 16);
        stop9Boards.setSize(50, 16);

        stop10.setSize(150, 16);
        stop10Total.setSize(50, 16);
        stop10Boards.setSize(50, 16);

        stop11.setSize(150, 16);
        stop11Total.setSize(50, 16);
        stop11Boards.setSize(50, 16);

        stop12.setSize(150, 16);
        stop12Total.setSize(50, 16);
        stop12Boards.setSize(50, 16);

        stop13.setSize(150, 16);
        stop13Total.setSize(50, 16);
        stop13Boards.setSize(50, 16);

        totalPassengers.setSize(150, 16);
        currentStop.setSize(150, 16);

        trainA.setSize(150, 16);
        trainATotalPassengers.setSize(100, 16);
        trainACurrentStopName.setSize(150, 16);

        trainB.setSize(150, 16);
        trainBTotalPassengers.setSize(100, 16);
        trainBCurrentStopName.setSize(150, 16);

        total.setSize(150, 16);
        totalCompleted.setSize(100, 16);

        start.setSize(90, 24);
        resume.setSize(90, 24);
        stop.setSize(90, 24);
        reset.setSize(90, 24);
        
        // Building frame
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Sets the JLabel timer value to the current simulated time
     * @param time
     */
    public void setTimer(String time) {
        timerLabel.setText("Current time: " + time);
    }

    public void setStop1Total(int total) {
        stop1Total.setText(String.valueOf(total));
    }

    public void setStop2Total(int total) {
        stop2Total.setText(String.valueOf(total));
    }

    public void setStop3Total(int total) {
        stop3Total.setText(String.valueOf(total));
    }

    public void setStop4Total(int total) {
        stop4Total.setText(String.valueOf(total));
    }

    public void setStop5Total(int total) {
        stop5Total.setText(String.valueOf(total));
    }

    public void setStop6Total(int total) {
        stop6Total.setText(String.valueOf(total));
    }

    public void setStop7Total(int total) {
        stop7Total.setText(String.valueOf(total));
    }

    public void setStop8Total(int total) {
        stop8Total.setText(String.valueOf(total));
    }

    public void setStop9Total(int total) {
        stop9Total.setText(String.valueOf(total));
    }

    public void setStop10Total(int total) {
        stop10Total.setText(String.valueOf(total));
    }

    public void setStop11Total(int total) {
        stop11Total.setText(String.valueOf(total));
    }

    public void setStop12Total(int total) {
        stop12Total.setText(String.valueOf(total));
    }

    public void setStop13Total(int total) {
        stop13Total.setText(String.valueOf(total));
    }

    public void setStop1Boards(int total) {
        stop1Boards.setText(String.valueOf(total));
    }

    public void setStop2Boards(int total) {
        stop2Boards.setText(String.valueOf(total));
    }

    public void setStop3Boards(int total) {
        stop3Boards.setText(String.valueOf(total));
    }

    public void setStop4Boards(int total) {
        stop4Boards.setText(String.valueOf(total));
    }

    public void setStop5Boards(int total) {
        stop5Boards.setText(String.valueOf(total));
    }

    public void setStop6Boards(int total) {
        stop6Boards.setText(String.valueOf(total));
    }

    public void setStop7Boards(int total) {
        stop7Boards.setText(String.valueOf(total));
    }

    public void setStop8Boards(int total) {
        stop8Boards.setText(String.valueOf(total));
    }

    public void setStop9Boards(int total) {
        stop9Boards.setText(String.valueOf(total));
    }

    public void setStop10Boards(int total) {
        stop10Boards.setText(String.valueOf(total));
    }

    public void setStop11Boards(int total) {
        stop11Boards.setText(String.valueOf(total));
    }

    public void setStop12Boards(int total) {
        stop12Boards.setText(String.valueOf(total));
    }

    public void setStop13Boards(int total) {
        stop13Boards.setText(String.valueOf(total));
    }

    public void setTrainACurrentPassengers(int total) {
        trainATotalPassengers.setText(String.valueOf(total));
    }

    public void setTrainBCurrentPassengers(int total) {
        trainBTotalPassengers.setText(String.valueOf(total));
    }

    public void setTrainACurrentStop(String stopName) {
        trainACurrentStopName.setText(stopName);
    }

    public void setTrainBCurrentStop(String stopName) {
        trainBCurrentStopName.setText(stopName);
    }

    public void setTotalCompleted(int total) {
        totalCompleted.setText(String.valueOf(total));
    }
}