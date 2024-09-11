package Employee;
abstract class Employee{
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract void printSalary();
}
//SuperStar Employee class
class SuperStarEmployee extends Employee{
    String name;
    float salary;
    public SuperStarEmployee(String name, float salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }
    //    SuperStar employee's information display
    void printSalary() {
        float bonus = salary * 0.10f;
        float totalSalary = salary + bonus;
        System.out.println("Name: " + name + " Salary: " + totalSalary + " Bonus: " + bonus);
    }

}
//Star Employee class
class StarEmployee extends Employee{
    String name;
    float salary;
    public StarEmployee(String name, float salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }
//    Star employee's information display
    void printSalary() {
        float bonus = salary * 0.05f;
        float totalSalary = salary + bonus;
        System.out.println("Name: " + name + " Salary: " + totalSalary + " Bonus: " + bonus);
    }

}


public class EmployeeApp {
    public static void main(String[] args) {

        SuperStarEmployee superStar = new SuperStarEmployee("Ariyan",50000.0f);
        StarEmployee star = new StarEmployee("John David",45000.0f);
//  Employee Details information
        System.out.println("Print Employee Details");
        System.out.println("SuperStar Employee's Salary Details : ");
        superStar.printSalary();
        System.out.println("\nStar Employee's Salary Details : ");
            star.printSalary();
    }
}
