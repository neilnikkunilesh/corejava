/* 
    Any service requirement specification or any contract between client and service provider or 100% pure
    abstract class is nothing but interface.

    >>> An interface is only a reference type, similer to a class, that can contain only constant, method signature
    default methods and static methods and nested types.
    Method body exist only for default methods and static methods

    every interface is always "public and abstract" 
    Whenever we are implementing an interface compulsory we should declare as "public" otherwise we will get
    compile time error
*/
interface Interf{
    // public: to make this method available to every implementation class
    // abstract: Implementation class is responsible to provide implementation
    public abstract void m1(); 
    void m2();
    /* 
        An interface contains constant declaration. All constant value define in interface are 
        implicitly public, static, final
    */
    int x = 10;
    static void StaticMethod(){
        System.out.println("Static method in Interface");
    }
    default public void defaultMethod(){
        System.out.println("default method introduced in JDK 1.8");
    }
}

/* abstract class InterfAbstract implements Interf{
    
} */
public class InterfaceDemo1 implements Interf{

    @Override
    public void m1(){

    }

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
    }
    public static void main(String[] args) {
        InterfaceDemo1 id1 = new InterfaceDemo1();
        id1.defaultMethod();
        Interf.StaticMethod();
    }
    

}