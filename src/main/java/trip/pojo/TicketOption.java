package trip.pojo;

import java.util.ArrayList;

/**
 * Created by Ibram on 06/06/2015.
 */
public class TicketOption {
    public ArrayList<Ticket> getListTicket() {
        return listTicket;
    }

    public void setListTicket(ArrayList<Ticket> listTicket) {
        this.listTicket = listTicket;
    }

    ArrayList<Ticket> listTicket;
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
