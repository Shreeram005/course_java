class Human 
{    // encapsulation 
   private int age;
    private String name;
     public int getAge(){
        return age;
     }
        public void setAge(int a){
        age=a;

     }
     public String getName(){
        return name;

     }
  
     public void setName(String n){
        name=n;
     }


     
}
public class encap{
    public static void main(String arg []){
        Human obj = new Human();
        obj.setAge(70);
        obj.setName("Navin");
        System.out.println(obj.getName()+":" + obj.getAge());
    }
}
