class Data2 {

    // * Setter and Getter
    
    private String id;
    private String name;
    private Double salary;


    // * 1 setter คือ ตัวกำหนดค่าตัวแปรในคลาสนี้ จากการทำงานภายนอกคลาส
    public void setID (String set_id) {
        this.id = set_id;
    }

    public void setName (String set_name) {
        this.name = set_name;
    }

    public void setSalary (Double set_salary) {
        this.salary = set_salary;
    }

    // * 2 getter คือการส่งค่าในตัวแปรนี้ออกไปให้คลาสอื่นใช้งาน (return ค่าออกไปนอก class)
    public String getName () {
        return this.name;
    }

    public Double getSalary () {
        return this.salary;
    }  

    public void displayEmployee () {
        System.out.println("name :" + this.name);
        System.out.println("salary :" + this.salary);
    }
}
