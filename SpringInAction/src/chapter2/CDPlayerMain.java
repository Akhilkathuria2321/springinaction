package chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chapter2.config.CDPlayerConfig;

public class CDPlayerMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		
	}
}
