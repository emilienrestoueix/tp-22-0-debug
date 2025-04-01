package TP4.exo21;

public class Essai {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.f();
        b.g();
        a.f();
        a.g();
        a.h();
        b = a;
        b.f();
        b.g();
        //b.h();
    }
}
