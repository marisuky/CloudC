import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testApp {
	public static ApplicationContext context = null;
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("context.xml");
		
		
		Casa casa1 = (Casa) context.getBean("casa1");
		System.out.println(casa1.toString());
	}
}
