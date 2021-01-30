public class qus4 {
    int urn;
    String my_name;
    qus4(){
        System.out.println("class inside default constructor");
    }
    qus4(int i,String n){//paramaeterized cons
this();
urn = i;
my_name = n;

    }
    void display(){
        System.out.println(urn+" "+my_name);

    }
    public static void main(String args[]){
        qus4 deep1 =new qus4(1,"deepmita");
        qus4 deep2 =new qus4(2,"ray");
        deep1.display();
        deep2.display();
    }
}
    

