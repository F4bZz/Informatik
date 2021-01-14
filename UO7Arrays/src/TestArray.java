public class TestArray {

	public static void main(String[] args) {
		int[] a = randomIntArray(5, -5, 20);
		printIntArray("a = ", a);
		printIntArray("", randomIntArray(50, -1, 1));
		System.out.println(getMinimum(randomIntArray(5, -5, 20)));
	    System.out.println(getMaximum(randomIntArray(5, -5, 20)));
	    System.out.println(getMittelwert(randomIntArray(5, -5, 20)));	
	}

	/**
	 * Gibt ein Array in Java-Notation aus
	 * 
	 * @param msg
	 *            Text, der vor dem Array augegeben werden soll
	 * @param a
	 *            das Array das ausgegeben wird
	 */
	public static void printIntArray(String msg, int[] a) {
		System.out.print(msg + "{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	/**
	 * Füllt ein Array mit Zufallszahlen. Es werden die Variablen von und bis
	 * verwendet um die Ober- und Untergrenze festzulegen
	 * 
	 * @param anzahl
	 *            Die Anzahl der Zahlen im Array
	 * @param von
	 *            Untergrenze der Zufallszahlen
	 * @param bis
	 *            Obergrenze der Zufallszahlen
	 * @return Der String mit gefüllten Zufallszahlen
	 */
	public static int[] randomIntArray(int anzahl, int von, int bis) {
		int[] ret = new int[anzahl];
		for (int i = 0; i < anzahl; i++) {
			ret[i] = (int)(Math.random()*((bis - von)+1))+von;

		}
		return ret;
	}
	/**
	 * Ermittelt die kleinste Zahl unter den zufällig generierten Zahlen
	 * @param a das Array in dem die zufällig generierten Zahlen enthalten sind
	 * @return die kleinste Zahl
	 */
	public static int getMinimum(int [] a) {
		int ret = a[0];
		for(int i = 0;i < a.length;i++) {
			if(a[i] < ret) {
				ret = a[i];
			}
		}
		return ret;
	}
	/**
	 * Ermittelt die größte Zahl unter den zufällig generierten Zahlen
	 * @param a das Array in dem die zufällig generierten Zahlen enthalten sind
	 * @return die größte Zahl
	 */
	public static int getMaximum(int[] a) {
		int ret = a[0];
		for(int i = 0;i < a.length;i++) {
			if(a[i] > ret) {
				ret = a[i];
			}
		}
		return ret;
	}
	/**
	 * Ermittelt den Mittelwert der zufällif generierten Zahlen
	 * @param a das Array in dem die zufällig generierten Zahlen enthalten sind
	 * @return den Mittelwert
	 */
	public static double getMittelwert(int[] a) {
		double ret = a[0];
		for(int i = 0;i < a.length;i++) {
			ret = ret + a[i];
		}
		ret = ret /a.length;
		return ret;
	}
	
	public static int indexOf(int[]a, int z) {
		int ret = a[0];
		for(int i = 0;i < a.length;i++) {
			if(a[i]==z) {
				ret = i;
			}
		}
		return ret;
	}
}
