public class MeinZahlensystemwandler {
	/**
	 * Wandelt das Zeichen nr in eine Zahl um, wobei die Groß-/Klein-schreibung
	 * ignoriert wird: '0' ergibt 0, '1' ergibt 1, ... '9' ergbit 9, 'A' ergibt 10,
	 * 'B' ergibt 11, ..., 'Z' ergibt 35 Sollte ein ungültiges Zeichen übergeben
	 * werden, so gibt die Methode -1 zurück
	 * 
	 * @param nr
	 *            das umzuwandelnde Zeichen
	 * @return die Zahl für die das Zeichen steht
	 */
	public static int getDigit(char nr) {
		int ret = -1;
		if (Character.isDigit(nr) || Character.isLetter(nr)) {
			nr = Character.toLowerCase(nr);
			if (Character.isDigit(nr) && nr - 48 <= 10) {
				ret = nr - 48;
			}
			if (Character.isLetter(nr)) {
				ret = nr - 87;
			}
		}
		return ret;
	}

	/**
	 * Wandelt die Nummer der Ziffer nr in ein Zeichen um: 0 ergibt '0', 1 ergibt
	 * '1', ..., 9 ergibt '9', 10 ergibt 'A', 11 ergibt 'B', ..., 35 ergibt 'Z'
	 * Sollte eine ungültige Nummer übergeben werden, so gibt die Methode einen
	 * Stern '*' zurück
	 * 
	 * @param nur die Nummer welche in ein Zeichen umgewandelt werden soll
	 * @return das Zeichen das für die Nummer steht
	 */
	public static char getDigit(int nr) {
		char ret = '*';
		// Numbers begins at 48
		if (nr >= 0 && nr <= 9) {
			ret = (char)(nr + 48); 
		}
		// Alphabet begins at Number 65
		else {
			// - 10 for 0 - 9
			ret = (char)(nr - 10 + 65); 
		}    
		return ret;
	}

	/**
	 * Wandelt die Zahl num mit der Basis basis in eine Dezimalzahl um und liefert
	 * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge
	 * gleich 0 ist oder die Basis kleiner als 2 ist, wird -1 zurück geliefert. Wenn
	 * eine Ziffer der übergebenen Zahl nicht zur Basis pass, wird ebenfalls -1
	 * zurück geliefert Beispiel: numToDec("01110110", 2) ergibt 118
	 * numToDec("170712", 8) ergibt 61898 numToDec("170712", 7) ergibt -1
	 * 
	 * @param num
	 *            die umzuwandelnde Zahl als String übergeben
	 * @param basis
	 *            die Basis der umzuwandelnden Zahl
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static int numToDec(String num, int basis) {
		int len = String.valueOf(num).length();
		// Exponent Initialisieren
		int p = 1;
		// Return initialisieren
		int ret = 0;

		// Char * Exponent für jeden Char in z
		for (int i = len - 1; i >= 0; i--) {
			// Nummer im Input muss kleiner als Basis sein
			if (getDigit(num.charAt(i)) >= basis) {
				System.out.println("Invalid Number");
				return -1;
			}
			ret += getDigit(num.charAt(i)) * p;
			p = p * basis;
		}

		return ret;
	}

	/**
	 * Wandelt die Dezimalzahl dec in eine Zahl mit der Basis basis um und gibt
	 * diese zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein und
	 * die Basis muss größer als 1 sein, ansonsten wird null zurück geliefert.
	 * Beispiel: decToNum(118,2) ergibt 1110110 decToNum(61898,8) ergibt 170712
	 * 
	 * @param dec die umzuwandelnde Dezimalzahl
	 *        
	 * @param basis
	 *            nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 */
	public static String decToNum(int dec, int basis) {
		String ret = null;
		if (dec >= 0 && basis > 1) {
			String retTemp = "";
			// Remainder of dec % basis to retTemp
			while (dec > 0) {
				retTemp += getDigit(dec % basis);
				dec /= basis;
			}
			ret = "";
			// Reverse the String
			for (int i = retTemp.length() - 1; i >= 0; i--) {
				ret += retTemp.charAt(i);
			}
		}
		return ret;
	}

	public static int hexToDec(String num) {
		int len = num.length();
		int pow = 0;
		int basis = 16;
		int ret = 0;

		for (int i = len - 1; i >= 0; i--) {
			if (getDigit(num.charAt(i)) >= basis) {
				System.out.println("Invalid Number");
				return -1;
			}
			ret = ret + getDigit(num.charAt(i)) * (int) Math.pow(basis, pow);
			pow++;

		}
		return ret;
	}

	public static String decToHex (int dec) {
		int basis = 16;
		String ret = "";
		int rest = 0;
		while(dec > 0) {
			rest = dec%basis;
			dec = dec/basis;
			ret = ret+getDigit(rest);
			
			
		}
		ret = MeinStringAnalysierer.umdrehenString(ret);
		return ret;
		
	}

	
	public static int dualToDec(String num, int basis) {
		int len = num.length();
		// Exponent Initialisieren
		int p = 1;
		// Return initialisieren
		int ret = 0;

		// Char * Exponent für jeden Char in z
		for (int i = len - 1; i >= 0; i--) {
			// Nummer im Input muss kleiner als Basis sein
			if (getDigit(num.charAt(i)) >= basis) {
				System.out.println("Invalid Number");
				return -1;
			}
			ret += getDigit(num.charAt(i)) * p;
			p = p * basis;
		}

		return ret;
		
		
	}
	
	public static String decToDual(int dec, int basis) {
		String ret = null;
		if (dec >= 0 && basis > 1) {
			String retTemp = "";
			// Remainder of dec % basis to retTemp
			while (dec > 0) {
				retTemp += getDigit(dec % basis);
				dec /= basis;
			}
			ret = "";
			// Reverse the String
			for (int i = retTemp.length() - 1; i >= 0; i--) {
				ret += retTemp.charAt(i);
			}
		}
		return ret;
		
	}
}