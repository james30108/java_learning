import java.util.Scanner;
public class Session6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * การสร้างเงื่อนไขในการทำงาน หรือ if, else (Condition)
        
        
        // * 1. if, else 
        boolean result1 = 10 < 5;

        if (result1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // * 1.1 elseif
        int result2 = 10;

        if (result2 > 100) {
            System.out.println("more 100");
        }
        else if (result2 > 0 && result2 <= 100) {
            System.out.println("between 0 and 100");
        }
        else {
            System.out.println("zero");
        }

        // * 1.2 แบบลดรูป
        String result3 = (result2 % 2 == 0) ? "เลขคู่" : "เลขคี่";
        System.out.println(result3);

        // * 2. swich ... case
        System.out.println("sing number of month : ");
        int month = sc.nextInt();
        String name;

        switch (month) {
            case 1:
                name = "มกราคม";
                break;
            case 2:
                name = "กุมภา";
                break;
            default:
                name = "เดือนอื่นๆ";
                break;
        }
        System.out.println(name);


    }
}
