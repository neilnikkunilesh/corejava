import java.io.EOFException;
import java.io.IOException;

class P{
    public void m1() throws IOException{
        System.out.println("m1 with throws exception");
    }
}

class C extends P{
    public void m1() throws ArithmeticException, NullPointerException,ClassCastException{
        System.out.println("child m1 method");
    }
}