package org.tyaa.ticketbookerproto.modules;

import org.tyaa.ticketbookerproto.modules.interfaces.TicketBookerInterface;
import java.util.Date;

/**
 * Created by yurii on 07.10.17.
 */

public class TicketBooker implements TicketBookerInterface {

    private static boolean mBooked;
    private static TicketBooker mInstance;

    private TicketBooker() {
        mBooked = false;
    }

    public static TicketBooker getInstance(){
        if (mInstance == null) {mInstance = new TicketBooker();}
        return mInstance;
    }

    @Override
    public void bookTicket(Object sender, String from, String to, Date date, int pos, String trainNumber, String carType, String carNumber, int seatNumber) {

        
    }

    public static void setBooked(boolean _booked) {
        mBooked = _booked;
    }

    public static boolean isBooked() {
        return mBooked;
    }
}
