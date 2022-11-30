package soru3;

public abstract class Hayvan extends HayvanatBahcesi{

	public	String hayvanAdi;
	public	int hayvanKilo;
	public	int hayvanUzunluk;
	public	boolean hayvanTehlikeliMi;
	
	
	public Hayvan(String hayvanAdi, int hayvanKilo, int hayvanUzunluk, boolean hayvanTehlikeliMi) {
		super();
		this.hayvanAdi = hayvanAdi;
		this.hayvanKilo = hayvanKilo;
		this.hayvanUzunluk = hayvanUzunluk;
		this.hayvanTehlikeliMi = hayvanTehlikeliMi;
	}


	public abstract void sesCikar();



}
