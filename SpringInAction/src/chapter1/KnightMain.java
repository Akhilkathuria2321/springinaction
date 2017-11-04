package chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chapter1.config.KnightConfiguration;

public class KnightMain {
	public static void main(String[] args) throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfiguration.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
