/*
    Abstract class can contain final method whereas final class cannot contain abstract method
*/

abstract class ImportantAbstract{
    private static strictfp void m1(){

    }

}
abstract strictfp class P extends ImportantAbstract{
    private static strictfp void m1(){
        System.out.println("Private static strictfp ");
    }
}