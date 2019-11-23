package pack2;

import pack1.ProtectedDemo;

class ProtectedOutPackage extends ProtectedDemo{
    public static void main(String[] args) {
        
        ProtectedDemo p = new ProtectedDemo();
        // p.m1();

        ProtectedOutPackage pop = new ProtectedOutPackage();
        /* But we can access protected members in outside package 
        only in child class we should use child reference only, that is parenct refereence cannot be use to access
        protected members from outside package
        */
        pop.m1();

        ProtectedDemo pd = new ProtectedOutPackage();
        // pd.m1();
    }
}