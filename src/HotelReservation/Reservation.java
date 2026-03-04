package HotelReservation;

import java.util.ArrayList;

class Reservation {
    String bookingId;
    String guest;
    String roomType;
    int nights;

    Reservation(String bookingId, String guest, String roomType, int nights) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.roomType = roomType;
        this.nights = nights;
    }

    public String toString() {
        return bookingId + " | " + guest + " | " + roomType + " | " + nights + " night(s)";
    }
}
