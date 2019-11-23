interface left{
    void m1();
}
interface right{
    void m1();
}


public class InterfaceMethodConflicts implements left, right{
    public void m1(){
        System.out.println("if interfaces have same method then we have implement only one time");
    }
}