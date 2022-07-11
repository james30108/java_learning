import java.io.*; // ทำการ import โมดูลเข้ามา

public class Session {
    public static void main(String[] args) {
        
        File file = new File("../demo.txt"); // ตำแหน่งของไฟล์
        try {
            
            // * การจัดการไฟล์ (Java I/O)

            // * 1 การเขียนไฟล์ (FileWriter)
            FileWriter writer = new FileWriter(file); // สร้างไฟล์
            writer.write("Hello World");
            writer.close();
            System.out.println("write sucess");

            // * 2 การอ่านไฟล์ (FileReader)
            FileReader reader = new FileReader(file);
            System.out.println(reader.read());

            // * Buffered คือการอ่านหรือเขียนไฟล์ขนาดใหญ่ และมีความเร็วในการทำงานมากกว่า
            // * 3 การเขียนไฟล์ (BufferedWriter)
            FileWriter writer2 = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer2);
            bw.write("Hello World Buffred");
            bw.write("Hello World Buffred 2");
            bw.write("Hello World Buffred 3");
            bw.close();

            // * 4 การอ่านไฟล์ (BufferedReader)
            FileReader reader2 = new FileReader(file);
            BufferedReader br = new BufferedReader(reader2);
            String message = "";
            while ((message =  br.readLine()) != null) { // .readLine() คือการอ่านไฟล์ที่ละบรรทัด
                System.out.println(message);
            }

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }    
}
