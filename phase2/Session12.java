import java.util.Scanner;
public class Session12 {

    // ระบุุ static เพื่อสามารถให้ไปใช้ใน method ได้
    static int balance = 5000;
    public static void main(String[] args) {
        
        // * การจัดการข้อผิดพลาด (Exception)
         
        /*
         * ข้อผิดพลาดมีหลายแบบมากให้ลองศุกษาชื่อ Exception เพิ่มเติมได้
         * try = การทำงานปกติ
         * catch = การทำงานเมื่อโปรแกรมผิดพลาด
         * finally = การทำงานต่อไปแม้จะมีหรือไม่มีข้อมผิดพลาดเกิดขึ้น 
         * 
         * throw = การเพิ่มตัวตรวจสอบความถูกต้องของระบบ
        */
        try { // ทำงานปกติ

            Scanner sc = new Scanner(System.in); 
            System.out.print("number : ");
            int number = sc.nextInt();

            withdraw(number);

            // การใช้งาน Throw
            // กรณีที่ใช้งาน thow แบบธรรมดาไม่ผ่าน method
            // if (number < 0) {
            //     throw new Exception ("error - zero");
            // }

        } catch (Exception e) { // กรณีที่ทำงานผิดพลาด

            System.out.println ("error");
            e.printStackTrace(); // แสดงข้อความกรณีที่ผิดพลาด

        } finally {
            
            System.out.println ("next process");

        }
    }

    // *ถ้าใน method มีการใช้งาน throw ให้ระบุ throws ให้แก่ method ในส่วนของการนิยามด้วย 
    static void withdraw (int amount) throws Exception {

        if (amount <= 0) {
            throw new Exception("Please sign number more than zero");
        }
        if (amount > balance) {
            throw new Exception("Money not enaugh");
        }
        balance -= amount;
        System.out.println("withdraw : " + amount);
        System.out.println("Balance : " + balance);

    }
}
