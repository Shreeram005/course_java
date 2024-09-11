 class calci{
    public int add(int n1,int n2){
        return n1+n2;

    }
     public int sub(int n1,int n2){
        return n1-n2;
        
    }
}
public class calc1{
    public static void main(String arg[]){
        calci obj=new calci();
        int r1=obj.add(9,8);
        int r2=obj.sub(10,20);
        int r3=obj.multi(20,20);
        int r4=obj.div(40,20);
        System.out.println(r1+" "+ r2+" "+ r3+"  "+"  "+r4 );
    }
}


