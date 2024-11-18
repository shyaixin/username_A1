// HealthProfessional.java
public class HealthProfessional {
    protected int id;
    protected String name;
    protected String info; // 与医生类型无关的基本信息

    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.info = "";
    }

    // 第二个构造函数
    public HealthProfessional(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Info: " + info);
    }
}


