package domain;
/**
 * Клас, що описує менеджера
 * @author Марк Дериведмідь
 */
public class Manager extends Employee {

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }
    /**
     * Масив, що містить підлеглиг менеджера
     */
    private Employee[] employees;
    
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Метод, що встановлює підлеглих менеджера
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Метод, що повертає підлеглих менеджера
     * @return підлеглі менеджер
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
