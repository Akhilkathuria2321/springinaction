package chapter2;

import org.springframework.stereotype.Component;

@Component
public class Attention implements CompactDisc{
	private String title = "Attention";
	private String artist = "Charlie Puth";
	
	@Override
	public void play() {
		System.out.println("Playing: " + title + " by : " + artist);
	}

}
