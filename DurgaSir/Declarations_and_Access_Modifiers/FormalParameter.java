public class FormalParameter{
    public static void m1(final int x, int y){ //if formal parameter is decleared as final
        //x=100; // then final parameter x may not be assigned
        y=200;
        System.out.println(x+"____"+y);
    }
    public static void main(String[] args) {
        m1(10,20); // actual parameter
    }
}