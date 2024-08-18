class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getManager() {
        return name;
    }
}

class Project {
    private String title;
    private Manager manager;

    public Project(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

class Employee {
    private String name;
    private Project project;

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void allocateManager(Manager manager) {
        project.setManager(manager);
    }

    public void print() {
        System.out.print("Employee: " + name + ", Project: " + project.getTitle());
        if (project.getManager() != null) {
            System.out.println(", Manager: " + project.getManager().getManager());
        } else {
            System.out.println(", Manager: No manager assigned");
        }
    }
}

public class Bandii {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Michael");
        Manager manager2 = new Manager("Dwight");
        Manager manager3 = new Manager("Jim");
        Manager manager4 = new Manager("Andy");

        Employee[] employees = new Employee[15];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Employee " + (i + 1));
        }

        Project[] projects = new Project[15];
        for (int i = 0; i < projects.length; i++) {
            projects[i] = new Project("Project " + (i + 1));
        }

        // Assign managers to employees
        employees[0].allocateManager(manager1);
        employees[1].allocateManager(manager1);
        employees[2].allocateManager(manager2);
        employees[6].allocateManager(manager2);
        employees[3].allocateManager(manager3);
        employees[4].allocateManager(manager3);
        employees[5].allocateManager(manager3);
        employees[8].allocateManager(manager3);
        employees[9].allocateManager(manager3);
        employees[13].allocateManager(manager4);
        employees[14].allocateManager(manager4);

        // Assign projects to employees
        for (int i = 0; i < employees.length; i++) {
            employees[i].setProject(projects[i]);
        }

        // Print all employees
        for (Employee employee : employees) {
            employee.print();
        }
    }
}