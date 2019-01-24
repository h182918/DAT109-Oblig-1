package yatzoo;

import java.util.ArrayList;
import java.util.List;

import hjelpeklasser.Spiller;

public class Start {

	public static void main(String[] args) {
		List<Spiller> spillere = new ArrayList<Spiller>();
		Spiller p1 = new Spiller();
		Spiller p2 = new Spiller();
		Spiller p3 = new Spiller();
		Spiller p4 = new Spiller();
		spillere.add(p1);
		spillere.add(p2);
		spillere.add(p3);
		spillere.add(p4);
		Yatzoo startSpill = new Yatzoo(spillere);
		startSpill.start();
		
		
	}

}
