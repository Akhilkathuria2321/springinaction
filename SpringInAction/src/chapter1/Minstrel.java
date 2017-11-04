package chapter1;

import java.io.PrintStream;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	@Before("execution(public void embarkOnQuest())")
	public void singBeforeQuest() {
		stream.println("Woah..The knight is so brave");
	}
	
	public void singAfterQuest( ) {
		stream.println("Yeah...The knight did embark on Quest");
	}
}
