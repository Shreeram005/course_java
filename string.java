import java.util.*;
public class string{
    public static void main(String arg[]){
    //     String name="Tony";
    //     String fullName="Tony Stark";
    // }
    Scanner sc =new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("Your name is : "+ name);

    // String firstName="Tony";
    // String lastName="Stark";
    // String fullName= firstName + " " + lastName;
    System.out.println(name.length());

    for(int i=0;i<name.length();i++){
        System.out.println(name.charAt(i));


    }

}

}
