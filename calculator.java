import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in) );
            System.out.println("enter a first number :");
            int num1=Integer.parseInt(br.readLine());
            System.out.println("enter a second number :");
            int num2=Integer.parseInt(br.readLine());
            System.out.println("opreators :");
            String op= br.readLine();

            int result=0;
            if(op.equals("+")){
                result=num1+num2;

              }
              else if(op.equals("-")){
                  result=num1-num2;

              }
              else if(op.equals("*")){
                  result=num1*num2;
              }
              else if(op.equals("/")){
                  result=num1/num2;

              }
              else{
                  throw new java.lang.Error("opreator not recognized");
              }
              
              System.out.println("result:"+result);
            }
           catch(IOException e)
           {
               e.printStackTrace();

           } 

    }
}
