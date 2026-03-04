package HotelReservation;

import java.util.ArrayList;

public class HotelReservation {
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void create(String bookingId, String guest, String roomType, int nights) {
        reservations.add(new Reservation(bookingId, guest, roomType, nights));
    }

    public boolean cancel(String bookingId) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).bookingId.equals(bookingId)) {
                reservations.remove(i);
                return true;
            }
        }
        return false;
    }

    public Reservation findById(String bookingId) {
        for (Reservation r : reservations) if (r.bookingId.equals(bookingId)) return r;
        return null;
    }

    public ArrayList<Reservation> findByGuest(String guest) {
        ArrayList<Reservation> r = new ArrayList<>();
        for (Reservation x : reservations) if (x.guest.equalsIgnoreCase(guest)) r.add(x);
        return r;
    }

    public void listAll() {
        for (Reservation r : reservations) System.out.println(r);
    }

    public static void main(String[] args) {
        HotelReservation hr = new HotelReservation();
        hr.create("B001", "Anitha", "Deluxe", 2);
        hr.create("B002", "Rahul", "Suite", 3);
        hr.create("B003", "Anitha", "Standard", 1);
        System.out.println(hr.findById("B002"));
        System.out.println(hr.findByGuest("Anitha").size());
        hr.cancel("B003");
        hr.listAll();
    }
}

