package HospitalAppointments;

import java.util.ArrayList;

class Appointment {
    String id;
    String patient;
    String doctor;
    String dateTime;

    Appointment(String id, String patient, String doctor, String dateTime) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    public String toString() {
        return id + " | " + patient + " | " + doctor + " | " + dateTime;
    }
}
