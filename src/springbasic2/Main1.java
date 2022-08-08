package springbasic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//https://velog.io/@gillog/Spring-Annotation-정리


public class Main1 {

	public static void main(String[] args) {
		 ApplicationContext app
		= new AnnotationConfigApplicationContext(SpringBasic2.class); 
		Person1 bean = (Person1)app.getBean("person1");
		bean.print();
	}
	
}
