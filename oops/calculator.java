package oops;

public class calculator {
    public int mul(int a,int b){
    return  a*  b;
}
public static void main(String[] args) {
    calculator o1 = new calculator();
    int result = o1.mul (3,4);
    System.out.println("Result"+ result);
}

}
