import java.util.ArrayList;
import java.util.List;
class Teacher {
    private String name;
    
    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class School {
    private Teacher teacher; // Association
    private List<Student> students; // Association
    
    public School(Teacher teacher) {
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public List<Student> getStudents() {
        return students;
    }
}
public class Association {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        School school = new School(teacher);
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        school.addStudent(student1);
        school.addStudent(student2);
        // Accessing teacher and students of the school
        System.out.println("Teacher: " + school.getTeacher().getName());
        System.out.println("Students: ");
        for (Student student : school.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
