package phase1;
import java.util.Scanner;

class Session3 {
    public static void main(String[] args) {
        
        // * การรับค่าข้อมูล

        // ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in); 
        System.out.print("sign name : ");
        String name = sc.nextLine(); // ไว้เก็บข้อมูลที่ป้อนเข้ามา
        System.out.println("Your name is " + name);

        // ตัวอย่างการรับข้อมูลตัวเลขเพื่อนำไปคำนวนต่อ
        System.out.print("sign year : ");
        int year = sc.nextInt(); // เก็บเฉพาะตัวเลข สามารถใช้ nextFloat, nextDouble ด้วยก็ได้
        System.out.println("You was born in : " + year);

        // ตัวอย่างการใช้งานคำสั่ง next(), nextLine()
        // nextLine() คือการอ่านข้อความที่ได้จากแป้นพิมพ์ทั้งบรรทัด
        // next() คือการรับค่าจากแป้นพิมพ์โดยไม่อนุญาตให้มีช่องว่างระหว่างคำ
        int address = sc.next();
        System.out.println("Your address is : " + address);

        
    }
}