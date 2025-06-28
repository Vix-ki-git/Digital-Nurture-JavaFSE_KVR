public class EMS {
    Employee employees[];
    int count = 0;

    public EMS(int size) {
        this.employees = new Employee[size];
    }

    public void add(Employee e) {

        if (count < employees.length) {
            employees[count] = e;
            count++;
            System.out.println("Emloyee Added.");
        } else {
            System.out.println("Employee List is Full");
        }
    }

    public void search(int id) {

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found!");
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }

    public void delete(int id) {

        for (int i = 0; i < count; i++) {
            if(employees[i].employeeId == id) {
                for(int j = i; i < count - 1; j++) {
                    employees[j] = employees[j+1];
                }
                employees[count] = null;
                count--;
                System.out.println("Employee record deleted!");
            }
        }
    }
}