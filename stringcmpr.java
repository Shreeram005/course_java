import java.util.*;
public class stringcmpr{
    public static void main(String arg[]){
        // compare
        String name1="Tony";
        String name2="Tony";
        // 1 s1 > s2 : -> +ve value
        // 2 s1 == s2 : 0 (return )
        // s1< s2 : -ve value
        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");


        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}