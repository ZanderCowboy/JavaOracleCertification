/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Create and use subclasses and superclasses
Sub-Topic: Out of Ordinary.  Static field inheritance
*/

package company;

// Employee Class with type, name attributes
class Employee {
    private String type;
    private String name;

    Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

// Company has two static fields, and two methods which increment
// the fields.  Leaving them public for demonstration purposes
class Company {
    public static int branchCount;
    public static int employeeCount;

    public void addEmployee(Employee e) {
        employeeCount++;
    }

//    public static void addEmployee(Employee e) {
//        employeeCount++;
//    }

    public void addBranch(Branch b) {
        branchCount++;
    }

    static {
        System.out.println("Company Static Initializer");
        branchCount = 10;
    }
}

// Company is a subclass of Branch
class Branch extends Company {
    private String branchName = "unspecified";
//    public static int branchCount;
//    public static int employeeCount;

    public int branchCount; // 0
    public int employeeCount; // 0

    Branch(String branchName) {
        this.branchName = branchName;
    }

//    static {
//        System.out.println("Branch Static Initializer");
//        employeeCount = 200;
//    }

    {
        System.out.println("Branch Initializer");
        employeeCount = 200;
    }

    public void addEmployee(Employee e) {
        employeeCount++;
    }
}

public class OnBoardBranch {
    public static void main(String[] args) {

        // Create some objects
        Branch b = new Branch("RedBranch");
        Employee e1 = new Employee("Carol", "President");
        Employee e2 = new Employee("Ralph", "Vice President");
        Company main = new Company();


        System.out.println("Company - Number of Branches = " + Company.branchCount);
        System.out.println("Company - Number of Employees = " + Company.employeeCount);

        // Execute the methods that should effect the static fields.
        main.addBranch(b);
        System.out.println("Company - Number of Branches = " + Company.branchCount);
        System.out.println("Company - Number of Employees = " + Company.employeeCount);

        System.out.println("\nCall from Branch: Number of Branches = " +
                b.branchCount);
        System.out.println("Call from Branch: Number of Employees = " +
                b.employeeCount);

        b.addEmployee(e1);

        System.out.println("Call from Branch: Number of Branches = " +
                b.branchCount);
        System.out.println("Call from Branch: Number of Employees = " +
                b.employeeCount);

        b.addEmployee(e2);

        System.out.println("Call from Branch: Number of Branches = " +
                b.branchCount);
        System.out.println("Call from Branch: Number of Employees = " +
                b.employeeCount);

        // The static variable defined on Company accessed here
        System.out.println("\nCompany - Number of Branches = " + Company.branchCount);
        System.out.println("Company - Number of Employees = " + Company.employeeCount);

//        // What does it mean to access the static variables from Branch?
//        System.out.println("Call from Branch: Number of Branches = " +
//                Branch.branchCount);
//        System.out.println("Call from Branch: Number of Employees = " +
//                Branch.employeeCount);

        // Hiding static variable with instance variable
        System.out.println("Call from Branch: Number of Branches = " +
                b.branchCount);
        System.out.println("Call from Branch: Number of Employees = " +
                b.employeeCount);
    }
}