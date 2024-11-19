/**
 * This class represents an appointment made by a patient with a doctor.
 */
public class Appointment {


    /**
     * The name of the patient.
     */
    private String patientName;

    /**
     * The mobile number of the patient.
     */
    private String patientMobile;


    /**
     * The preferred time slot for the appointment.
     */
    private String preferredTimeSlot;


    /**
     * The selected doctor for the appointment.
     */
    private HealthProfessional selectedDoctor;

    /**
     * Default constructor that initializes the appointment with default values.
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.preferredTimeSlot = "09:00";
        this.selectedDoctor = null;
    }

    /**
     * Parameterized constructor that initializes the appointment with the given values.
     *
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param preferredTimeSlot The preferred time slot for the appointment.
     * @param selectedDoctor The selected doctor for the appointment.
     */
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    /**
     * Prints the details of the appointment.
     */
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (selectedDoctor != null) {
            System.out.println("Selected Doctor:");
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
        System.out.println();
    }


    public String getPatientName() {
        return patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}
