import javax.xml.crypto.Data;

public class Main1 {
    public static void main(String[] args) {
        
        // * การสร้าง Object 
        Data1 employee = new Data1(); 

        // การอ้างอิง Attribute ใน Object 
        employee.id     = "001";
        employee.name   = "james";
        employee.salary = 15000.0; 
        
        // การเรียกใช้งาน Method ใน Object
        employee.getEmployee();

        // * การเรียกใช้งาน static
        System.out.println("static attribute = " + Data1.minSalary);
        Data1.service();

    }
}
