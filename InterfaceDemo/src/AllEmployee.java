public class AllEmployee {
    private IWorkable workable;
    private IEatable eatable;
    private IPayable payable;

    public AllEmployee(IWorkable workable,IEatable eatable,IPayable payable){
        this.workable = workable;
        this.eatable = eatable;
        this.payable = payable;
    }
    public void work(){
        workable.Work();
    }
    public void eat(){
        eatable.Eat();
    }
    public void pay(){
        payable.Pay();
    }

}
