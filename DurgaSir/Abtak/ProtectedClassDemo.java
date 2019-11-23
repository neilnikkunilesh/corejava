/*
    Protected = <default> + child
    If a member decleared as protected then we can access that members anywhere within the current package,
    Outside the package only in child class

    We can access the protected member within the current package either by using Parent reference or Child reference
    >>>> But we can access protected members in outside package only in child class.
    >>>> We shold use child reference only
    that is parent referece cannot be use to access protected memebers from outside package.

    in this example pack2.ProtectedClassDemo2.java file is outside the package child class of ProtectedClassDemo.java
    
*/
package pack1;


public class ProtectedClassDemo{
    protected void m1(){
        System.out.println("Protected Class Demo m1() method");
    }
}

class ProtectedDemoChild extends ProtectedClassDemo{
    public static void main(String[] args) {
        ProtectedClassDemo pcd = new ProtectedClassDemo();
        pcd.m1();

        ProtectedDemoChild pdc = new ProtectedDemoChild();
        pdc.m1();

        ProtectedClassDemo pcd1 = new ProtectedDemoChild();
        pcd1.m1();
    }
}
