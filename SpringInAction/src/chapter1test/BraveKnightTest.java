package chapter1test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import chapter1.BraveKnight;
import chapter1.Minstrel;
import chapter1.Quest;


public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		Minstrel mockMinstrel = mock(Minstrel.class);
		BraveKnight braveKnight = new BraveKnight(mockQuest,mockMinstrel);
		braveKnight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}

}
