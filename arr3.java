// arrays in java
/** Linear searching in arrays  */
import java.util.*; 
public class arr3{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int numbers[]=new int[size];
        
        // inputs 
       
          for(int i=0;i<size;i++){
            
           numbers[i]=sc.nextInt();
      }
      int x=sc.nextInt();


    // output 
       for(int i=0;i<numbers.length;i++){
        if(numbers[i]==x){
            System.out.println(" x found at index :" +i);
        }
      
        

       }

    }
}