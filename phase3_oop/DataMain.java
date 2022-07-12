abstract class DataMain { // <= ระบุ abstract class ทุกครั้งที่มี abstract method ในคลาส 
    
    private String id;
    private String name;
    private Double salary;

    // * Constructor
    public DataMain () {
        System.out.println(("Create Object Success"));
    }

    public DataMain (String cons_id, String cons_name, Double cons_salary) {
        this.id     = cons_id;
        this.name   = cons_name;
        this.salary = cons_salary;
    }

    public DataMain (String cons_id, String cons_name) {
        this.id     = cons_id;
        this.name   = cons_name;
        displayEmployee();
    }

    // * setter
    public void setID (String set_id) {
        this.id = set_id;
    }

    public void setName (String set_name) {
        this.name = set_name;
    }

    public void setSalary (Double set_salary) {
        this.salary = set_salary;
    }

    // * getter 
    public String getName () {
        return this.name;
    }

    public Double getSalary () {
        return this.salary;
    }  

    // * method อื่นๆ
    public void displayEmployee () {
        System.out.println("id :" + this.id);
        System.out.println("name :" + this.name);
    }

    public void bonus () {
        System.out.println("Bonus = 10%");
    }

    // * ตัวอย่าง adstract method
    // เป้นการบังคับให้ class ลูกต้องมี method bonus2 ด้วย
    public abstract void bonus2 ();
}
