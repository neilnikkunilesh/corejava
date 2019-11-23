/* 
    While executing child class if child class doesn't contain main method then
    parent class main method will be executing
*/

class StaticModifiersParent{
    public static void main(String[] args) {
        System.out.println("Parent class main method");
    }
}
public class StaticModifiers extends StaticModifiersParent{
/* 
    It's method hidding butnot overriding    
    For the staic method overloading and inheritance concepts are applicable but overriding concept are not applicable
    But instead of overriding, method hidding concept is applicable.
 */
    public static void main(String[] args) {
        System.out.println("Child class main method");
    }
}
/* class StaticModifiersParent{
    static int x=10;
    int y=20;

}
public class StaticModifiers extends StaticModifiersParent {
    int x=100;
    public void m1(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        StaticModifiers sm = new StaticModifiers();
        sm.x = 888;
        sm.y = 999;
        StaticModifiers sm1 = new StaticModifiers();
        System.out.println(sm1.x+" "+sm1.y);
        sm1.m1();
    }
} */