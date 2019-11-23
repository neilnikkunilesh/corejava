package pack1;

public class ProtectedDemo{
    protected void m1(){
        System.out.println("Most misunderstood modifire");
    }
}

class ProtectedDemoChild extends ProtectedDemo{
    
    public static void main(String[] args) {
        ProtectedDemo a =new ProtectedDemo();
        a.m1();

        ProtectedDemoChild pc = new ProtectedDemoChild();
        pc.m1();

        ProtectedDemo pc1 = new ProtectedDemoChild();
        pc1.m1();
    }
}