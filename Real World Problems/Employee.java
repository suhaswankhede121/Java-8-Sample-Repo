
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javafx.beans.property.MapProperty;

class OperationEmployee{
    List<Employee> employees;
    public OperationEmployee(List<Employee> employees){
        this.employees=employees;
    }
    public void solveQueries(){
    //     //1.male and female employee in the orgn
    //     Map<String,Long> genderCount=employees.stream()
    //     .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    //     for(Map.Entry<String,Long> entry:genderCount.entrySet()){
    //         System.out.println(entry.getKey()+"=>"+entry.getValue());
    //     }
    //     System.out.println();

    //     //2.print the name of all departments
    //     Set<String> depts=employees.stream()
    //     .map(Employee::getDepartment).collect(Collectors.toSet());
    //     System.out.println(depts);
    //     System.out.println();

    //     //3.Average age of male and females in the orgn
    //     Map<String, Double> avgAge=employees.stream()
    //    .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
    //    for(Map.Entry<String,Double> entry:avgAge.entrySet()){
    //     System.out.print(entry.getKey()+"=>"+entry.getValue());
    //    }
    //    System.out.println();

    //    //4.Employee who join after 2015
    //    List<String> empJoin=employees.stream()
    //    .filter(x->x.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
    //    System.out.println(empJoin);
    //    System.out.println();

    //    //5.count the no of employees in each departments
    //    Map<String,Long> countsEmpInDept=employees.stream()
    //    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
    //    for(Map.Entry<String,Long> entry:countsEmpInDept.entrySet()){
    //     System.out.println(entry.getKey()+"=>"+entry.getValue());
    //    }
    //    System.out.println();

    //    //6.average salary of each depts
    //    Map<String,Double> avgSalaryOfEachDept=employees.stream()
    //    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
    //    for(Map.Entry<String,Double> entry:avgSalaryOfEachDept.entrySet()){
    //     System.out.println(entry.getKey()+"=>"+entry.getValue());
    //    }

    //    //7.find oldest employee with her/his age and also deprt
    //    Optional<Employee> oldestEmp=employees.stream()
    //    .max(Comparator.comparingInt(Employee::getAge));
    //    Employee result=oldestEmp.get();
    //    System.out.println("Age:"+result.getAge()+" "+"Name:"+result.getName()+" "+"Department:"+result.getDepartment());
    //    System.out.println();

    //    //8.List down the employees of each dept
    //     Map<String,List<Employee>> empDept=employees.stream()
    //     .collect(Collectors.groupingBy(Employee::getDepartment));
    //     Set<Entry<String,List<Employee>>> setEmp=empDept.entrySet();
    //     for(Entry<String,List<Employee>> entry:setEmp){
    //         System.out.println("Employee in:"+entry.getKey());
    //         List<Employee> list=entry.getValue();
    //         for(Employee e:list){
    //             System.out.println(" "+e);
    //         }
    //     }

        //9.Higest experianced employee in the org
        Optional<Employee> highestExpEmp=employees.stream()
        .min(Comparator.comparing(Employee::getYearOfJoining));
        Employee result=highestExpEmp.get();
        System.out.println("Name:"+result.getName()+"Id:"+result.getId()+"Age:"+result.getAge());

    }
}
class Employee{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public String getGender() 
    {
        return gender;
    }
    public String getDepartment() 
    {
        return department;
    }
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
    public double getSalary() 
    {
        return salary;
    }
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    
        OperationEmployee emp=new OperationEmployee(employeeList);
        emp.solveQueries();
    




    }
 }