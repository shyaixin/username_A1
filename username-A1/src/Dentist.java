/**
 * Prints the details of the appointment.
 */
public class Dentist extends HealthProfessional {

    /**
     * The dental specialty of the dentist.
     */
    private String dentalSpecialty;

    /**
     * Default constructor that initializes the dentist with default values.
     */
    public Dentist() {
        super();
        this.dentalSpecialty = "General Dentistry";
    }

    /**
     * Parameterized constructor that initializes the dentist with the given values.
     *
     * @param id The ID of the dentist.
     * @param name The name of the dentist.
     * @param specialty The specialty of the health professional.
     * @param dentalSpecialty The dental specialty of the dentist.
     */
    public Dentist(int id, String name, String specialty, String dentalSpecialty) {
        super(id, name, specialty);
        this.dentalSpecialty = dentalSpecialty;
    }

    /**
     * Prints the details of the health professional.
     */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: Dentist");
        super.printDetails();
        System.out.println("Dental Specialty: " + dentalSpecialty);
        System.out.println();
    }

    // Getter 和 Setter
    public String getDentalSpecialty() {
        return dentalSpecialty;
    }

    public void setDentalSpecialty(String dentalSpecialty) {
        this.dentalSpecialty = dentalSpecialty;
    }
}
