class Vehicle{  
    void drive(){System.out.println("use for driving");}  
    }  
    class Bike extends Vehicle{  
    void two_wheeler(){System.out.println("two_wheeler bike");}  
    }  
    class Color extends Bike{  
    void type(){System.out.println("bike of black color");}  
    }  
    public class Q2{  
    public static void main(String args[]){  
    Color d=new Color();  
    d.type();  
    d.two_wheeler();  
    d.drive();  
    }
}  