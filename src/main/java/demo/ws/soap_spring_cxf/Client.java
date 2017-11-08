package demo.ws.soap_spring_cxf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

		HelloService service = context.getBean("helloService", HelloService.class);
		String result = service.say("world");
		System.out.println(result);
	}
}
