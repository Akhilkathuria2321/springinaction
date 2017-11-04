package chapter1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter1.BraveKnight;
import chapter1.Knight;
import chapter1.Minstrel;
import chapter1.Quest;
import chapter1.SlayDriagonQuest;

@Configuration
public class KnightConfiguration {
	@Bean
	public Knight knight() {
		return new BraveKnight(quest(),minstrel());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDriagonQuest(System.out);
	}
	
	@Bean
	public Minstrel minstrel() {
		return new Minstrel(System.out);
	}
}
