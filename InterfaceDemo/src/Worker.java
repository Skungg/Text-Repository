public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void Eat() {
        System.out.println("Yemek Verildi");
    }

    @Override
    public void Pay() {
        System.out.println("Maaş Verildi");
    }

    @Override
    public void Work() {
        System.out.println("Kendi Çalışanımız");
    }
}
