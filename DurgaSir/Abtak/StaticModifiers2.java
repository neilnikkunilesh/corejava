public class StaticModifiers2{
    private static int x=20;
    public void m1(){
        System.out.println("value of x="+x);
    }
    public static void m2(){
        System.out.println("static mehtod non-static variable value:"+x);
    }
    public static void main(String[] args) {
        StaticModifiers2 sm2 = new StaticModifiers2();
        sm2.m1();
        m2();
    }
}
