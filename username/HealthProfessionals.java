// Appointment.java
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTime;
    private HealthProfessional selectedDoctor; // 选定的医生

    // 默认构造函数
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.preferredTime = "";
        this.selectedDoctor = null;
    }

    // 第二个构造函数
    public Appointment(String patientName, String patientPhone, String preferredTime, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.selectedDoctor = selectedDoctor;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("Selected Doctor: ");
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
    }
}

