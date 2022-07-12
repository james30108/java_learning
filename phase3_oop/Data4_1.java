
// * การสืบทอดคุณสมบัติ (Inheritance) & การพ้องรูป (Polymorphism) 

// ทำการรับข้อมูลจาก Data2
class Data4_1 extends DataMain { //extends คือการสืบทอดคุณสมบัติ
    
    // * การสืบทอดคุณสมบัติ (Inheritance)
    // Constructer
    public Data4_1 () {
        System.out.println("Programer Create");
    } 

    public Data4_1 (String id, String name) {

        // super คือคีย์เวิร์ดสำหรับเรียกใช้งาน Constructer ของ super class (คลาสแม่)
        super(id, name);

        System.out.print("I'm Programer");
    }
    
    // * การพ้องรูป (Polymorphism) 
    // ชื่อเทธอดเหมือนกันแต่ต่างกันตรง parameter ที่รับเข้ามา

    public void skill () {
        System.out.println("no skill");
    }
    
    public void skill (String language) {
        System.out.println("skill : " + language);
    }

    public void skill (String language_1, String language_2) {
        System.out.println("skill : " + language_1 + " / " + language_2);
    }

    // สำหรับรับพารามิเตอร์แบบไม่จำกัด
    public void skill (String...language) {
        for (int i = 0; i < language.length; i++) {
            System.out.println("skill : " + language[i]);
        }
    }

    // * Overiding หรือการทำ method ทับกับ method ของ super class
    // ชื่อ method ต้องเหมือนของ super class
    public void bonus () {
        System.out.println("Bonus = 20%");
    }

    // * abstract method
    public void bonus2 () {
        System.out.println("Bonus = 50%");
    }
}
