import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Teacher {
    int id;
    String name;
    int age;
    String gender;
    String subject;
    double salary;
    int yearOfJoining;

    public Teacher(int id, String name, int age, String gender, String subject, double salary, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    // Getters and toString method for easy printing
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getSubject() { return subject; }
    public double getSalary() { return salary; }
    public int getYearOfJoining() { return yearOfJoining; }
    public int getAge() { return age; }
    @Override
    public String toString() {
        return String.format("Teacher{id=%d, name='%s', age=%d, gender='%s', subject='%s', salary=%.2f, yearOfJoining=%d}",
                id, name, age, gender, subject, salary, yearOfJoining);
    }
}

class School {
    List<Teacher> teachers;

    public School(List<Teacher> teachers){
        this.teachers=teachers;
    }

    public void solveQueries(){
        // //2. subjects taught in school
        // List<String> subjects=teachers.stream().
        // map(Teacher::getSubject).
        // collect(Collectors.toList());
        // System.out.println(subjects);

        // System.out.println();
        // System.out.println();

        // //3.Average age of male and female teachers
        // Map<String, Double> avgAge=teachers.stream().collect(Collectors.groupingBy(
        //     Teacher::getGender,Collectors.averagingInt(Teacher::getAge)
        // ));
        // for(Map.Entry<String,Double> entry:avgAge.entrySet()){
        //     System.out.println(entry.getKey()+"="+entry.getValue());
        // }

        // //4.Highest Paid teacher in the school
        // Teacher highestPaidTeacher=teachers.stream().
        // max(Comparator.comparingDouble(Teacher::getSalary)).orElse(null);
        // System.out.println(highestPaidTeacher);

        // //5.After join 2015
        // Set<String> teacherName=teachers.stream().
        // filter(x->x.getYearOfJoining()>2015).map(Teacher::getName).collect(Collectors.toSet());
        // System.out.println(teacherName);

        // //6.Count teacher in each subjects
        // Map<String, Long> teachersInSubjects=teachers.stream()
        // .collect(Collectors.groupingBy(Teacher::getSubject,Collectors.counting()));
        // for(Map.Entry<String,Long>entry:teachersInSubjects.entrySet()){
        //     System.out.println(entry.getKey()+"=>"+entry.getValue());
        // }

        // //7.name of teacher who teach more than one subject
        // Map<String, Long> allteacher=teachers.stream()
        // .collect(Collectors.groupingBy(Teacher::getName,Collectors.counting()));
        // List<String> filterTeacher= allteacher.entrySet().stream()
        // .filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        // System.out.println(filterTeacher);

        // //8 total salary of teachers
        // double totalSalary=teachers.stream().mapToDouble(Teacher::getSalary).sum();
        // System.out.println(totalSalary);

        //9.Yougest teacher details
        Teacher youngTeacher=teachers.stream().min(Comparator.comparingInt(Teacher::getAge)).orElse(null);
        System.out.println(youngTeacher);

    }
}
public class SchoolDemo {
    public static void main(String[] args) {
        List<Teacher> teachers = Arrays.asList(
            new Teacher(1, "Mr. Smith", 40, "Male", "Mathematics", 80000, 2010),
            new Teacher(2, "Ms. Johnson", 35, "Female", "Science", 75000, 2015),
            new Teacher(3, "Mrs. Brown", 45, "Female", "English", 77000, 2012),
            new Teacher(4, "Mr. White", 50, "Male", "Mathematics", 85000, 2009),
            new Teacher(5, "Ms. Green", 30, "Female", "History", 72000, 2018),
            new Teacher(6, "Mr. Black", 38, "Male", "Science", 78000, 2014)
        );

        School school = new School(teachers);
        school.solveQueries();
    }
}