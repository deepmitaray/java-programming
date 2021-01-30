public class greatest {
    public static void main(String[] args) {
        int num1 =20;
        int num2 =30;
        int num3 =50;
        if((num1 >= num2) && (num1 >=num3)){
            System.out.println(num1 +"is the greater numter");
        } 
        else if((num2 >= num3)&&(num2 >= num1)){
            System.out.println(num2 +" is the greater number");
        }
        else if((num3 >= num2)&& (num3 >=num1)){
            System.out.println(num3 + "is the greater number");
        }
    }
    
}
