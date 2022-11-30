package soru3;

public class Yilan extends Surungen {

	public Yilan(String hayvanAdi, int hayvanKilo, int hayvanUzunluk, boolean hayvanTehlikeliMi) {
		super(hayvanAdi, hayvanKilo, hayvanUzunluk, hayvanTehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println(hayvanAdi+" isimli yilan surunuyor ");	
		
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(hayvanAdi+" isimli yilan tisliyor ");	
	}

	@Override
	public String toString() {
		return "Yilan [hayvanAdi=" + hayvanAdi + ", hayvanKilo=" + hayvanKilo + ", hayvanUzunluk=" + hayvanUzunluk
				+ ", hayvanTehlikeliMi=" + hayvanTehlikeliMi + "]";
	}

	
}
