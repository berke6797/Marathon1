package Soru2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		tekrarEdenSayiBul();
		}
	
	public static void tekrarEdenSayiBul() {
		int tekrarSayisi=0;
		int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		int tekrarEdenSayilar[]= {};
		for (int i=0;i<sayiDizisi.length;i++) {
			for(int j=i+1;j<sayiDizisi.length;j++ ) {
				  if(sayiDizisi[i]==sayiDizisi[j])
				  {
					 
				  	}
			}
		}
		System.out.println(tekrarEdenSayilar+"----"+tekrarSayisi);
	}
}



