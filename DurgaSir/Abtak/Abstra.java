/* 
    we can empty class as abstract class
    HttpServlet Class is abstract but it don't contain any abstract method
*/
public abstract class Abstra{
    int rollno;
    String name;
    protected int m1(){
        System.out.println("inside abstract m1 "+rollno);
        return 0;
    }

    abstract int m2();
    protected abstract String m3(); // AbstractNewDemo class is responsible to implement this mehtod
    // because AbstractDemo not implement this method we have to declear child class as Abstract class
}

abstract class AbstractsDemo extends Abstra{
    int m2(){
        super.m1();
        System.out.println("inside m2 "+rollno);
        return 0;
    }
    
}

class AbstractNewDemo extends AbstractsDemo{
    protected String m3(){
        System.out.println("3rd level class implements the mthod m3 of abstract class");

        return null;
    }
    public static void main(String[] args) {
        AbstractNewDemo ad = new AbstractNewDemo();
        ad.m2();
    }
}