class Mobile{
    String brand;
    int price;
     static String name; // static variable is used to make a var. as common for all the objects such as m1,m2,m3.
     static {
        name="phone";
        System.out.println("in the static block");

     }
     public Mobile()
     {
      brand =" ";
      price=89000;
      System.out.println("in the constructor");
     }
    public void show(){
 
        System.out.println(brand + " :"+price +": "+ name);
    }


}
public class staticblock{
public static void main(String arg[]){
      Mobile m1=new Mobile();
      m1.brand="Apple";
      m1.price=80000;
        Mobile.name= "iphone";

        Mobile m2=new Mobile();
      m2.brand="Samsung";
      m2.price=39000;
        Mobile.name= "180 phone";
        Mobile m3=new Mobile();
      m3.brand="Vivo";
      m3.price=18000;
      Mobile.name= "gxvg";


     
        m1.show();
      m2.show();
      m3.show();
  


}
}
