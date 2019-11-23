// abstract interface Interf{
//     void m1();
//     void m2();
// }

// class InterfaceDemo implements Interf{
//     public void m1(){

//     }
//     public void m2(){
        
//     }
// }

interface A{
    int x=10;

    static void m1(){
        int y=10;
    }
}
interface B{
  
}

interface InterfaceDemo extends A,B{

}
class ForExtends{

}
class Interf extends ForExtends implements A,B,InterfaceDemo{
    x=10;
}