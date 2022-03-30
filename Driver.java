public class Driver {
    public static void main(String[] args) {

        // Instantiate all stops
        BusStop STOP_1 = new BusStop(1, "Camden");
        BusStop STOP_2 = new BusStop(2, "Collingswood");
        BusStop STOP_3 = new BusStop(3, "Audubon");
        BusStop STOP_4 = new BusStop(4, "Barrington");
        BusStop STOP_5 = new BusStop(5, "Voorhees");
        BusStop STOP_6 = new BusStop(6, "Lindenwold");
        BusStop STOP_7 = new BusStop(7, "Clementon");
        BusStop STOP_8 = new BusStop(8, "Pine Hill - Branch Ave");
        BusStop STOP_9 = new BusStop(9, "Pine Hill - Erial Rd");
        BusStop STOP_10 = new BusStop(10, "Blackwood");
        BusStop STOP_11 = new BusStop(11, "Gloucester Twp");
        BusStop STOP_12 = new BusStop(12, "Erial");
        BusStop STOP_14 = new BusStop(13, "Turnersville - Black Horse Pike");
        BusStop STOP_15 = new BusStop(14, "Turnersville - Tuckahoe Rd");

        Passenger p1 = new Passenger(1, 14);
        Passenger p2 = new Passenger(2, 13);
        Passenger p3 = new Passenger(5, 7);
        
        STOP_1.addWaitingPassenger(p1);
    }
}
