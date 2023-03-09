package springIocPropertiesFile;

public class MsSqlCustomerDal implements ICustomerDal{
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("MsSql Connection String : "+connectionString);
		System.out.println("MsSql veritabanına eklendi");
		
	}

}
