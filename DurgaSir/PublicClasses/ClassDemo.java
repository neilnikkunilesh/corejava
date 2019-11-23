class P{
    void m1() throws NullPointerException{
        System.out.println("Parent m1 method calling");
        throw new NullPointerException("Null Pointer exception");
    }
}

public class ClassDemo extends P{
    void m1(){
        super.m1();
        System.out.println("Child m1 mehtod calling");
    }
    public static void main(String[] args) {
        
        P p = new ClassDemo();
        try {
            p.m1(); 
        } catch (Exception e) {
            System.err.println("Null pointer error in parent");
            
        }catch(NullPointerException e){

        }
        
    }
}