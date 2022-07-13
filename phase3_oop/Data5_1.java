// สืบทอดจาก Data5_main และ Data5_child

// extends คือ การสืบทอดจากคลาสแม่
// implements คือ การหยิบเอาสิ่งของในคลาสนั้นมาใช้งานได้โดยไม่มีกฏบังคับ

public class Data5_1 extends Data5_main implements Data5_child, Data5_child2 {
    
    private String skill;
    public void skill (String skill) {
        this.skill = skill;
        System.out.println("skill : " + this.skill);
    }

    // * Interface 
    public void moving (String moving) {
        System.out.println("moving : " + moving);
    }
    public void weapon (String weapon) {
        System.out.println("weapon : " + weapon);
    }
    public void jumping (String jumping) {
        System.out.println("jumping : " + jumping);
    }
    public void nation (String nation) {
        System.out.println("nation : " + nation);
    }

}
