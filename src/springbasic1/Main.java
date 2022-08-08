package springbasic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//spring을 사용하지 않고 객체 이
		/*
		SpringBasic1 sb=new SpringBasic1();
		Person person=new Person();
		sb.setPerson(person);
		sb.person.print();
		*/
		//spring을 사용하여 객체 이용
		//아래의 자바 클래스를 사용하기 위해서는 springframework가 필요
		//maven으로 변경해줘야함.
		//xml의 기본경로는 src이며 이 경로를 패키지로 할 경우 classpath:bean.xml로 설정해야
		//ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");

		SpringBasic service = context.getBean("service" , springbasic1.SpringBasic.class);
		//Person person = context.getBean("person" , springbasic1.Person.class);
		//person.print();
		service.person.print();
		//AbstructApplicationContext ctx=new GenericXmlApplicationContext("bean.xml");
		

		
	}

}
