import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {
    // Declares an ArrayList to store Appointment objects
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 1, 2 are implemented in other classes

        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Creates three GeneralPractitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice Smith", "Family Medicine", "Downtown Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Bob Johnson", "Internal Medicine", "Uptown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Carol Williams", "Pediatrics", "Midtown Clinic");

        // Creates two Dentist objects
        Dentist dentist1 = new Dentist(4, "Dr. David Brown", "Dental Care", "Orthodontics");
        Dentist dentist2 = new Dentist(5, "Dr. Eva Davis", "Dental Care", "Endodontics");

        // Prints details of all health professionals
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        dentist1.printDetails();
        dentist2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Creates two appointments with GeneralPractitioner
        createAppointment("John Doe", "114514919", "08:00", gp1);
        createAppointment("Jane Smith", "95279527", "10:00", gp2);

        // Creates two appointments with Dentist
        createAppointment("Mike Johnson", "1234567", "14:30", dentist1);
        createAppointment("Emily Davis", "7654321", "16:00", dentist2);

        // Prints existing appointments
        printExistingAppointments();

        // Cancels an appointment (based on patient's mobile number)
        cancelBooking("114514919");

        // Prints updated appointment list
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    // Create a new appointment and add it to the appointments list
    /**
     * Creates a new appointment and adds it to the appointments list.
     *
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param preferredTimeSlot The preferred time slot for the appointment.
     * @param selectedDoctor The selected doctor for the appointment.
     */
    public static void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        if (patientName == null || patientName.isEmpty() ||
                patientMobile == null || patientMobile.isEmpty() ||
                preferredTimeSlot == null || preferredTimeSlot.isEmpty() ||
                selectedDoctor == null) {
            System.out.println("Unable to create an appointment: all information is required.");
            return;
        }

        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);
        appointments.add(newAppointment);
        System.out.println("Appointment has been created:");
        newAppointment.printAppointmentDetails();
    }

    /**
     * Prints all existing appointments.
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("There are currently no appointments.");
            return;
        }

        System.out.println("The existing appointment list:");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
        }
    }

    /**
     * Cancels an appointment based on the patient's mobile number.
     *
     * @param patientMobile The mobile number of the patient.
     */
    public static void cancelBooking(String patientMobile) {
        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getPatientMobile().equals(patientMobile)) {
                iterator.remove();

                System.out.println("Appointment canceled, patient's phone number:" + patientMobile);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Cancellation failed: Appointment with phone number " + patientMobile + " not found.");
        }
    }
}
