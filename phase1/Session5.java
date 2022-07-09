package phase1;
import java.util.Scanner;
public class Session5 {
    public static void main(String[] args) {
        
        // * โปรแกรมดัชนีมวลกาย
        /*
         * BMI = น้ำหนัก (กก) / ส่วนสูง (เมตร) ยกกำลัง 2 
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("sign weight (kg) : ");
        double weight = sc.nextDouble();
        
        System.out.print("sign height (cm) : ");
        double height = sc.nextDouble();
        height /= 100; // แปลงเซนติเมตรเป็นเมตร
        
        double bmi = weight / (height * height);
        
        System.out.println("weight = " + weight);
        System.out.println("height = " + height);
        System.out.println("BMI = " + bmi);

    }
}
