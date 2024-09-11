class Mobile{
    String brand;
    int price;
     static String name; // static variable is used to make a var. as common for all the objects such as m1,m2,m3.

    public void show(){
 
        System.out.println(brand + " :"+price +": "+ name);
    }


}
public class static1{
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


      m1.name="phone";  // name is a static variable and is used to change for all m1 ,m2,m3( objects) i.e in static variable the change is related to each element 

     System.out.println("Brand Price Name");
      m1.show();
      m2.show();
      m3.show();


}
}
