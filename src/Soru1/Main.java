package Soru1;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		sekilOlustur();

	}
	public static void sekilOlustur() {
		int yildizSayisi=7;
		
		 for (int i=0; i<3;i++) {
			 System.out.println("*******");
		 }
		for (int x=0;x<7;x++) {
			for (int y=0;y<yildizSayisi;y++) {
					System.out.print("*");
				}
				System.out.println("");
				yildizSayisi--;
		}
	  }
	}

					 
			
		

			

		
		

