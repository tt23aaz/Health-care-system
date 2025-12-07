package model;

import java.time.LocalDate;

public class Appointment {

    private String appointment_ID;
    private String patient_ID;
    private String clinician_ID;
    private String facility_ID;
    private LocalDate appointment_date;
    private String appointment_time;
    private Integer duration_minutes;
    private String appointment_type;
    private String status;
    private String reason_for_visit;
    private String notes;
    private LocalDate created_date;
    private LocalDate last_modified;
}
