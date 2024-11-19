/**
 * Prints the details of the health professional.
 */
public class GeneralPractitioner extends HealthProfessional {

    /**
     * The clinic location of the general practitioner.
     */
    private String clinicLocation;

    /**
     * Default constructor that initializes the general practitioner with default values.
     */
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Unknown Location";
    }

    /**
     * Parameterized constructor that initializes the general practitioner with the given values.
     *
     * @param id The ID of the general practitioner.
     * @param name The name of the general practitioner.
     * @param specialty The specialty of the health professional.
     * @param clinicLocation The clinic location of the general practitioner.
     */
    public GeneralPractitioner(int id, String name, String specialty, String clinicLocation) {
        super(id, name, specialty);
        this.clinicLocation = clinicLocation;
    }

    /**
     * Prints the details of the health professional.
     */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
        System.out.println();
    }


    // Getter & Setter
    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }
}
