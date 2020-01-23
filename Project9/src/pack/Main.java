package pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		// TODO Auto-generated method stub
        BeanClass1 obj=(BeanClass1)context.getBean("b");
        obj.getMessage();
        //context.registerShutdownHook();
	}

}
