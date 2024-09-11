class B {
    int a;
    String name;
    // B(){
    //     a=0;
    //     name="null";

    // }
    void show()
    {
        System.out.println(a+" "+name);

    }
}
class A{
    public static void main(String arg[]){
       B obj=new B();
       obj.show();

    }

}