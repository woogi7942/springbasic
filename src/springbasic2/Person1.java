package springbasic2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class Person1 {
String name="hong";
int age=10;

void print() {
	System.out.println(name+","+age);
}
}
