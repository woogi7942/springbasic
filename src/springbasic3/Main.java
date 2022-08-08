package springbasic3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//xml 설정파일 대신
		//클래스로 된 설정파일을 만듭니다.
		//이 설정파일에는 생성할 bean객체들을 미리 선언해두고
		//아래에 있는AnnotationConfigApplicationConext클래스로
		//미리 생성된 객체를 빈이라는 형태로 new를 사용하지 않고 
		//사용할 수 있습니다.
		//* 어노테이션으로 객체를 사용하고 할 때도 xml같은 역할을 하는
		// 클래스 설정 파일이 존재해야합니다.
AnnotationConfigApplicationContext ctx = 
new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//설정파일에 미리 생성된 객체를 getBean함수를 이용해 사용이 가능하고
//입력값으로 설정파일에 선언된 함수명, 리턴하는 클래스파일명이 필요함
//getBean으로 받은 파일은 new를 이용하지 않고도 사용 가
	Student student1 = ctx.getBean("student1", Student.class);
	student1.print();

	}

}
