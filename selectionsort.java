public class selectionsort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

        }
    }
    public static void main(String arg[]){
        int arr[]={5,8,9,4,2,6,1};
        System.out.println(arr.length);

        // selection sort 
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }


        printArray(arr);


         
    }
} 