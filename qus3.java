public class qus3 {
    private String message;
    public qus3(){
        message="hello world";
    }
    public qus3(String message){
        this.message=message;

    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;

    }
    public static void main(String[] args) {
        qus3 deepmita = new qus3();
System.out.println(deepmita.getMessage());
qus3 deepmita1=new qus3("welcome");
System.out.println(deepmita1.getMessage());
    }
    
}
