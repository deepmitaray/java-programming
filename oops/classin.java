package oops;

public class classin {
    String character = "deepmita";
    public void fun(String live){
        live = "srinagar";
        System.out.println(live);
    }
    public static void main(String[] args) {
        classin o1 = new classin();
        System.out.println(o1.character);
        o1.fun("lives in srinagar");
        
    }
    
}
