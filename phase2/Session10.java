public class Session10 {
    public static void main(String[] args) {
        
        // * Character

        // * การสร้าง Char แบบปกติ
        char alpha1 = 'A';
        char [] alpha2 = {'A', 'B'};
        
        // * การสร้าง Object Character ด้วย Class
        Character alpha3 = new Character('A');
        System.out.println(alpha3);

        // * เช็คว่าเป้นตัวอักษรหรือไม่
        System.out.println(Character.isLetter(alpha1));

        // * เช็คว่าเป้นตัวเลขหรือไม่
        System.out.println(Character.isDigit(alpha1));

        // * เช็คว่าเป็นตัวพิมพ์ใหญ่หรือไม่
        System.out.println(Character.isUpperCase(alpha1));

        // * เช็คว่าเป้นตัวพิมพ์เล็กหรือไม่
        System.out.println(Character.isLowerCase(alpha1));
    }
}
