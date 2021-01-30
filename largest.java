import java.lang.*;

public class largest {
    public static void main(String[] args) {
        double num1 = 4.5;
        double num2 = 2.6;
        double num3 = 6.5;
        if(num1 >= num2){
            if(num1 >= num3)
            System.out.println("num1="+" is the largest number");
            else
            System.out.println("num3="+" is the  largest number");

        }else{
            if(num2 >= num3)
            System.out.println("num2="+ "is the largest number");
            else
            System.out.println("num3="+ "is the largest number");
        }

    }
    
}
