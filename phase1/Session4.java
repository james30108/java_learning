import java.util.Scanner;
public class Session4 {
    public static void main(String[] args) {
        
        // * ตัวนำเดินการ (Oparator) หรือการคำนวน
        Scanner sc = new Scanner(System.in);
        System.out.print("number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("number 2 : ");
        int num2 = sc.nextInt();

        int result1 = num1 + num2;
        System.out.println("result : " + result1);

        // * ตัวนำเดินการเปรียบเทียบ
        // ค่าที่ได้จะออกมาเป็น true, false
        int num3 = 10, num4 = 20;
        boolean result2 = (num3 == num4);
        boolean result3 = (num3 <= num4);
        boolean result4 = (num3 >= num4);
        boolean result5 = (num3 != num4);

        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
        System.out.println("result5 : " + result5);

        // * ตัวดำเนินการทางตรรกะศาสตร์
        // && = AND, || = OR, ! = NOT
        boolean result6 = (result2 && result3);
        boolean result7 = (result2 || result3);
        boolean result8 = (!result2);

        System.out.println("result6 : " + result6);
        System.out.println("result7 : " + result7);
        System.out.println("result8 : " + result8);

        // * ตัวดำเนินการเพิ่มค่า, ลดค่า (เพิ่มค่า = ++, ลดค่า = --)
        // แบบ prefix 
        System.out.println(num3); // 10
        System.out.println(++num3); // 11
        System.out.println(num3); // 11
        // แบบ postfix
        System.out.println(num4); // 20
        System.out.println(num4++); // 20
        System.out.println(num4); // 21

        // * การคำนวนแบบลดรูป (Compound Assignment)
        /*
         * x += y มีค่าเท่ากับ x = x + y
         * x -= y มีค่าเท่ากับ x = x - y
         * x *= y มีค่าเท่ากับ x = x * y
         * x /= y มีค่าเท่ากับ x = x / y
         * x %= y มีค่าเท่ากับ x = x % y
         *  
        */

    }
}
