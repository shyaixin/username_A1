/**
 * HealthProfessional class represents a health professional with an ID, name, and specialty.
 */
public class HealthProfessional {

    /**
     * The ID of the health professional.
     */
    private int id;

    /**
     * The name of the health professional.
     */
    private String name;

    /**
     * The specialty of the health professional.
     */
    private String specialty;

    /**
     * Default constructor that initializes the health professional with default values.
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialty = "General";
    }

    /**
     * Parameterized constructor that initializes the health professional with the given values.
     *
     * @param id The ID of the health professional.
     * @param name The name of the health professional.
     * @param specialty The specialty of the health professional.
     */
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    /**
     * Prints the details of the health professional.
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }


    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
