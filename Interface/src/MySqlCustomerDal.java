public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}
