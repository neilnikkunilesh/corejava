abstract class Person{
    String name;
    int age;
    // this constructor will work for every child object initalization
    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person class constructor calling for initilize instance variable of abstract class");
    }
}
class Student extends Person{
    int rollno;
    Student(String name, int age, int rollno){
        super(name, age);
        this.rollno = rollno;
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    public static void main(String[] args) {
        /* Less Code, Code Reusability */
        // Either directly or indirectly we can't create object for abstract class
        /* whenever we are creating child class object parent object won't be created
            Just patent class constructor will be executed for the child object purpose */
        Student s1= new Student("john", 23,455);
        Teacher t1= new Teacher("Martin", 45, "Math");
        /* 
            new: responsible to create object
            Student("john", 23,455): Responsible to initialize an object
        */
    }
}