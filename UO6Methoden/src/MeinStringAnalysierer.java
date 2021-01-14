public class MeinStringAnalysierer{
	/**
	 * Liefert true zurück, wenn der String nicht null ist und nur Ziffern enthält.
	 * Beispiel: hatNurZiffern("12a43") ergibt false 
	 * hatNurZiffern("1242332322129") ergibt true
	 * @param s der zu untersuchende String
	 * @return true, falls der String nicht leer ist und nur aus Ziffern besteht
	 */
	public static boolean hatNurZiffern (String s) {
		boolean ret = false;

        if (s != null) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    counter++;
                }
            }
            if (counter != 0) {
                ret = false;
            }
            else if (counter == 0) {
                ret = true;
            }
        }
        return ret;
	}
		
	
	/**
	 * liefert den übergebenen String in umgekehrter Reihenfolge zurück. Falls der
	 * String null ist, wird null zurück geliefert.
	 * Beispiel: umdrehenString("Rudi") ergibt "iduR"
	 * @param s der umzudrehende String
	 * @return null falls der String s null ist, ansonsten den umgedrehten String
	 */
	public static String umdrehenString (String s) {
		String ret = null;
		char a = 'a';
		if(s != null) {
			ret = "";
			for(int i = s.length()-1;i >= 0;i--) {
				 a = s.charAt(i);
				 ret += a;
			}
		}else {
			ret = s;
		}
		return ret;
	}

	/**
	 * Liefert den um die Leerzeichen befreiten String zurück. Wird null übergeben,
	 * so liefert die Methode null zurück.
	 * Beispiel: loeschenLeerzeichen("Susi Sorglos sitzt") ergibt "SusiSorglossitzt"
	 * @param s der von Leerzeichen zu säubernde String
	 * @return null falls der übergebene String null ist, ansonsten den von Leerzeichen
	 * gesäuberten String
	 */
	public static String loeschenLeerzeichen (String s) {
		if (s == null) {
            return null;
        } else {
            String erg = "";
            for (int i = 0; i < s.length() - 1; i++) {
                if (Character.isWhitespace(s.charAt(i))) {
                    erg += s.charAt(i + 1);
                } else {
                    erg += s.charAt(i);
                }
            }
            return erg;
        }
	}
	
	/**
	 * Testet ob der übergebene String ein Palidrom ist, d. h. von hinten gelesen das 
	 * Selbe bedeutet wie von vorne gelesen. Falls null übergeben wurde oder die Länge
	 * des String 0 ist, wird false zurück geliefert.
	 * Bevor auf Palindrom getestet wird, werden alle Leerzeichen aus dem String 
	 * entfernt. Groß-/Kleinschreibung wird bei der Analyse nicht beachtet
	 * Beispiel: istPalindrom("Otto") ergibt true
	 * istPalindrom("Ei nie") ergibt true
	 * istPalindrom("Ein Neger mit Gazelle zagt im Regen nie") ergibt true
	 * @param s der zu untersuchende String
	 * @return true, falls der String nicht null und eine Länge größer als 0 und ein
	 * Palidrom ist
	 */
	public static boolean istPalindrom (String s) {
		String umgedreht = "";
        String gedreht = s;
        loeschenLeerzeichen(gedreht);
        gedreht.toLowerCase();
        for (int i = gedreht.length() - 1; i >= 0; i--){
            umgedreht += gedreht.charAt(i);
        }
        if (umgedreht.equals(gedreht)){
            return true;
        } else {
            return false;
        }
	}
	
	/**
	 * Gibt einen String zurückgibt, in dem die Zahl zahl linksbündig steht. Der String 
	 * soll anzahl Zeichen lang sein. Es müssen also rechts solange Leerzeichen ergänzt 
	 * werden, bis der String die passende Länge hat.
	 * Ist die Zahl länger als anzahl, so wird die Zahl in ihrer gesamten Länge zurück
	 * gegeben
	 * Beispiel: links(15,3) ergibt "15 "
	 * links(15,4) ergibt "15  "
	 * @param zahl die linksbündig ausgegeben werden soll
	 * @param anzahl die Länge des auszugebenden Strings
	 * @return den String, der ganz links die Zahl enthält und der auf anzahl Stellen
	 * bei Bedarf aufgefüllt wurde
	 */
	public static String links (int zahl, int anzahl) {
		int length = 0;
        int i = zahl;
        String erg = Integer.toString(zahl);
        while (i != 0){
            length ++;
            i /= 10;
        }
        if (anzahl < length){
            return erg;
        } else {
            anzahl -= length;
            while (anzahl != 0){
                erg += " ";
                anzahl--;
            }
            return erg;
        }
	}
	
	/**
	 * Gibt einen String zurückgibt, in dem die Zahl zahl rechtsbündig steht. Der String 
	 * soll anzahl Zeichen haben. Es müssen also links solange Leerzeichen ergänzt 
	 * werden, bis der String die passende Länge hat.
	 * Ist die Zahl länger als anzahl, so wird die Zahl in ihrer gesamten Länge zurück
	 * gegeben
	 * Beispiel: rechts(15,3) ergibt " 15"
	 * rechts(15,4) ergibt "  15"
	 * @param zahl die im String rechtsbündig ausgegeben werden soll
	 * @param anzahl die Länge des auszugebenden Strings
	 * @return den String, der ganz rechts die Zahl enthält und der auf anzahl Stellen
	 * bei Bedarf aufgefüllt wurde
	 */
	public static String rechts (int zahl, int anzahl) {
		int length = 0;
        int i = zahl;
        String erg = "";
        while (i != 0){
            length ++;
            i /= 10;
        }
        if (anzahl < length) {
            erg = Integer.toString(zahl);
            return erg;
        } else {
            anzahl -= length;
            while (length > 0) {
                erg += " ";
                length --;
            }
            erg += Integer.toString(zahl);
            return erg;
        }
	}
	
	/**
	 * Zählt wie viele Buchstaben im String s vorhanden sind. Die deutschen Umlaute 
	 * werden nicht mitgezählt. Groß-/Kleinschreibung wird ignoriert. 
	 * Ist s gleich null, so wird -1 als Ergebnis zurück geliefert
	 * Beispiel: zaehleBuchstaben("Hallo Müller06"))ergibt 10
	 * @param s der auf Buchstaben hin zu testenden String
	 * @return -1 falls s gleich null ist, ansonsten die Anzahl der Buchstaben die in
	 * s zu finden sind 
	 */
	public static int zaehleBuchstaben (String s) {
		int a = 0;
        if (s == null){
            return -1;
        } else {
            String b = s.toLowerCase();
            for (int i = 0; i < s.length() - 1; i++) {
                if (b.charAt(i) != '�' || b.charAt(i) != '�' || b.charAt(i) != '�') {
                    a++;
                }
            }
            return a;
        }
	}
	
	/**
	 * Zählt wie viele Zeichen im String s keine Buchstaben sind. Die deutschen Umlaute 
	 * werden mit gezählt (d.h. als keine Buchstaben interpretiert). Die 
	 * Groß-/Kleinschreibung wird ignoriert. 
	 * Ist s gleich null, so wird -1 als Ergebnis zurück geliefert
	 * Beispiel: zaehleNichtBuchstaben("Hallo Müller06")) ergibt 4
	 * @param s der auf Buchstaben hin zu testenden String
	 * @return -1 falls s gleich null ist, ansonsten die Anzahl der Zeichen im String,
	 * die nicht Buchstaben sind 
	 */
	public static int zaehleNichtBuchstaben (String s) {
		int a = 0;
        if (s == null){
            return -1;
        } else {
            String b = s.toLowerCase();
            for (int i = 0; i < s.length() - 1; i++) {
                if (b.charAt(i) == '�' || b.charAt(i) == '�' || b.charAt(i) == '�' ||
                        Character.isDigit(b.charAt(i))
                        || b.charAt(i) == ' ') {
                    a++;
                }
            }
            return a;
        }
	}
	
	/**
	 * Zählt wie oft das Zeichen c im String s vorkommt. Die Groß-/Kleinschreibung 
	 * wird ignoriert.
	 * Ist s gleich null, so wird -1 als Ergebnis zurück geliefert
	 * Beispiel: zaehleZeichen("Alle Bananen sind krumm!", 'a') ergibt 3
	 * @param s der zu durchsuchende String
	 * @param c das Zeichen, welches im String gesucht werden soll
	 * @return -1 falls der übergebenen String null ist, ansonsten die Anzahl wie oft
	 * das Zeichen c im String s vorkommt
	 */
	public static int zaehleZeichen (String s, char c) {
		int a = 0;
        if (s == null){
            return -1;
        } else {
            String b = s.toLowerCase();
            for (int i = 0; i < s.length() -1; i++){
                if ( b.charAt(i) == c ){
                    a++;
                }
            }
            return a;
        }
	}
	
	/**
	 * Löscht aus dem String s das Zeichen an der Position p.
	 * Falls der übergebene String gleich null ist, die übergebene Position < 0 oder
	 * über die Länge des Strings hinaus geht, wird null zurück geliefert 
	 * Beispiel: loescheZeichenAnPosition("Peters@platz", 6) ergibt "Petersplatz"
	 * @param s der String in welchem das Zeichen gelöscht werden soll
	 * @param p die Position an welcher das Zeichen gelöscht werden soll
	 * @return den String, der das zu löschende Zeichen an der Position nicht mehr
	 * enthält
	 */
	public static String loescheZeichenAnPosition (String s, int p) {
		if (s == null || p < 0 || p > s.length() - 1){
            return null;
        } else {
            StringBuilder a = new StringBuilder(s);
            a.deleteCharAt(p);
            String b = a.toString();
            return b;
        }
	}
	
	/**
	 * Löscht alle Zeichen c aus dem String s. Groß-/Kleinschreibung wird dabei beachtet.
	 * Falls als String null übergeben wird, so wird null zurück geliefert
	 * Beispiel: loescheZeichen("Ein Keller", 'e') ergibt "Ein Kllr"
	 * @param s der String in welchem das Zeichen c gelöscht werden soll
	 * @param c das zu löschende Zeichen
	 * @return der String, der keine Zeichen c mehr enthält
	 */
	public static String loescheZeichen (String s, char c) {
		if (s == null){
            return null;
        } else {
            StringBuilder a = new StringBuilder(s);
            for (int i = 0; i < s.length() - 2; i++){
                if (a.charAt(i) == c){
                    a.deleteCharAt(i);
                }
            }
            String b = a.toString();
            return b;
        }
	}
	
	/**
	 * Löscht aus dem String s einen Teilbereich heraus, der durch die Anfangsposition 
	 * start und durch seine Länge l gegegeben ist. Werden alle Zeichen gelöscht, so muss
	 * null zurück gegeben werden
	 * Liefert null zurück, falls der übergebene String null ist oder falls start
	 * und l über den String hinaus greifen.  s muss größer oder gleich 0 sein, und
	 * l muss größer als 0 sein
	 * Beispiel: loescheStringAnPosition("Hallo Leute!", 6, 5) ergibt "Hallo !"
	 * loeschenStringAnPosition("AG", 0, 2) ergibt null
	 * @param s der String in dem gelöscht werden soll
	 * @param start die Startposition ab der belöscht werden werden
	 * @param l die Anzahl der zu löschenden Zeichen
	 * @return der String, in dem mehrer Zeichen gelöscht wurden
	 */
	public static String loescheStringAnPosition (String s, int start, int l) {
		if (s == null || start > s.length() - 1 || s.length() <= 0 && l < 0) {
            return null;
        } else {
            int end = start + l;
            StringBuilder a = new StringBuilder(s);
            a.delete(start, end);
            String erg = a.toString();
            return erg;
        }
	}

	/**
	 * Löscht aus dem String s jedes Vorkommen des Strings ds. Die Groß-/Kleinschreibung
	 * wird dabei beachtet. Die beiden übergebenen Strings dürfen nicht null sein und
	 * müssen Zeichen enthalten. Werden alle Zeichen gelöscht, so wird null zurück
	 * geliefert 
	 * Beispiel: loescheString("HHallallo Leute-HALLHallo", "Hall") ergibt
	 * "Hallo Leute-HALLo"
	 * loescheString("HallHall","Hall") ergibt null
	 * @param s der String in dem gelöscht werden soll
	 * @param ls der zu löschende Teilstring
	 * @return der String, in dem der Teilstring nicht mehr vorkommt
	 */
	public static String loescheString (String s, String ls) {
		if (s == null || ls == null || s.equals(ls)){
            return null;
        } else {
            StringBuilder a = new StringBuilder(s);
            int start = a.indexOf(ls);
            int end = a.indexOf(ls) + ls.length();
            a.delete(start, end);
            String erg = a.toString();
            return erg;
        }
	}
}
	
