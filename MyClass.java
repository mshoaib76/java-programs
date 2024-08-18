 class Mobile {
    private String name;
    private int code;
    private double price;
    private String brand;

    public Mobile(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    
    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
    }

    
    public boolean searchRecord(String searchKey) {
        return name.equalsIgnoreCase(searchKey) || brand.equalsIgnoreCase(searchKey) || Integer.toString(code).equals(searchKey);
    }

    
    public void deleteRecord(int deleteCode) {
        if (this.code == deleteCode) {
            this.name = null;
            this.code = 0;
            this.price = 0.0;
            this.brand = null;
            System.out.println("Mobile deleted successfully.");
        } else {
            System.out.println("Mobile not found.");
        }
    }

    
    public void editRecord(String newName, int newCode, double newPrice, String newBrand) {
        this.name = newName;
        this.code = newCode;
        this.price = newPrice;
        this.brand = newBrand;
        System.out.println("Mobile information updated successfully.");
    }
}

public class MyClass {
    public static void main(String[] args) {
        
        Mobile mobile1 = new Mobile("iPhone 12", 1001, 999.99, "Apple");
        Mobile mobile2 = new Mobile("Galaxy S21", 1002, 899.99, "Samsung");

        
        System.out.println("Mobile List:");
        mobile1.displayRecord();
        System.out.println();
        mobile2.displayRecord();
        System.out.println();

        
        System.out.println("Search for a mobile:");
        String searchKey = "iPhone 12";
        if (mobile1.searchRecord(searchKey)) {
            System.out.println("Mobile found:");
            mobile1.displayRecord();
        } else {
            System.out.println("Mobile not found.");
        }

        
        System.out.println("\nEdit a mobile:");
        mobile2.editRecord("Galaxy Note 20", 1002, 899.99, "Samsung");
        mobile2.displayRecord();

        System.out.println("\nDelete a mobile:");
        mobile1.deleteRecord(1001);
        mobile1.displayRecord();
    }
}
