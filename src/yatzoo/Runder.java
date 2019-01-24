package yatzoo;

import java.util.ArrayList;
import java.util.List;

import hjelpeklasser.Spiller;
import hjelpeklasser.Terning;

public class Runder {
	
	public Runder() {
		
	}

	public int antallDyr(int rundeNR, Spiller p) {
		List<Terning> resultat = new ArrayList<Terning>();
		List<Terning> aktiveT = p.getTerninger();
		for(int i = 0; i < 3; i++) {
			System.out.println("kast: " + i);
			for(int y= 0; y < aktiveT.size(); y++) {
				aktiveT.get(y).trill();
				System.out.println(aktiveT.get(y).getVerdi());
				if(aktiveT.get(y).getVerdi() == rundeNR) {
					System.out.println("hei");
					resultat.add(aktiveT.get(y));
					aktiveT.remove(y);
				}
			}
		}
		return resultat.size();
	}
	
	public String treLike() {
		return null;
	}
	
	public String fireLike() {
		return null;
	}
	
	public String toPar() {
		return null;
	}
	 
	public String hus() {
		return null;
	}
	
	public String ulike() {
		return null;
	}
	
	public String alleLik() {
		return null;
	}
}
