package phase1;
public class Session2 {
    public static void main(String[] args) {
        
        // Grobal Variabla
        int a=100;
        int b=200;
        System.out.println(a);

        {
            // Local variable
            // ทำงานเฉพาะในชอบเชตปีกกาเท่านั้น
            int c=300;
            System.out.println(c);
        }

        System.out.println(b);
    }
}
