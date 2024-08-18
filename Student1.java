 public class Student1 {
    private String name;
    private int id;
    private double cgpa;

    public Student1(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    
    public void insert(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    
    public boolean searchByName(String searchName) {
        return this.name.equalsIgnoreCase(searchName);
    }

    
    public boolean searchById(int searchId) {
        return this.id == searchId;
    }


    public void edit(String newName, int newId, double newCgpa) {
        this.name = newName;
        this.id = newId;
        this.cgpa = newCgpa;
    }
    public void delete() {
        this.name = null;
        this.id = 0;
        this.cgpa = 0.0;
    }

    public static void main(String[] args) {
        
        Student1 student1 = new Student1("Afeera", 20, 3.4);
        Student1 student2 = new Student1("Effa", 18, 3.4);

        
        System.out.println("Student List:");
        student1.display();
        System.out.println();
        student2.display();
        System.out.println();

        // Searching for a student by name
        String searchName = "Effa";
        if (student1.searchByName(searchName)) {
            System.out.println("Student found by name: " + searchName);
        } else {
            System.out.println("Student not found by name: " + searchName);
        }

        
        int searchId = 20;
        if (student2.searchById(searchId)) {
            System.out.println("Student found by ID: " + searchId);
        } else {
            System.out.println("Student not found by ID: " + searchId);
        }

        
        student1.edit("Afeera", 20, 3.7);
        System.out.println("\nUpdated Student 1 details:");
        student1.display();

        
        student2.delete();
        System.out.println("\nStudent 2 deleted.");
        System.out.println("Details of Student 2 after deletion:");
        student2.display();
    }
}
