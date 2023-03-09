
public class CustomerManager {

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// İş kuralları sağlanır mı kontrol eder
		// Tüm şartlar sağlanıyorsa CustomerDal çağırılır

		customerDal.add();
	}

}
