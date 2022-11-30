package soru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi implements IbahceyeEkle{
	
	List<Hayvan> hayvanlar= new ArrayList<>();
	
	@Override
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
	hayvanlar.add(m);
	System.out.println(m+" memeli hayvani hayvanat bahcesine eklendi");
			}	
		
	@Override
	public void bahceyeSurungenHayvanEkle(Surungen s) {
	hayvanlar.add(s);
	System.out.println(s+" surungen hayvani hayvanat bahcesine eklendi");
	}
	
	
	public void hayvanSesCikarsin(Hayvan h) {
	h.sesCikar();
	
	}

	public void	hayvaninCinsiniBul(String hayvanAdi) {

	}

    public void	hayvaninBilgileriniYazdir(String hayvanAdi){
		
	}

    public void	hayvaniHareketEttir(String hayvanAdi){
    	
    	}

	}

	


