import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Game {

	
	public static void main(String[] args) {
		//ArrayList <String> 
		Game g1 = new Game();
		ArrayList <Item> itemlist = new ArrayList<>();
		for(int i = 0; i<2; i++) {
			itemlist.add(new Item(itemlist.size(),"Schwert",2));
			itemlist.add(new Item(itemlist.size(),"Bogen",2));
			itemlist.add(new Item(itemlist.size(),"Schield",2));
			itemlist.add(new Item(itemlist.size(),"Zauberbarriere",2));
			itemlist.add(new Item(itemlist.size(),"Flinktrank",2));
			itemlist.add(new Item(itemlist.size(),"G�rteltasche",2));
			itemlist.add(new Item(itemlist.size(),"Karte",2));
			itemlist.add(new Item(itemlist.size(),"Schriftrolle",2));
			itemlist.add(new Item(itemlist.size(),"Romance",2));
			itemlist.add(new Item(itemlist.size(),"Malset",2));
			itemlist.add(new Item(itemlist.size(),"Blume",2));
			itemlist.add(new Item(itemlist.size(),"Burbon",2));
		}
		ArrayList <R�stung> r�stunglist1 = new ArrayList<>();
		String[] words = {
				"S Kopfschutz","S R�stung", "S Handschuhe","S Stiefel",
				"A Kopfschutz","A R�stung","A Handschuhe", "A Stiefel",
				"B Kopfschutz","B R�stung","B Handschuhe", "B Stiefel",
				"C Kopfschutz","C R�stung","C Handschuhe", "C Stiefel",
				"D Kopfschutz","D R�stung","D Handschuhe", "D Stiefel",
				"E Kopfschutz","E R�stung","E Handschuhe", "E Stiefel"};
		//erstelle 72 R�stungsobjekte: 24*3 = 72 gleichverteilt
		
		for (int e = 0; e< 3;e++) {
			for(int i = 0; i<words.length; i++) {//words.length = 24, 
				r�stunglist1.add(new R�stung(r�stunglist1.size(), words[i],0,0,0,0,0,0,0,0));
				
			}
		}
		// erstelle weitere 72 R�stungsobjekte, zuf�lligverteilt
		Random random = new Random();
		for (int i = 0; i < 72; i++) {
			
			r�stunglist1.add(new R�stung(r�stunglist1.size(),words[random.nextInt(words.length)],0,0,0,0,0,0,0,0));
		}

		for (int i = 0; i < r�stunglist1.size(); i++) {
			g1.doStats(r�stunglist1.get(i));
		}
		System.out.println(r�stunglist1.size());
		Collections.sort(r�stunglist1, new Comparator<R�stung>() {
            @Override
            public int compare(R�stung r1, R�stung r2) {
                boolean r1StartsWithS = r1.getName().startsWith("S");
                boolean r2StartsWithS = r2.getName().startsWith("S");

                if (r1StartsWithS && !r2StartsWithS) {
                    return -1; // r1 kommt vor r2
                } else if (!r1StartsWithS && r2StartsWithS) {
                    return 1; // r2 kommt vor r1
                } else {
                    // Wenn beide mit 'S' beginnen oder keiner, alphabetisch sortieren
                    return r1.getName().compareTo(r2.getName());
                }
            }
        });
		for(int i = 0; i<r�stunglist1.size(); i++) {

			System.out.print(r�stunglist1.get(i).getId()+" ");
			System.out.print(r�stunglist1.get(i).getName()+" ");
			System.out.print(r�stunglist1.get(i).getAtk()+" ");
			System.out.print(r�stunglist1.get(i).getDef()+" ");
			System.out.print(r�stunglist1.get(i).getSpd()+" ");
			System.out.print(r�stunglist1.get(i).getCrt()+" ");
			System.out.print(r�stunglist1.get(i).getIntl()+" ");
			System.out.print(r�stunglist1.get(i).getLck()+" ");
			System.out.print(r�stunglist1.get(i).getBrkrate()+" ");
			System.out.println(r�stunglist1.get(i).getBrkflg());
			
		}



		/*
		//id, name, atk, def, crt,intl,lck, spd
		Charakter C1 = new Charakter(1,"Favorite",50,50,5,10,5,10);

		Charakter C2 = new Charakter(9,"Underdog",50,50,5,10,5,10);
		for (int i= 0 ; i<10; i++) {
			int spw = (int)(Math.random() * 16) ;
			System.out.println(spw);
		}

		g1.fight(C1,C2);

		*/
		
		

	}
	
	//gibt einem Item den zuf�lligen Stat abh�ngig von der R�stungsQualit�t
	public void doStats (R�stung r1 ) {
		int zzahl= 0;
		if(r1.getName().charAt(0) =='S') {
			zzahl = 6;
		} else if(r1.getName().charAt(0)=='A') {
			zzahl = 5;
		} else if(r1.getName().charAt(0)=='B') {
			zzahl = 4;
		} else if(r1.getName().charAt(0)=='C') {
			zzahl = 3;
		} else if(r1.getName().charAt(0)=='D') {
			zzahl = 2;
		} else if(r1.getName().charAt(0)=='E') {
			zzahl = 1;
		}
		givestat(r1,zzahl);
	}
	//geh�rt zu doStat
	public void givestat(R�stung r1,int zahl) {
		
		int randzahl =0;
		
		if (zahl <4) {
			randzahl =(int) (Math.random()*6)+1;
			if(randzahl == 1) {
				r1.setAtk(zahl);
			} else if(randzahl ==2) {
				r1.setDef(zahl);
			} else if(randzahl ==3) {
				r1.setSpd(zahl);
			} else if(randzahl ==4) {
				r1.setCrt(zahl);
			} else if(randzahl ==5) {
				r1.setIntl(zahl);
			} else if(randzahl ==6) {
				r1.setLck(zahl);
			}
		} else {
			randzahl =(int) (Math.random()*4)+1;
			if(randzahl == 1) {
				r1.setAtk(zahl);
			} else if(randzahl ==2) {
				r1.setDef(zahl);
			} else if(randzahl ==3) {
				r1.setSpd(zahl);
			} else if(randzahl ==4) {
				r1.setCrt(zahl);
			}
		}
		
		
		
	}
	
	//legt fest wer gewinnen tut und wer nicht
	public  void fight(Charakter first, Charakter second) {
		
		int spw1 = (int)(Math.random() * 101) ;
		int spw2 = (int)(Math.random() * 101) ;
		while(spw1 <=first.getLck()&&spw2<=second.getLck()) {
			spw1 = (int)(Math.random() * 101) ;
			spw2 = (int)(Math.random() * 101) ;
			System.out.println("ups");

		}
		System.out.println("s1 luck "+first.getLck());
		System.out.println("s2 luck "+second.getLck());
		
		System.out.println("spw1 "+spw1);
		System.out.println("spw2 "+spw2);
		
		int lck1 = first.getLck();
		int lck2 = second.getLck();
		if(spw1<=lck1) {

			System.out.println("first hat durch Gl�ck gewonnen");
		} else if(spw2<=lck2) {
			System.out.println("second hat durch Gl�ck gewonnen");
		} else {

			int atk1 = first.getAtk();
			int def1 = first.getDef();
			int crt1 = first.getCrt();
			int spd1 = first.getSpd();
			

			int atk2 = second.getAtk();
			int def2 = second.getDef();
			int crt2 = second.getCrt();
			int spd2 = second.getSpd();
			
			int hp1 = 500;
			int hp2 = 500;
			
			int turn = 0;
			if(spd1<spd2) {
				turn = 1;
						
			}
			if (spd1==spd2) {
				if (Math.random()<0.5) {
					turn = 1;
				}
			}
			while (hp1 > 0 &&hp2 >0) {
				if(turn ==0) {
					turn = 1;
					hp2 = hp2-td(cd(atk1,def1,crt1));
					System.out.println(hp2);
				} else {
					turn =0;
					hp1 = hp1-td(cd(atk2,def2,crt2));
					System.out.println(hp1 +" s");
				}
			}
			if(hp1 <= 0) {
				System.out.println("P1 won");
			} else{
				System.out.println("P2 won");
			}
		}
		
		

	}
	
	
	//dem Angriffswert werden zuf�llig 0-15% Schaden abgezogen
	public int td(int atk) {
		int spw = (int)(Math.random() * 16) ;
		atk =(int) (atk * (100-spw)/100.0);
		System.out.println("atk = "+atk);
		return atk;
	}
	
	//Rohdamageformel
	public int cd(int atk, int def,double critChance) {
	    // Schritt 1: Basis-Schaden berechnen
	    double damage = 40 + (atk - def) * 0.5;

	    // Schritt 2: Sicherstellen, dass der Schaden nicht negativ ist
	    if (damage < 0) {
	        damage = 1;
	    }

	    // Schritt 3: Berechnen, ob ein kritischer Treffer erzielt wird
	    boolean isCritical = Math.random() < critChance;

	    // Schritt 4: Wenn ein kritischer Treffer, multipliziere den Schaden
	    if (isCritical) {
	        damage *= 1.5;
	    }

	    // Schritt 5: Runde den endg�ltigen Schaden auf die n�chste ganze Zahl
	    return (int) Math.round(damage);
	}

}
