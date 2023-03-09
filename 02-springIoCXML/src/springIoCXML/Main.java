package springIoCXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		context.refresh();
		CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		manager.add();
		
		//Yukarıda New CustomerManager yapısınıda xml dosyası içinden değiştirebiliriz.
		//Customer Manager 100 farklı yerde kullanılırsa  100 farklı new yapılır
		// buda performans açısından iyi değildir.
	}

}
