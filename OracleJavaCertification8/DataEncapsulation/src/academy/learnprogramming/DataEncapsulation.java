package academy.learnprogramming;

public class DataEncapsulation {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("MyCompany");
        company.addEmployees("John");
        company.addEmployees("Anthony");
        company.addEmployees(null);
        company.setName(null);
        company.addEmployees("");

        company.printSorted();

//        company.name = null;
//        company.printSorted();

//        company.employees = null;

//        company.employees.add("Jimmy");
//        company.printSorted();

    }
}
