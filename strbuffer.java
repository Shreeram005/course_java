public class strbuffer{
    public static void main(String arg[]){
        StringBuffer sb=new StringBuffer("Indian "); // StrinBuffer are mutable in nature 
        sb.append("Navy");
        System.out.println(sb);
        sb.insert(11 ,"  Shiva"); // .insert is used to inset an element and is given by .insert(index no.,(elemment))
        System.out.println(sb);
    }
}