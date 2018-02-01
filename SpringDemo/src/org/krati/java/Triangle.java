package org.krati.java;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,ApplicationContextAware,BeanNameAware/*InitializingBean,DisposableBean*/{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context=null;
	



public Point getPointA() {
		return pointA;
	}




	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}




	public Point getPointB() {
		return pointB;
	}




	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}




	public Point getPointC() {
		return pointC;
	}




	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}




public void draw(){
	System.out.println("Drawig traingle");
	System.out.println("pointA"+pointA.getX()+","+pointA.getY());
	System.out.println("pointB"+pointB.getX()+","+pointB.getY());
	System.out.println("pointC"+pointC.getX()+","+pointC.getY());
	
}




@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	this.context=context;
	
}




@Override
public void setBeanName(String beanName) {
System.out.println("bean name is"+beanName);
	
}




/*@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Initialisation");
	
}




@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("dipose");
	
}*/
public void myInit(){
	System.out.println("Init method called");
}
public void cleanUp(){
	System.out.println("cleanUp method called");
}

}
