public class rhombuspattern{
    public static void main(String arg[]){
        int n=5;
        for(int i=1;i<=5;i++){
            // space1
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // 5 stars 
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
           
            
            System.out.println(" ");
        }
    }
}