package phase1;
import java.util.Scanner;
public class Session7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * การทำซ้ำ (Loop)
        
        // * 1. While
        int count1 = 1;
        while (count1 <= 5) {
            System.out.println("Hello World : " + count1);
            count1++;
        }

        // * 2. For
        for (int count2 = 1; count2 <= 5; count2++) {
            System.out.println("Hello World (for) : " + count2);
        }
        // * 3. Do..While
        int count3 = 1;
        do {
            System.out.println("Hello World (do ... while) : " + count3);
            count3++;
        } while (count3 <= 5);

        // * break
        // กระโดดออกจากลูป
        int count4 = 1;
        while (count4 <= 5) {
            System.out.println("Hello World (break) : " + count4);
            if (count4 == 2) { break; }
            count4++;
        }

        // * continue
        // ข้ามลูปนี้ไป
        for (int count5 = 1; count5 <= 5; count5++) {
            if (count5 == 2) { continue; }
            System.out.println("Hello World (for) : " + count5);
        }
    }
}
