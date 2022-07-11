public class Session9 {

    // * การสร้าง Method (หรือ function)
    /*
        * การเขียนโดยทั่วไปจะเรียกว่า ฟังก์ชั่น(function) แต่ถ้าเขียนโปรแกรมแบบ OOP จะเรียกว่า เมธอด(method)
    */
    public static void main(String[] args) {

        // * การเรียกใช้งาน method (fuction)
        display1 ();
        display2 ("Hello Java"); // "Hello Java" คือ Argument
        
        // * การรับค่าที่ return ออกมาจาก method
        String my_ip = display3();
        System.out.println(my_ip);

        // * ส่งค่าและรับค่า
        int number1 = display4(10, 50);
        System.out.println(number1);

        int [] number2 = {10,20,30,40};
        display5(number2);

        int [] number3 = display6();
        System.out.println(number3[0]);

        display7(100, 200, 300, 400);

    }

    // * การสร้าง method (fuction)

    // * 1. แบบไม่มีการรับค่าอะไรและไม่ return ค่าออกมา
    // ต้องทำการระบุ static ด้วยหากต้องการให้ method นี้ไปทำงานที่ method ที่มีการทำงานแบบ static เหมือนกัน
    static void display1 () {
        System.out.println("Hello world");
    }

    // * 2. method แบบระบุ parameter
    static void display2 (String message) {
        System.out.println(message);
    }

    // * 3. แบบที่มีการ return ค่าออกจาก method
    /*
     * ถ้ามีการส่งค่ากลับออกมาสามารถเปลี่ยน void เป็นรูปแบบชนิดข้อมูลที่ต้องการ return ออกมาได้
     * void = ไม่มีการส่งค่าอะไรออกมาเลย
    */
    static String display3 () {
        return "127.0.0.1";
    }

    // * 4. method ที่มีการรับค่าเข้ามาและ return ค่าออกไป
    static int display4 (int a, int b) {
        int c = a + b;
        return c;
    }

    // * Method ที่รับค่า Array
    static void display5 (int [] number2) {
        for (int i = 0; i < number2.length; i++) {
            System.out.println("method array : " + number2[i]);
        }
    }

    // * Return ค่าออกมาเป็น Array
    static int [] display6 () {
        int [] number = {10,120,1200};
        return number;
    }

    // * Variable Argument หรือ parameter แบบไม่จำกัดจำนนวน
    static void display7 (int ...number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Variable Argument : " + number[i]);
        }
    }

    // * การกระโดดออกจาก method สามารถใช้คำสั่ง return; เปล่าๆได้เลย
}
