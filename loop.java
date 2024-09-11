public class loop

{
    public static void main(String arg[]){
    // while nested loop
    int i=1;
    while(i<=8)
    {
        System.out.println("Hii"+ i);
        int j=1;
        while(j<=6)
        {
            System.out.println("Hello"+j);
            j++;
        }
        i++;
    }
    System.out.println("Loop over process Terminates");
}

}