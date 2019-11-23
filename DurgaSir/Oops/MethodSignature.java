public class MethodSignature{
    /* In java method signature consist of method name followed by argument types */
    public static int m1(float f,float i){
        System.out.println("method m1");
        return 0;
    }
    public final void m1(double d,double f){
        System.out.println("mehtod m2 second");
    }
    private void m1(int q, int w){
        System.out.println("method m3 calling");
    }
    public MethodSignature(){
        System.out.println("Constructor calling");
    }
    void MethodSignature(){
        System.out.println("This method has a constructor name");
    }
    public static void main(String[] args) {
        MethodSignature ms = new MethodSignature();
        //ms.m1(20.4f, 12);
        ms.m1(20, 20);
        ms.MethodSignature();
        
    }
}