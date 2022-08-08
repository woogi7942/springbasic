package springbasic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//https://velog.io/@gillog/Spring-Annotation-정리

@Configuration
public class SpringBasic2 {
@Autowired
Person1 person;

@Bean
public Person1 person1() {
	return new Person1();
}
}
