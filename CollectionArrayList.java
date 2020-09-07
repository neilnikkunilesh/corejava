import java.util.*;

class Employee implements Comparable<Employee>{

    private  Integer empId;
    private String empName;
    private String department;
    private Integer salary;

    public int getSalary(){
        return salary;
    }
    Employee(Integer empId, String empName, String department, Integer salary){
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary  = salary;
    }

    @Override
    public int compareTo(Employee emp){
        return this.salary.compareTo(emp.getSalary());
    }
    public String toString(){
       return "ID: "+empId+", EmpName:"+empName+", Department:"+department+", Salary:"+salary;
    }
}

public class CollectionArrayList{
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(101, "Nilesh", "ACTS", 60000));
        empList.add(new Employee(102, "Kulvant", "IAF", 42000));
        empList.add(new Employee(103, "Aniket", "ACTS Online", 55000));

        // for(Employee e : empList){
        //     System.out.println(e);
        // }
        System.out.println(Collections.max(empList));
    }
}
