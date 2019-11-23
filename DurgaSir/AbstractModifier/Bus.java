/*abstract class vechile{
    abstract public int getNoWheels();
}

public class Bus extends vechile{
    public int getNoWheels(){
        return 7;
    }

    public static void main(String argd[]){
        Bus b = new Bus();
        System.out.println("bus has "+b.getNoWheels());
    }
}*/

// abstract class Bus{
//     public static void main(String args[]){
//         Bus b = new Bus();// CE: Bus is abstract; cannot be instantiated
        
//     }
// }

// class Bus{
//     public void m1(); // missing method body, or declare abstract
// }

// class Bus{
//     public abstract void m1(){ // abstract method cannot have a body

//     }
// }

// /* Abstract classes can contains final method whereas final class cannot contain abstract method */
// abstract class Bus{
//    public final void m1(){

//    }
// }

// final class Test{
//     public abstract void m1(); //Test is not abstract and does not override abstract method m1() in Test
// }

/* abstract strictfp class Bus{
    correct class
 }*/

class Bus{
    abstract strictfp void m1(){

    }
}
