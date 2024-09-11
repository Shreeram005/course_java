class B {
    int a;
    double b;
    String c;

    B() {
        a = 100;
        b = 45.32;
        c = "ankit";
    }

    B(int x) {
        a = x;
    }

    B(double y, String z) {
        b = y;
        c = z;
    }
}

public class Pointer {
    public static void main(String[] args) {
        B r = new B();
        B r2 = new B(10);
        B r3 = new B(23.89, "Ankush");

        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a);
        System.out.println(r3.b + " " + r3.c);
    }
}
