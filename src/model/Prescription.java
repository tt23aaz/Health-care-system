package model;

import java.time.LocalDate;

public class Prescription {

    private String prescription_ID;
    private String patient_ID;
    private String clinician_ID;
    private String appointment_ID;
    private LocalDate prescription_date;
    private String medication_name;
    private String dosage;
    private String frequency;
    private Integer duration_days;
    private String quantity;
    private String instructions;
    private String pharmacy_name;
    private String status;
    private LocalDate issue_date;
    private LocalDate collection_date;
}