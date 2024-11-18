// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 第3部分 - 使用类和对象
        System.out.println("// 第3部分 - 使用类和对象");

        // 创建全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practitioner", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practitioner", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Lee", "General Practitioner", "Internal Medicine");

        // 创建其他健康专业人员对象
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Brown", "Surgeon", "Surgery");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Green", "Dermatologist", "Dermatology");

        // 打印详细信息
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        ohp1.printDetails();
        ohp2.printDetails();

        System.out.println("---------------------");
    }
}

