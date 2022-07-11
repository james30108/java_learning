class Session1 {
    // function main ในการทำงาน
    public static void main(String[] argsStrings) { 
        System.out.print("Hello Java"); // แสดงข้อความ
        System.out.println("Hello World"); // แสดงข้อความบรรทัดใหม่ในบรรทัดต่อไป

        // * การนิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        int number1; // ตัวแปรแบบตัวเลข
        boolean status1; // ตัวแปรแบบ boolean

        // * การนิยามตัวแปรแบบระบุค่าเริ่มต้น
        int number2 = 20;
        boolean status2 = true;
        char alphabet = 'A';
        float number3 = 10.02f;

        // * การนิยามตัวแปรแบบหลายบรรทัดในครั้งเดียว
        int a = 0, b = 1, c = 2;

        // * การแสดงข้อความจากตัวแปร
        number1 = 50;
        System.out.println("ค่าตัวแปรคือ : "+number1);

        // * ค่าคงที่ คือค่าที่ไม่สามารถมีการเปลี่ยนแปลงภายหลังได้
        final int NUMBER4 = 100; // การตั้งชื่อค่าคงที่ควรเป็นตัวพิมพ์ใหญ่ทั้งหมด

        // * ตัวอย่าง การแสดงผลค่าสูงสุดและต่ำสุดของการเก็บข้อมูล
        System.out.println("integer / min : " + Integer.MIN_VALUE);
        System.out.println("integer / max : " + Integer.MAX_VALUE);
        System.out.println("long / max : " + Long.MAX_VALUE);
        System.out.println("long / min : " + Long.MIN_VALUE);

        // * การแปลงชนิดข้อมูล (Type Casting)
        // มี 2 แบบคือแปลงจากข้อมูลขนาดเล็กไปใหญ่ และแปลงจากใหญ่ไปเล็ก
        
        // 1 แปลงจากเล็กไปใหญ่
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

        // 2 แปลงจากใหญ่ไปเล็ก
        double numDouble2 = 10.0;
        int numInt2 = (int) numDouble2; // ทำการใส่ชนิดข้อมูลลงไปด้านหน้าข้อมูลที่ต้องการให้แปลง
        System.out.println(numInt2);
        System.out.println(numDouble2);

        // * ชนิดข้อมูลแบบ String
        String d = "100", e = "200";

        // ตัวอย่างการแปลง String เป็น int หรือ Double
        int f = Integer.parseInt(d); // คำสั่งแปลง String เป็น int
        double g = Double.parseDouble(e); // คำสั่งแปลง String เป็น double
        f = f + 50;
        g = g + 50.5;
        System.out.println(f);
        System.out.println(g);

        // ตัวอย่างการแปลงจาก int ไปเป็น String
        int number6 = 120;
        String str = String.valueOf(number6); // แปลง int เป็น string
        System.out.println(str);

        // * วิธีการเช็คชนิดข้อมูลตัวแปร
        Integer number7 = 130;
        String str2 = "Hello";
        boolean result1 = number7 instanceof Integer; // true or false
        boolean result2 = str2 instanceof String; // true or false
        System.out.println(result1);
        System.out.println(result2);

        // * Escape Character
        /*
         *  \n = ขึ้นบรรทัดใหม่
         *  \t = tab
        */
        System.out.println("Hello\t\tWorld");
        System.out.println("Hello\nWorld");
    }
}
