 class Student{
    int roll_no;
    String name;
    int marks;

}
public class arr2{

public static void main(String arg[]){

Student s1= new Student();
s1.roll_no=2;
s1.name="Sonu";
s1.marks=90;

Student s2= new Student();
s2.roll_no=1;
s2.name="Saumya";
s2.marks=96;

Student s3= new Student();
s3.roll_no=3;
s3.name="Sekhar";
s3.marks=88;


Student students[]=new Student[3];
students[0]=s1;
students[1]=s2;
students[2]=s3;


for(int i=0;i<students.length;i++){

System.out.println(students[i].name+" : " + students[i].marks);



}

}
}

