package chapter1;

import java.io.PrintStream;

public class SlayDriagonQuest implements Quest{
	private PrintStream stream;
	
	public SlayDriagonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {
		stream.println("Slay Driagon Quest Slaying the Driagon");
	}
	

}
