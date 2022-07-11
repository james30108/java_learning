public class Session11 {
    public static void main(String[] args) {
        
        // * เจาะลึกเรื่องตัวแปร String

        // * สร้าง String แบบธรรมดา
        String str1 = "Hello Java Java";

        // * สร้างแบบ Object
        String str2 = new String ("Hello java");
        System.out.println(str2);

        // * การต่อ String
        String result1 = str1 + str2 + " Hello James";

        // * หาความยาวตัวอักษร
        System.out.println(str1.length());

        // * หาตำแหน่งตัวอักษร
        System.out.println(str1.charAt(1));

        // * การเปรียบเทียบตัวอักษร
        System.out.println(str1.equals(str2));

        // * การเปรียบเทียบตัวอักษรแบบไม่สนใจตัวพิมพ์เล็กหรือพิมพ์ใหญ่
        System.out.println(str1.equalsIgnoreCase(str2));

        // * หาตัวอักษรแรกสุด
        System.out.println(str1.startsWith("Hello"));

        // * หาตัวอักษรสุดท้าย
        System.out.println(str1.endsWith("java"));
        
        // * การค้นหาตำแหน่งคำในข้อความ
        System.out.println(str1.indexOf("ell"));

        // * การแทนที่ข้อความ
        System.out.println(str1.replace("Java", "James"));
        
        // * การแทนที่ข้อความ (เปลี่ยนแค่ตัวแรก ในกรณีที่พบข้อความหลายที่)
        System.out.println(str1.replaceFirst("Java", "James"));
        
        // * การเปลี่ยน String เป็น Array
        String str3 = "tape,vcd,dvd";
        String [] str4 = str3.split(",");
        System.out.println(str4[0]);

        // * การหาข้อความย่อย หรือ Sub String
        // ทำการระบุจุดเริ่มต้น (ตำแหน่ง 0) และจุดสุดท้ายที่ต้องการ (ตำแหน่งสุดท้ายคือ -1)
        System.out.println(str1.substring(0, 2));

        // * การแปลง String เป็น Character
        char [] char1 = str1.toCharArray();
        System.out.println(char1[0]);

        // * การแปลง Character เป็น String
        char [] char2 = {'j', 'a', 'm', 'e', 's'};
        String str5 = String.copyValueOf(char2);
        System.out.println(str5);

        // * การตัดช่องว่าง ซ้าย-ขวา
        System.out.println(str5.trim());

        // * เปลี่ยนเป็นพิมพ์ใหญ่ทั้งหมด
        System.out.println(str1.toUpperCase());

        // * เปลี่ยนเป็นพิมพ์เล็กทั้งหมด
        System.out.println(str1.toLowerCase());

        // * แปลงตัวเลขให้เป้็น String
        int number = 100;
        System.out.println(String.valueOf(number));
    }
}
