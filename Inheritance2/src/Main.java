public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        employeeManager.BestEmployee();
    }
}