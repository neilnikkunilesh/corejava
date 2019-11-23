public class NativeDemo{
    static{
        System.out.println("Native Library");
    }
    public native void m1();
}

class Client{
    public static void main(String[] args) {
        NativeDemo n = new NativeDemo();
        n.m1();
    }
}