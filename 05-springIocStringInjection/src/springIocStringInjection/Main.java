package springIocStringInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		context.refresh();
		ICustomerService service = context.getBean("service",ICustomerService.class);
		service.add();

	}
}
