final class Data1 { // final ทำให้ไม่สามารถสืบทอดคลาสได้

    // * 1. คุณสมบัติของคลาสนี้ (Attribute)
    public String id;
    public String name;
    public Double salary;

    // * final attribute
    public final String company = "deer-ary"; // ค่าคงที่

    // * static attribute
    static int minSalary = 12000;

    // * 2. พฤติกรรมของคลาส (Method)

    // Default Constructor
    public Data1 () {
        System.out.println(("Create Object Success"));
    }

    // สำหรับแสดงข้อมูล
    public void getEmployee () {
        System.out.println("employee id : " + this.id);
        System.out.println("employee name : " + this.name);
        System.out.println("employee salary : " + this.salary);
    }

    // * static method
    static void service () {
        System.out.println("Static Method");
    }
}
