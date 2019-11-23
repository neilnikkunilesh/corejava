/** 
 * >>> Rule for final instance variable compulsory we should perform initialization befor constructor complition
 * >> Following are various places for initiligation
 * > At the time of declaration
 * > Inside the instance block
 * > Inside the constuctor
*/
/* public class FinalInstance{
    final int x;
    {// inside instance block
        x=10;
    }
    // FinalInstance(){// inside constructor
    //     x=20;
    // }
    public static void main(String[] args) {
        FinalInstance fi = new FinalInstance();
        System.out.println(fi.x);
    }
} */

/*  for instance variable we are not required to perform initialization explicitly
 JVM will always provide default values 
*/
class FinalInstanceParent {
    int x=10;
    FinalInstanceParent(int x){
        //this.x =x;
        System.out.println("x inside "+this.x);
    }
}

public class FinalInstance extends FinalInstanceParent{
    int x;
    FinalInstance(int x){
        super(x);
        this.x  = x;
    }
    void show(){
        System.out.println(this.x+" "+super.x);
    }
    public static void main(String[] args) {
        FinalInstance fi = new FinalInstance(20);
        fi.show();
    }
}
