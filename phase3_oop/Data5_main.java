abstract class Data5_main {
    
    // * Interface
    private String name;
    private String age;
    private String job;

    public void setName (String name) {
        this.name = name;
    }
    public void setAge (String age) {
        this.age = age;
    }
    public void setJob (String job) {
        this.job = job;
    }

    public void display () {
        System.out.println("Names : " + this.name + " // Age : " + this.age);
    }

    public abstract void skill(String skill);
}
