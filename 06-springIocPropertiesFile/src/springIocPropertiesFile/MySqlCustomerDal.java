package springIocPropertiesFile;

public class MySqlCustomerDal implements ICustomerDal{
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("MySql Connection String : "+connectionString);
		System.out.println("MySql veritabanına eklendi");
		
	}

}
