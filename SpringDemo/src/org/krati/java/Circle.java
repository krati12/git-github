package org.krati.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
@Component
public class Circle implements Shape,ApplicationEventPublisherAware {
private Point centre;
@Autowired
private MessageSource messageSource;
private ApplicationEventPublisher publisher;

	public MessageSource getMessageSource() {
	return messageSource;
}
public void setMessageSource(MessageSource messageSource) {
	this.messageSource = messageSource;
}
	public Point getCentre() {
	return centre;
}
/*@Autowired
@Required
@Qualifier("circleRelated")
*/
	@Resource(name="pointC")
	public void setCentre(Point centre) {
	this.centre = centre;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.point",new Object[]{centre.getX(),centre.getY()},"Default Greeting",null));
		System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeting",null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);

	}
	@PostConstruct
	public void init(){
		System.out.println("Init circle");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy circle");
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
		
	}
	

}
