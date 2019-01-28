package yatzoo;

import java.util.ArrayList;
import java.util.List;

import hjelpeklasser.Spiller;
import hjelpeklasser.Terning;

public class Runder {
	
	List<Terning> resultat = new ArrayList<Terning>();
	List<Terning> aktiveT = new ArrayList<Terning>();
	int[] frekvensTab = new int[7];
	
	public Runder() {
		Terning t1 = new Terning();
		Terning t2 = new Terning();
		Terning t3 = new Terning();
		Terning t4 = new Terning();
		Terning t5 = new Terning();
		aktiveT.add(t1);
		aktiveT.add(t2);
		aktiveT.add(t3);
		aktiveT.add(t4);
		aktiveT.add(t5);	
	}

	public int antallDyr(int rundeNR) {

		int teller;
		for(int i = 1; i < 4; i++) {
			teller = 0;
			System.out.println();
			System.out.println("kast: " + i);
			for(int y= 0; y < aktiveT.size(); y++) {
				aktiveT.get(y).trill();
				System.out.println(aktiveT.get(y).getVerdi());
				if(aktiveT.get(y).getVerdi() == rundeNR) {
					resultat.add(aktiveT.get(y));
					teller++;
				}
			}
			for(int j = 0; j < teller; j++) {
				aktiveT.remove(0);
			}
		}
		return resultat.size();
	}
	
	public int antallLike(int antall) {
		int flest = 0;
		int antallSlettet = 0;
		for(int i = 1; i < 4; i++) {
			System.out.println();
			System.out.println("kast: " + i);
			for(int y= 0; y < aktiveT.size(); y++) {
				aktiveT.get(y).trill();
				System.out.print(aktiveT.get(y).getVerdi() +", ");
				frekvensTab[aktiveT.get(y).getVerdi()]++;
			}
			System.out.println();
			flest = flestLike(frekvensTab);
			System.out.println("Sparer på: " + flest);
			fiksFTab(flest);
			
			while(antallSlettet < frekvensTab[flest]) {
				aktiveT.remove(0);
				antallSlettet++;
			}
		}
		if(frekvensTab[flest] >= antall) {
			return antall;
		}
		return 0;
	}
	
	public String fireLike() {
		for(int i = 1; i < 4; i++) {
			
		}
		return null;
	}
	
	public int flestLike(int[] fTab) {
		int størst = fTab[1];
		int indeks = 1;
		for(int i = 2; i < 7; i++) {
			if(fTab[i] > størst) {
				størst = fTab[i];
				indeks = i;
			}
		}
		return indeks;
	}
	
	public void fiksFTab(int spar) {
		for(int i = 0; i < 7; i++) {
			if(i != spar) {
				frekvensTab[i] = 0;
			}
		}
	}
	
	public String toPar() {
		for(int i = 1; i < 4; i++) {
			
		}
		return null;
	}
	 
	public String hus() {
		for(int i = 1; i < 4; i++) {
			
		}
		return null;
	}
	
	public String ulike() {
		for(int i = 1; i < 4; i++) {
			
		}
		return null;
	}
	
	public String alleLik() {
		for(int i = 1; i < 4; i++) {
			
		}
		return null;
	}
	
	public void nyTerning() {
		Terning t = new Terning();
		aktiveT.add(t);
	}
}
