// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String specialty; // 额外的实例变量，区分全科医生

    // 默认构造函数
    public GeneralPractitioner() {
        super();
        this.specialty = "";
    }

    // 第二个构造函数
    public GeneralPractitioner(int id, String name, String info, String specialty) {
        super(id, name, info);
        this.specialty = specialty;
    }

    // 打印健康专家详细信息的方法
    public void printDetails() {
        System.out.println("Health Professional Details:");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}

// OtherHealthProfessional.java
public class OtherHealthProfessional extends HealthProfessional {
    private String field; // 额外的实例变量，用于其他类型的健康专家

    // 默认构造函数
    public OtherHealthProfessional() {
        super();
        this.field = "";
    }

    // 第二个构造函数
    public OtherHealthProfessional(int id, String name, String info, String field) {
        super(id, name, info);
        this.field = field;
    }

    // 打印健康专家详细信息的方法
    public void printDetails() {
        System.out.println("Health Professional Details:");
        super.printDetails();
        System.out.println("Field: " + field);
    }
}

