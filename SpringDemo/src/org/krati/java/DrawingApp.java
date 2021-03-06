package org.krati.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		//Triangle triangle =(Triangle)factory.getBean("triangle");
		Shape shape =(Shape)context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting",null,"Default Greeting",null));

	}

}