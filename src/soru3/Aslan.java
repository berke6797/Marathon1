package soru3;

public class Aslan extends MemeliHayvan{

	public Aslan(String hayvanAdi, int hayvanKilo, int hayvanUzunluk, boolean hayvanTehlikeliMi) {
		super(hayvanAdi, hayvanKilo, hayvanUzunluk, hayvanTehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(hayvanAdi+" isimli aslan yuruyor ");		
	}
 
	@Override
	public void sesCikar() {
		System.out.println(hayvanAdi+" isimli aslan kukruyor ");			
	}

	@Override
	public String toString() {
		return "Aslan [hayvanAdi=" + hayvanAdi + ", hayvanKilo=" + hayvanKilo + ", hayvanUzunluk=" + hayvanUzunluk
				+ ", hayvanTehlikeliMi=" + hayvanTehlikeliMi + "]";
	}

	
	
	

}
