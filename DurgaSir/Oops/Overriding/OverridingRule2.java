
/*  tha main advantage of this approch is we can stop the availability of
parent method implimentation to the next level child classes    */
class P{
    public void m1(){
        System.out.println("Parent Method");
    }
}
abstract class C extends P{
    public abstract void m1();
}