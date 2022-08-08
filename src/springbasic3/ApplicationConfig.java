package springbasic3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//설정파일임을 명시하는 어노테이션이며 
//new AnnotationConfigApplicationContext(ApplicationConfig.class);
//함수를 통해 클래스 안의 빈 객체를  꺼내서 사용할 수 있
@Configuration
public class ApplicationConfig {

	//new를 선언해 객체를 선언하는 것과 같은 역할을 하며
	// 함수의 작성은 id에 해당하는 값이 함수명이며 getBean()사용시 첫번째 입력값이 됨
	//함수 내부에 Student가 가진 내용을 모두 세팅해서
	//해당 클래슬 객체를 반환해서 main에서 사용하는 구조
	//이클래스의 내부에는 여러개의 빈 함수를 선언해서 미리 객체를 만들어 놓게 
	@Bean
	public Student student1(){
	return new Student();
	}
	
	@Bean
	public Student student2(){
	return new Student();
	}
}
