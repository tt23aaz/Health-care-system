package model;

import java.time.LocalDate;;

public class Referral {

    private String referral_ID;
    private String patient_ID;
    private String referring_clinician_ID;
    private String referred_to_clinician_ID;
    private String referring_facility_ID;
    private String referred_to_facility_ID;
    private LocalDate referral_date;
    private String urgency_level;
    private String referral_reason;
    private String clinical_summary;
    private String requested_investigations;
    private String status;
    private String appointment_ID;
    private String notes;
    private LocalDate created_date;
    private LocalDate last_updated;
}
