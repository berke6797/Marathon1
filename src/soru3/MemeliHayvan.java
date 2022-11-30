package soru3;

public abstract class MemeliHayvan extends Hayvan {
	
 public MemeliHayvan(String hayvanAdi, int hayvanKilo, int hayvanUzunluk, boolean hayvanTehlikeliMi) {
		super(hayvanAdi, hayvanKilo, hayvanUzunluk, hayvanTehlikeliMi);
			
 }

public	abstract void yuru();
 
}
