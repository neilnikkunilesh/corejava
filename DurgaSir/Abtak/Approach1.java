/* abstract class constructor will be executed whenever we are creating child class object to perform initilization
    of child class object
*/
// without having constructor in abstract class
abstract class Person{

    String name;
    int age;
}
class Students extends Person{

    int rollno;

    Students(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
}

class Teachers extends Person{
    String subject;
    Teachers(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
    public static void main(String[] args) {
        /* More Code
            Code Redendency
        */
        Students s = new Students("Nilesh",26, 100);
    }
}