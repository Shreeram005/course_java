public class invertedpyramid{
    public static void main(String arg[]){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// another super inverted method
// public class halfpyramid{
//     public static void main(String arg[]){
//         int n=4;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");

//             }
//             System.out.println();

//         }
//     }
// }