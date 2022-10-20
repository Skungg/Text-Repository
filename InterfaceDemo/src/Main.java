public class Main {
    public static void main(String[] args) {
        AllEmployee allEmployee = new AllEmployee(new Worker(),new Worker(),new Worker());
        allEmployee.work();
        allEmployee.pay();
        allEmployee.eat();
    }
}