public class qus5 {
    public void area(int leng, int breath){
        System.out.println("area of rectangle is=" + leng + breath);
    }
    public void area(double con){
        double value = 2.26 * con *con;
        System.out.println("area of circule =" + value);
    }
    public static void main(String[] args) {
        qus5 obj = new qus5();
        obj.area(6,6);
        obj.area(2);
        
    }
    
}
