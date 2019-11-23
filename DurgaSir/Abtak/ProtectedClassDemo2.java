package pack2;

import pack1.ProtectedClassDemo;

class ProtectedClassDemo2 extends ProtectedClassDemo{
    public static void main(String[] args) {
        // outside the package only in child class we should use child Reference only
        ProtectedClassDemo2 pcd2=new ProtectedClassDemo2();
        pcd2.m1();
        // ProtectedClassDemo pcd = new ProtectedClassDemo();
        // pcd.m1();
        // ProtectedClassDemo pcd1 = new ProtectedClassDemo2();
        // pcd1.m1();

    }
}