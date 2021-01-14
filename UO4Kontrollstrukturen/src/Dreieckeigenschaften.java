
public class Dreieckeigenschaften {

	public static void main(String[] args) {
		System.out.println("Eigenschaften eines Dreiecks");
		System.out.println("============================");
		double a = TestScanner.readDouble("Seite a: ");
		double b = TestScanner.readDouble("Seite b: ");
		double c = TestScanner.readDouble("Seite c: ");
		int i = 0;
		double summe = 0;
		System.out.println();
		while (i == 0) {
			// überprüft ob es sich um ein unmögliches Dreieck handelt
			if (a + b < c || a + c < b || b + c < a) {
				System.out.println("Unmögliches Dreieck");
				i = 1;
			}
			// es wird nur gerechnet wenn i 0 ist
			if (i == 0) {
				// berechnet den Umfang
				summe = a + b + c;
				System.out.println("Umfang: " + summe);
				summe = summe / 2;
				// berechnet die Fläche
				summe = Math.sqrt(summe * (summe - a) * (summe - b) * (summe - c));
				System.out.println("Fläche: " + summe);
				// überprüft ob es sich um ein gleichseitiges Dreieck handelt
				if (a == b && a == c) {
					System.out.println("Gleichseitiges Dreieck");
				}
				// überprüft ob es sich um ein gleichschenkliges Dreiech handelt
				if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
					System.out.println("Gleichsckenkliges Dreieck");
				}
				// ermittelt die Hypothenuse
				// if (a > b && a > c) {
				// überprüft ob das Dreieck rechtwinklig ist
				if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
					// überprüft ob es ein Pythagoräisches Dreieck ist
					if (a % 1 == 0 && b % 1 == 0 && c % 1 == 0) {
						System.out.println("Pythagoräisches Dreieck");
					}
					System.out.println("Hypothenuse: " + a);
					// }

				} // else if (b > a && b > c) {
				else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
					if (a % 1 == 0 && b % 1 == 0 && c % 1 == 0) {
						System.out.println("Pythagoräisches Dreieck");
					}
					System.out.println("Hypothenuse: " + b);
					// }
				} // else if (c > a && c > b) {
				else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
					if (a % 1 == 0 && b % 1 == 0 && c % 1 == 0) {
						System.out.println("Pythagoräisches Dreieck");
					}
					System.out.println("Hypothenuse: " + c);
					// }
				}
			}
			System.out.println();
			// schaut ob der Benutzer weiterrechnen will
			i = TestScanner.readInt("Nochmal (0), Beenden (1) : ");
			System.out.println();
			if (i == 0) {
				a = TestScanner.readDouble("Seite a: ");
				b = TestScanner.readDouble("Seite b: ");
				c = TestScanner.readDouble("Seite c: ");
				System.out.println();
			}
		}

	}



}


