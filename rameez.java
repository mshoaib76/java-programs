 public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        int id;
         String name;
         double cgpa;
         Student S1=new Student(name= "Afeera hameed ", id=20 ,cgpa=3.4);
         Student S2=new Student(name= "effa ", id=45 ,cgpa=3.7);
         Student S3=new Student(name= "Arooj ", id=24 ,cgpa=3.3);
         Student S4=new Student(name="Abdul bari",id=18 , cgpa=3.4);
         S1.display();
         S2.display();
         S3.display();
         S4.display();
    }
}
