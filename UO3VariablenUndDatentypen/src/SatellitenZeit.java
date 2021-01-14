 
public class SatellitenZeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Satellitenzeit");
		System.out.println("==============");
		
		int se = readInt("Geben Sie die Sekunden ein: ");
		
		System.out.println();
		System.out.println("Die umgerechnete Zeit ist: ");
		System.out.print("d "+se/86400);
		System.out.print(" h "+(se-84600)/3600);
		System.out.print(" m "+(se-86400-3600*10)/60);
		System.out.print(" s "+(se-86400-3600*10-17*60));
		
		

	}
	
	public static int readInt(String text) {
	    System.out.print(text);
	    return (new java.util.Scanner(System.in)).nextInt();
	  }

}
