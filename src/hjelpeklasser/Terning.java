package hjelpeklasser;

import java.util.Random;

public class Terning {
	private static Random random = new Random();
	private Integer verdi;
	private int nr;
	
	public Terning(int nr){
		this.nr = nr;
	}
	
	public void trill(){
		verdi = random.nextInt(6) + 1;
//		String dyret;
//		if(verdi == 1) {
//			dyret = "løve";
//		}else if(verdi == 2){
//			dyret = "slange";
//		}else if(verdi == 3) {
//			dyret = "panda";
//		}else if(verdi == 4){
//			dyret = "gris";
//		}else if(verdi == 5) {
//			dyret = "elefant";
//		}else{
//			dyret = "hval";
//		}
//		return dyret;
	}

	public Integer getVerdi() {
		return verdi;
	}	
}