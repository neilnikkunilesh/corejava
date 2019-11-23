/**
 * FinalDemo
 */
public class FinalDemo{
    
    public static void main(String[] args) {
        int x;
        System.out.println(x); // variable x might not have been initialized
    }
}
// public class FinalDemo {
    // Fot static final Rule is Before class loading Compilitions
    // static final int x;
    // static{
        // x=20;
    // }
    // FinalDemo(){
    //     x=30;
    // }
    // public static void main(String[] args) {
        // FinalDemo f = new FinalDemo();
        // System.out.println(x);
//     }
// }
// public class FinalDemo {
//     FinalDemo(){
//         x=10;
//     }
//     final int x;
//     // {
//     //     x=0;
//     // }
//     public static void main(String[] args) {
//         // FinalDemo f = new FinalDemo();
//         // System.out.println(f.x);
//     }
// }