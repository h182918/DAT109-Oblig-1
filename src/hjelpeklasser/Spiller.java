package hjelpeklasser;

import java.util.ArrayList;
import java.util.List;

public class Spiller {
	List<Terning> terninger;
	
	public Spiller() {
		
		Terning t1 = new Terning(1);
		Terning t2 = new Terning(2);
		Terning t3 = new Terning(3);
		Terning t4 = new Terning(4);
		Terning t5 = new Terning(5);

		terninger = new ArrayList<Terning>();
		terninger.add(t1);
		terninger.add(t2);
		terninger.add(t3);
		terninger.add(t4);
		terninger.add(t5);

	}
	
	public List<Terning> getTerninger(){
		return terninger;
	}
}
