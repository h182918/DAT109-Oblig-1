package yatzoo;

import java.util.List;

import hjelpeklasser.Spiller;

public class Yatzoo {
	List<Spiller> spillere;
	Runder runder = new Runder();
	
	public Yatzoo(List<Spiller> spillerlist) {
		spillere = spillerlist;
	}
	
	public void start() {
		int poeng;
		for(int i = 1; i <= 6; i++) {
			System.out.println("-----------------------------");
			System.out.println("Runde: " + i);
			System.out.println("-----------------------------");
			if(i <= 6) {
				for(int y = 0; y < spillere.size(); y++) {
					poeng = runder.antallDyr(i, spillere.get(y));
					System.out.println("spiller: " + (y + 1) + ", poeng:" + poeng);
				}
			}	
		}
	}
}
