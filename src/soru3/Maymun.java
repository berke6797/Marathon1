package soru3;

public class Maymun extends MemeliHayvan{

	public Maymun(String hayvanAdi, int hayvanKilo, int hayvanUzunluk, boolean hayvanTehlikeliMi) {
		super(hayvanAdi, hayvanKilo, hayvanUzunluk, hayvanTehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(hayvanAdi+" isimli maymun yuruyor ");				
	}

	@Override
	public void sesCikar() {
		System.out.println(hayvanAdi+" isimli maymun ses cikariyor ");			
	}

	@Override
	public String toString() {
		return "Maymun [hayvanAdi=" + hayvanAdi + ", hayvanKilo=" + hayvanKilo + ", hayvanUzunluk=" + hayvanUzunluk
				+ ", hayvanTehlikeliMi=" + hayvanTehlikeliMi + "]";
	}

	

}
