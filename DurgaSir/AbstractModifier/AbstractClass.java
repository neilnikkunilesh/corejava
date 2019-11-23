abstract class ParentAbstract{
    //abstract void m1();
    private static final int i=20;
    ParentAbstract(){
        System.out.println("Parent Abstract Class Constructer");
    }
    void NonAbstractMethod(){
        System.out.println("Non Abstract Method in Abstract Class");
    }
    public final void m2(){
        System.out.println("Final Abstract Method");
    }
}

// public class AbstractClass extends ParentAbstract{
//     AbstractClass(){
//         System.out.println("Child Abstract Class Constructer");
//     }
//     public void m1(){
//         // super.m2();
//         // NonAbstractMethod();
//         System.out.println("Child class m1 method");
//     }

//     public static void main(String[] args) {
//         ParentAbstract c = new AbstractClass();
//         c.m1();
//         c.NonAbstractMethod();
//     }
// }