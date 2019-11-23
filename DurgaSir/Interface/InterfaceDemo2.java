interface left{
    public void m1();
}
interface right{
    public void m1(int x);
}

public class InterfaceDemo2 implements left, right{
    public void m1(){

    }
}