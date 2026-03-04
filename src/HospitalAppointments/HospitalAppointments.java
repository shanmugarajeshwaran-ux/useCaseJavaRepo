package HospitalAppointments;

import java.util.ArrayList;

public class HospitalAppointments {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void book(String id, String patient, String doctor, String dateTime) {
        appointments.add(new Appointment(id, patient, doctor, dateTime));
    }

    public boolean cancel(String id) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).id.equals(id)) {
                appointments.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Appointment> findByPatient(String name) {
        ArrayList<Appointment> r = new ArrayList<>();
        for (Appointment a : appointments) if (a.patient.equalsIgnoreCase(name)) r.add(a);
        return r;
    }

    public ArrayList<Appointment> findByDoctor(String name) {
        ArrayList<Appointment> r = new ArrayList<>();
        for (Appointment a : appointments) if (a.doctor.equalsIgnoreCase(name)) r.add(a);
        return r;
    }

    public void listAll() {
        for (Appointment a : appointments) System.out.println(a);
    }

    public static void main(String[] args) {
        HospitalAppointments ha = new HospitalAppointments();
        ha.book("A1001", "Priya", "Dr.Rao", "2026-03-05 10:00");
        ha.book("A1002", "Sanjay", "Dr.Rao", "2026-03-05 10:30");
        ha.book("A1003", "Priya", "Dr.Mehta", "2026-03-06 09:00");
        System.out.println(ha.findByPatient("Priya").size());
        System.out.println(ha.findByDoctor("Dr.Rao").size());
        ha.cancel("A1002");
        ha.listAll();
    }
}
