public class Session8 {
    public static void main(String[] args) {
        
        // * Array

        // * 1. การสร้าง Array แบบกำหนดขนาด
        int[] number1 = new int[4]; // กำหนดว่าจะเก็บ 4 ค่าเท่านั้น
        String[] str1 = new String[4]; // กำหนดว่าจะเก็บ 4 ค่าเท่านั้น

        // การกำหนดค่า
        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 40;

        str1[0] = "string 1";
        str1[1] = "string 2";
        str1[2] = "string 3";
        str1[3] = "string 4";

        System.out.println(number1[0]);
        System.out.println(str1[0]);
        
        // * 2. การสร้าง Array แบบกำหนดสมาชิก
        int[] number2 = {10,20,30,40};
        System.out.println(number2[1]);

        // * การนับจำนวนสมาชิก Array
        System.out.println(number2.length);

        // * เข้าถึงสมาชิกด้วย Loop For
        for (int i = 0; i < number2.length; i++) {
            System.out.println("for loop : " + number2[i]);
        }

        // * การเข้าถึงสมาชิกด้วย ForEach
        for (String data : str1) {
            System.out.println("for_each loop : " + data);
        }

        // * Array 2 มิติ
        // ปีกกาแรกคือ แถว(row) ปีกกาที่สองคือ คอลัมน์(column)
        String [][] str2 = { 
            {"shirt", "skirt", "dress"},
            {"keyboard", "mouse", "monitor"},
            {"tape", "vcd", "dvd"}
        };
        System.out.println("array 2 dimension : " + str2[0][0]);
        System.out.println("array 2 dimension : " + str2[1][1]);
        System.out.println("array 2 dimension : " + str2[2][2]);

        // * การเข้าถึง Array 2 มิติ โดย Loop For
        for (int row = 0; row < str2.length; row++) {
            for (int column = 0; column < str2[row].length; column++) {
                System.out.println("array 2 dimension For_loop : " + str2[row][column]);
            }
        }

        // * เปลี่ยนค่า Array
        int [] number3 = {10,20,30,40};
        number3[0] = 100;
        System.out.println("change 10 to : " + number3[0]);
    }
}
