
public class UmgekehrtesZahlenraten {

	public static void main(String[] args) {
		System.out.println("Umgekehrtes Zahlenraten");
        System.out.println("=======================");
        System.out.println("Suchen Sie sich eine Zahl im Intervall [0, 1000]");
        System.out.println("aus. Ich werde sie finden.");
        int a = 500;
        int i = 0;
        int j = 1000;
        int k = 0;
        int m = 0;
        int n = 1000;
        while (i != 2) {
            System.out.println("Mein Tipp: " + a);
            i = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2) :  ");
            // wenn kleiner
            if (i == 0) {
                // speichert immer das ältere a, dieses wird gebraucht um die Mitte zu bestimmen
                m = a;
                if (a > n) {
                    k = n;
                }
                // es wird immer der Mittelwert erstellt
                a = (a + k) / 2;
                // prüft ob die Eingabe stimmen kann
                if (a == m) {
                    System.out.println("Schummeln verboten!!!");
                    i = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2) :  ");
                }

            }
            // wenn größer
            if (i == 1) {
                n = a;
                if (a < m) {
                    j = m;
                }
                a = (a + j) / 2;
                if (a == n) {
                    System.out.println("Schummeln verboten!!!");
                    i = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2) :  ");
                }

            }
        }
        System.out.println("Ich habe die Zahl gefunden!");
    }



}


