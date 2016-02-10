package CH10;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nikhil on 1/15/2016.
 */
public class ShowSingalton {
    private static final ShowSingalton INSTANCE = new ShowSingalton();
    private Set<String> availableSeats;
    public static ShowSingalton getInstance(){
        return INSTANCE;
    }
    private ShowSingalton(){
        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1A");
    }

    private static void ticketAgentBooks(String seat) {
        ShowSingalton showSingalton = ShowSingalton.getInstance();
        System.out.println(showSingalton.bookSeat(seat));
    }
}


