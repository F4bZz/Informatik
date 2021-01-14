
public class WuerfelSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Würfelsimulation");
		System.out.println("================");
		
		int i = 1000000000;
		double  j = 0;
		int a = 1;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int lade = 1;
		
		System.out.println();
		System.out.println("Bitte warten");
		
		
		
		while(a <= i) {
			a++;
			j = Math.floor(Math.random()*6)+1;
			if(j == 1) {
				a1++;
			}else if(j == 2) {
				a2++;
			}else if(j == 3) {
				a3++;
			}else if(j == 4) {
				a4++;
			}else if(j == 5) {
				a5++;
			}else if(j == 6) {
				a6++;
			}
			if (lade%(i/30)==0) {
				System.out.print(".");
				
			}
			lade++;
		}
		System.out.println();
		System.out.println("Anzahl 1: "+a1);
		System.out.println("Anzahl 2: "+a2);
		System.out.println("Anzahl 3: "+a3);
		System.out.println("Anzahl 4: "+a4);
		System.out.println("Anzahl 5: "+a5);
		System.out.println("Anzahl 6: "+a6);
		System.out.println();
		System.out.println("Anzahl Würfel: "+i);
		
		
		
		
		
	

	}

}
