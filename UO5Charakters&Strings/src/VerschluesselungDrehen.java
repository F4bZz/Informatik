
public class VerschluesselungDrehen {

	public static void main(String[] args) {
		
		System.out.println("Verschl�sselung durch Drehen");
		System.out.println("============================");
		char c = 0;
		//Variablen werden eingegeben
		while(c == 0) {
			String s = TestScannerErweitert.readString("Text: ");
			int anfang = 0;
			int ende = s.length() -1;
			while (s.length() == 0) {
				System.out.println("Text muss mindestens ein Zeichen enthalten");
				s = TestScannerErweitert.readString("Text: ");
			}
			//die Variablen werden durch Drehen verschl�sselt
			System.out.print("Verschl�sselt: ");
			while (anfang != ende) {
				System.out.print(s.charAt(anfang));
				System.out.print(s.charAt(ende));
				anfang++;
				ende--;
			}
			//Es wird gefragt ob man den Ablauf nochmal machen m�chte
			System.out.println();
			c = TestScannerErweitert.readChar("Nochmal j/n? ");
			if (c == 'n') {
				c++;
			}else {
				c = 0;
			}
			
		}

	}

}
