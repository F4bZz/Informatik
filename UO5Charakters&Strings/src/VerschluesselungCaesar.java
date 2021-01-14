
public class VerschluesselungCaesar {

	public static void main(String[] args) {
		System.out.println("Verschlüsselung nach Caesar");
		System.out.println("===========================");
		// deklarierung der variablen
		char vea = TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
		while (vea != 'a') {
			String text = TestScannerErweitert.readString("Text: ");
			int ver = TestScannerErweitert.readInt("Verschiebung: ");
			char a = 'a';
			int j = 122;
			int k = (char) ver;
			int l = 97;
			// verschiebung nach Caesar verschlüsselung
			if (vea == 'v') {
				for (int i = 0; i < text.length(); i++) {
					a = text.charAt(i);
					if (Character.isWhitespace(a)) {
						i++;
						a = text.charAt(i);
					}
					a = (char) (a + ver);
					k = a;
					if (j < a) {
						k = k - j;
						a = (char) ((int) 'a' + (int) k - 1);
					}
					a = Character.toUpperCase(a);
					System.out.print(a);

				}
		

			}else if (vea == 'e') {
				for (int i = 0; i < text.length(); i++) {
					a = text.charAt(i);
					if (Character.isWhitespace(a)) {
						i++;
						a = text.charAt(i);
					}
					a = (char) (a - ver);
					k = a;
					if (l > a) {
						k = l - k;
						a = (char) ((int) 'z' - (int) k + 1);
					}
					a = Character.toUpperCase(a);
					System.out.print(a);

				}				

			}
			System.out.println();
			vea = TestScannerErweitert.readChar("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
			
		}

	}

}
