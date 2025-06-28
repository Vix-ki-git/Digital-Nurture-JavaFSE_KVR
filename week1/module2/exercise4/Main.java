public class Main {
    public static void main(String args[]) {
        EMS employee_management_system = new EMS(10);
        Employee e1 = new Employee(101, "Suraj", "Intern", 20000);
        Employee e2 = new Employee(102, "Pooja", "Senior Intern", 250000);
        employee_management_system.add(e1);
        employee_management_system.add(e2); 

        employee_management_system.search(103);
        employee_management_system.search(102);

        employee_management_system.delete(102);
        employee_management_system.search(102);
    }
}