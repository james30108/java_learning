class Data3 {

    /*

     * Constructor หรือเมธอดพิเศษ

    จะถูกสั่งให้ทำงานอัติโนมัติ เพื่อกำหนดค่าเริ่มต้นให้กับ object 
    - มีชื่อเหมือน class
    - method ธรรมดาจะมีการคืนค่ากลับ แต่ Constructor จะไม่มีการคืนค่ากลับ
    - จะมีการประกาศการเข้าถึงแบบ public
    - ชื่อสามารถซ้ำกันได้

    */

    private String id;
    private String name;
    private Double salary;
    
    // Default Constructor
    public Data3 () {
        System.out.println(("Create Object Success"));
    }

    // Constructor ที่มีการส่งค่าเข้าไป
    public Data3 (String cons_id, String cons_name, Double cons_salary) {
        this.id     = cons_id;
        this.name   = cons_name;
        this.salary = cons_salary;
    }

    // Constructor ที่มีการส่งค่าเข้าไป
    public Data3 (String cons_id, String cons_name) {
        this.id     = cons_id;
        this.name   = cons_name;
    }

    public void getEmployee () {
        System.out.println("employee id : " + this.id);
        System.out.println("employee name : " + this.name);
        System.out.println("employee salary : " + this.salary);
    }
    
}
