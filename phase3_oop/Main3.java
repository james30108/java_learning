public class Main3 {
    public static void main(String[] args) {
        
        // * Constructer แบบที่มีการส่งค่าเข้าไป
        Data3 employee1 = new Data3("001", "James", 15000.0);
        employee1.getEmployee(); 

        // กรณีที่ยังไม่มีข้อมูลเพื่อใส่ลงไปใน Constructer
        Data3 employee2 = new Data3();
        employee2.getEmployee(); 

        // กรณีที่ไม่มีเงินเดือน
        Data3 employee3 = new Data3("000", "Joe");
        employee3.getEmployee(); 
    }
}
