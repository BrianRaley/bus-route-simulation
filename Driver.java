public class Driver {
    public static void main(String[] args) {

        // Instantiate all stops
        BusStop STOP_1 = new BusStop(1, "Lindenwold");
        if(Bus.getAscending() == true){
            Bus.getTimeCounter();
        }
        BusStop STOP_2 = new BusStop(2, "Ashland");
        if(Bus.getAscending() == true){
            Bus.increaseTime(2);
            Bus.getTimeCounter();
        }
        BusStop STOP_3 = new BusStop(3, "Woodcrest");
        if(Bus.getAscending() == true){
            Bus.increaseTime(1);
            Bus.getTimeCounter();
        }
        BusStop STOP_4 = new BusStop(4, "Haddonfield");
        if(Bus.getAscending() == true){
            Bus.increaseTime(3);
            Bus.getTimeCounter();
        }
        BusStop STOP_5 = new BusStop(5, "Westmont");
        if(Bus.getAscending() == true){
            Bus.increaseTime(2);
            Bus.getTimeCounter();
        }
        BusStop STOP_6 = new BusStop(6, "Collingswood");
        if(Bus.getAscending() == true){
            Bus.increaseTime(2);
            Bus.getTimeCounter();
        }
        BusStop STOP_7 = new BusStop(7, "Ferry Ave");
        if(Bus.getAscending() == true){
            Bus.increaseTime(2);
            Bus.getTimeCounter();
        }
        BusStop STOP_8 = new BusStop(8, "Broadway");
        if(Bus.getAscending() == true){
            Bus.increaseTime(4);
            Bus.getTimeCounter();
        }
        BusStop STOP_9 = new BusStop(9, "City Hall");
        if(Bus.getAscending() == true){
            Bus.increaseTime(4);
            Bus.getTimeCounter();
        }
        BusStop STOP_10 = new BusStop(10, "8th and Locust");
        if(Bus.getAscending() == true){
            Bus.increaseTime(5);
            Bus.getTimeCounter();
        }
        BusStop STOP_11 = new BusStop(11, "9th and Locust");
        if(Bus.getAscending() == true){
            Bus.increaseTime(2);
            Bus.getTimeCounter();
        }
        BusStop STOP_12 = new BusStop(12, "12th and Locust");
        if(Bus.getAscending() == true){
            Bus.increaseTime(1);
            Bus.getTimeCounter();
        }

        BusStop STOP_13 = new BusStop(12, "15th and Locust");
        if(Bus.getAscending() == true){
            Bus.increaseTime(1);
            Bus.getTimeCounter();
        }
        
        Passenger p1 = new Passenger(1, 14);
        Passenger p2 = new Passenger(2, 13);
        Passenger p3 = new Passenger(5, 7);
        
        STOP_1.addWaitingPassenger(p1);
    }
}
