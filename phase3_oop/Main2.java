import javax.xml.crypto.Data;

public class Main2 {
    public static void main(String[] args) {
        
        // * setter and getter
        Data2 employee_1 = new Data2(); 

        // ใช้งาน setter
        employee_1.setID("002");
        employee_1.setName("nathasophon");
        employee_1.setSalary(14000.0);
        
        // ใช้งาน getter
        String name     = employee_1.getName();
        Double salary   = employee_1.getSalary();
        System.out.println("getter name : " + name);
        System.out.println("getter salary : " + salary);
    }
}
