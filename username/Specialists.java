// Main.java (继续)
import java.util.ArrayList;

public class Main {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // 第3部分 - 使用类和对象
        System.out.println("// 第3部分 - 使用类和对象");
        // 创建健康专业人员的对象（省略，见上文）

        // 第5部分 - 预约集合
        System.out.println("// 第5部分 - 预约集合");
        createAppointment("Alice", "1234567890", "08:00", gp1);
        createAppointment("Bob", "0987654321", "10:00", gp2);
        createAppointment("Charlie", "1122334455", "14:30", ohp1);
        createAppointment("David", "2233445566", "09:00", ohp2);

        printExistingAppointments();

        cancelBooking("0987654321"); // 取消 Bob 的预约
        System.out.println("---------------------");
        printExistingAppointments(); // 打印更新后的预约
    }

    public static void createAppointment(String patientName, String patientPhone, String preferredTime, HealthProfessional doctor) {
        if (patientName.isEmpty() || patientPhone.isEmpty() || preferredTime.isEmpty() || doctor == null) {
            System.out.println("Cannot create appointment. Please provide all necessary information.");
            return;
        }
        Appointment appointment = new Appointment(patientName, patientPhone, preferredTime, doctor);
        appointments.add(appointment);
        System.out.println("Appointment created for: " + patientName);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("---------------------");
            }
        }
    }

    public static void cancelBooking(String patientPhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).patientPhone.equals(patientPhone)) {
                appointments.remove(i);
                System.out.println("Appointment canceled for phone: " + patientPhone);
                return;
            }
        }
        System.out.println("No appointment found for phone: " + patientPhone);
    }
}

