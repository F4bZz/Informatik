
public class SparenInRaten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sparen in Raten");
		System.out.println("================");
		
		double i = readDouble("Geben Sie das Guthaben am Jahresanfang ein: ");
		double a = readDouble("Geben Sie die Monatsrate ein: ");
		double g = readDouble("Geben Sie den jahreszinssatz ein: ");
		double rz = (a*g/100)/12;
		double rzerg = 0;
		int b = 1;
		
		while(b<=12) {
			rzerg = rzerg + (rz*b);
			b++;
		}
		System.out.println();
		System.out.println("Das Guthaben am Ende des Jahres beträgt: " + Math.floor((i+((i*g)/100)+(12*a)+rzerg)*100)/100);
		

	}
	  
	
	
	
	public static double readDouble(String text) {
		    System.out.print(text);
		    return (new java.util.Scanner(System.in)).nextDouble();
		  }

}
