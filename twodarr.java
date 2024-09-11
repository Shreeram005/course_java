import java.util.*;                                                     
public class twodarr{
public static void main(String arg[]){
 Scanner sc=new Scanner(System.in);
 int rows = sc.nextInt();
 int colms=sc.nextInt();

 int numbers[][]=new int[rows][colms];                                        
        // inputs 
 for(int i=0;i<rows;i++){
    for(int j=0;j<colms;j++){
    numbers[i][j]=sc.nextInt();

    }
    }
    // output

 for(int i=0;i<rows;i++){
    for(int j=0;j<colms;j++){
    System.out.print(numbers[i][j]+" ");

    }
     System.out.println();
                
}
}
}

// import java.util.*;
//  public class twodarr {
//  public static void main(String args[]) {
//  Scanner sc = new Scanner(System.in);
//  int rows = sc.nextInt();
//  int cols = sc.nextInt();
//  int[][] numbers = new int[rows][cols];
//  //input
//  //rows
//  for(int i=0; i<rows; i++) {
//  //columns
//  for(int j=0; j<cols; j++) {
//  numbers[i][j] = sc.nextInt();
//  }
//  }
//  for(int i=0; i<rows; i++) {
//  for(int j=0; j<cols; j++) {
//  System.out.print(numbers[i][j]+" ");
//  }
//  System.out.println();
//  }
//  }
//  }
