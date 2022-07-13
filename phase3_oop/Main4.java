public class Main4 {
    public static void main(String[] args) {
        
        // * การสืบทอดคุณสมบัติ (Inheritance) & การพ้องรูป (Polymorphism) 

        // * การสืบทอดคุณสมบัติ (Inheritance)
        Data4_1 programer1 = new Data4_1("001", "james");

        // * การพ้องรูป (Polymorphism) 
        Data4_1 programer2 = new Data4_1();
        programer2.skill();
        Data4_1 programer3 = new Data4_1();
        programer3.skill("JAVA");
        Data4_1 programer4 = new Data4_1();
        programer4.skill("JAVA", "Phython");
        Data4_1 programer5 = new Data4_1();
        programer5.skill("JAVA", "Phython", "C#", "PHP");

        // * ตัวอย่าง Overiding
        Data4_1 programer6 = new Data4_1();
        programer6.bonus();

        // * ตัวอย่าง Abstract Method
        Data4_1 programer7 = new Data4_1();
        programer7.bonus2();

    }
}
