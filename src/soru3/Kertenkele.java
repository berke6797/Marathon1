package soru3;

public class Kertenkele extends Surungen{

	public Kertenkele(String hayvanAdi, int hayvanKilo, int hayvanUzunluk, boolean hayvanTehlikeliMi) {
		super(hayvanAdi, hayvanKilo, hayvanUzunluk, hayvanTehlikeliMi);
		
	}

	@Override
	public void surun() {
		System.out.println(hayvanAdi+" isimli kertenkele surunuyor ");			
	}

	@Override
	public void sesCikar() {
		System.out.println(hayvanAdi+" isimli kertenkele ses cikariyor ");			
	}

	@Override
	public String toString() {
		return "Kertenkele [hayvanAdi=" + hayvanAdi + ", hayvanKilo=" + hayvanKilo + ", hayvanUzunluk=" + hayvanUzunluk
				+ ", hayvanTehlikeliMi=" + hayvanTehlikeliMi + "]";
	}


}
