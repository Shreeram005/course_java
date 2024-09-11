import java.util.*;

public class cmpr{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");

    int a=sc.nextInt();
    System.out.print("Enter the second number :");
    int b=sc.nextInt();
    System.out.println("The first number is :" + a);
        System.out.println("The second number is :" + b);

        if(a==b){
            System.out.println("Both numbers are equal");

        }
        else if(a>b){
            System.out.println("a is greater than b ");
        }
        else{
            System.out.println("a is less than b");

        }

}
}