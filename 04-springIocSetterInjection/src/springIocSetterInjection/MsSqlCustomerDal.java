package springIocSetterInjection;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("MsSql veritabanına eklendi");
		
	}

}
