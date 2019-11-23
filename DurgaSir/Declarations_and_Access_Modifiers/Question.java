// class Values{
//     int x;
//     public int y;
//     private int z;
// }
// public class Question{
//     public static void main(String[] args) {
//         Values v = new Values();
//         v.x=10;
//         v.y=20;
//         v.z = 30;
//     }
// }

class Parent{
    Parent(){
        System.out.println("Constructer1");
    }
}
public class Question extends Parent{
    Question(){
        System.out.println("Question Cons");
    }
    
    public static void main(String[] args) {
        Question q = new Question();
    }
    

}