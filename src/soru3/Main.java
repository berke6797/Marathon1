package soru3;

public class Main {

	public static void main(String[] args) {
		
		HayvanatBahcesi hayvanatBahcesi= new HayvanatBahcesi();
		Yilan yilan1= new Yilan("yilan1", 10, 2, true);
		Kertenkele kertenkele1= new Kertenkele("kertenkele1", 2, 1, false);
		Aslan aslan1= new Aslan("Aslan1", 2, 1, true);
		Maymun maymun1= new Maymun("Maymun1", 1, 1, false);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan1);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(maymun1);
		hayvanatBahcesi.bahceyeSurungenHayvanEkle(kertenkele1);
		hayvanatBahcesi.bahceyeSurungenHayvanEkle(yilan1);
		System.out.println("-------------------------------------------------------------------------------------------");
		hayvanatBahcesi.hayvanSesCikarsin(maymun1);
		hayvanatBahcesi.hayvanSesCikarsin(aslan1);
		hayvanatBahcesi.hayvanSesCikarsin(yilan1);
		hayvanatBahcesi.hayvanSesCikarsin(kertenkele1);
		System.out.println("-------------------------------------------------------------------------------------------");
		hayvanatBahcesi.hayvaninCinsiniBul("kertenkele1");
	} 

}
