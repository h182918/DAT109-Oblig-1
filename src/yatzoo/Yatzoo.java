package yatzoo;

import java.util.List;

import hjelpeklasser.Spiller;

public class Yatzoo {
	List<Spiller> spillere;
	Runder runder;
	
	public Yatzoo(List<Spiller> spillerlist) {
		spillere = spillerlist;
	}
	
	public void start() {
		int poeng;
		for(int i = 1; i <= 8; i++) {
			System.out.println("-----------------------------");
			System.out.println("Runde: " + i);
			System.out.println("-----------------------------");
			if(i <= 6) {
				for(int y = 0; y < spillere.size(); y++) {
					runder = new Runder();
					poeng = runder.antallDyr(i);
					System.out.println("spiller: " + (y + 1) + ", poeng:" + poeng);
				}
			}else if(i == 7 || i == 8) {
				for(int y = 0; y < spillere.size(); y++) {
					runder = new Runder();
					poeng = runder.antallLike(i-4);
					System.out.println("spiller: " + (y + 1) + ", poeng:" + poeng);
				}
			}
		}
	}
}
