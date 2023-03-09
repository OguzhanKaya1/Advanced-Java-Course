package springIocPropertiesFile;

public class CustomerManager implements ICustomerService{
	private ICustomerDal customerDal;
	
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		customerDal.add();
		
	} 

}
