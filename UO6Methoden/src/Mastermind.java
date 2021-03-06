
public class Mastermind {

	public static void main(String[] args) {
		// Syntax
		System.out.println("Mastermind");
		System.out.println("==========");
		// Declare int farben for how many different Letter there can be in the code
		int farben = 0;

		// Loop for reading farben, TryCatch if the Input isnt a Int
		for (boolean check1 = false; check1 != true;) {
			// Boolean to check if input is an integer
			boolean success = false;
			try {
				// Read farben
				farben = TestScannerErweitert.readInt("Anzahl Farben: ");
				success = true;
			// Exception thrown when Input does not equal the Value Type
			} catch (java.util.InputMismatchException e) {
				System.out.println("Anzahl Farben muss eine Zahl sein");
			}
			// Escape the Loop
			if (success) {
				check1 = true;
			}

		}

		// Declare tipp for later
		String tipp = "";

		// Loop for Repeating the Game after combination found
		for (boolean check2 = false; check2 != true;) {

			// Syntax
			System.out.print("=====================> ");
			// Read tipp
			String temp = eingabeTipp();
			// Generate the code used to compare
			String codeTrue = erzeugeCode(temp.length(), farben);
			// Check if generated code equals "ende", which means that the user wants to exit the program
			if (!temp.equals("ende")) {
				// Temp Values
				int i = 1;
				int tempi = 1;
				// Doing the same until code was found
				for (boolean check3 = false; check3 != true;) {

					// For first run use temp instead of tipp
					if (tempi == 1) {
						tipp = temp;
						tempi++;
					}

					// Make tipp UpperCase so it can be compared with codeTrue
					tipp = tipp.toUpperCase();
					// Print everything after Syntax given
					System.out.print(i + ") : " + tipp + " = (w: " + ermittleWeiss(codeTrue, tipp) + ", s: "
							+ ermittleSchwarz(codeTrue, tipp) + ") : ");
					i++;

					// Should Black be 4 the code was found
					if (ermittleSchwarz(codeTrue, tipp) == 4) {
						check3 = true;
						System.out.println("Code gefunden");
					// Else get new Input
					} else {
						tipp = eingabeTipp();
					}

					// End the Program if Input is "ende"
					if (tipp.equals("ende")) {
						System.out.print(i + ") : " + tipp + " = (w: " + ermittleWeiss(codeTrue, tipp)
								+ ", s: " + ermittleSchwarz(codeTrue, tipp) + ") : Ende");
						check2 = true;
						check3 = true;
					}
				}
			// If the User wants to end the Program give him this Syntax and end the Program
			} else {
				System.out.println("1) : ENDE = (w: " + ermittleWeiss(codeTrue, tipp) + ", s: "
						+ ermittleSchwarz(codeTrue, tipp) + ") : Ende");
				check2 = true;
			}

		}
	}

	/**Check how many Letters are the same on the same indexes on the strings codeTrue
	 * and codeGuess
	 * Example = "ABCD", "ADEF" = 1
	 * @param codeTrue = Code generated by Computer
	 * @param codeGuess = Code input by User
	 * @return ret = How many Letters are the same on same indexes
	 */
	public static int ermittleSchwarz(String codeTrue, String codeGuess) {
		// Declare ret
		int ret = -1;
		// Declare count
		int count = 0;
		// Both codes must be the same length and the length must be greater than zero
		if (codeTrue.length() == codeGuess.length() && codeTrue.length() > 0) {
			// loop through the codes
			for (int i = 0; i <= codeTrue.length() - 1; i++) {
				// If its the same char increment count by 1
				if (codeTrue.charAt(i) == codeGuess.charAt(i)) {
					count++;
				}
			}
			// ret is count
			ret = count;
		}
		// return ret
		return ret;
	}

	/**Make Code which has random letters from A to Index farben and is	
	 * stellen long.
	 * Example = erzeugeCode(4,4) = "abcd"
	 * @param stellen = Length of code
	 * @param farben = How many different colors
	 * @return ret = Made Code
	 */
	public static String erzeugeCode(int stellen, int farben) {
		// Declare ret
		String ret = "";
		// Declare the alphabet
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// If there are less colors than indexes return null
		if (farben < stellen) {
			// ret is null
			ret = null;
		} else {
			// Loop until i is stellen - 1
			for (int i = 0; i <= stellen - 1; i++) {
				// Get a random number between 0, farben - 1
				int rnd = getRandomNumberInRange(0, farben - 1);
				// Loop until temp is true for not getting the same color twice
				for (boolean temp = false; temp != true;) {
					// Replace each number gotten by rnd simulator with 0 so you can check so
					if (abc.charAt(rnd) == '0') {
						// If its the same number again get a new number
						rnd = getRandomNumberInRange(0, farben - 1);
					} else {
						// else break the loop
						temp = true;
					}
				}
				// Add the char of the corrisponding rnd index in the alphabet
				ret += abc.charAt(rnd);
				// Reaplace the number with 0 so it doesnt come up again
				abc = abc.replace(abc.charAt(rnd), '0');
			}
		}
		// return ret
		return ret;
	}

	/**
	 * Get every Letter that is in the code but on the wrong index
	 * Example: codeTrue = "abcd", codeGuess = "afed", ret = 2
	 * @param codeTrue = generated Code
	 * @param codeGuess = Guess
	 * @return ret = How many Letters are on the wrong place
	 */
	public static int ermittleWeiss(String codeTrue, String codeGuess) {
		// Declare return
		int ret = -1;
		// Declare a counter for endresult
		int count = 0;
		// Make Constant Length
		final int LEN = codeTrue.length();
		// Cycle through codeTrue and codeGuess
		for (int i = 0; i < LEN; i++) {
			// Check if other String contains the Letter but not on the same index
			if (codeGuess.contains(String.valueOf(codeTrue.charAt(i))) && codeGuess.indexOf(codeTrue.charAt(i)) != i) {
				// Inkrement Counter
				count++;
			}
			// Return is count
			ret = count;
		}
		// Return ret
		return ret;
	}

	/**
	 * Methode to get the Input (Tipp)
	 * Example: Ihr Tipp: // <-- Input
	 * @return ret = Input
	 */
	public static String eingabeTipp() {
		// Declare ret
		String ret = "";
		// End Loop if check = true
		for (boolean check = false; check != true;) {
			// Use TestScanner to get Input
			ret = TestScannerErweitert.readString("Ihr Tipp: ");
			// If Input isn't Empty break the loop
			if (!ret.isEmpty()) {
				check = true;
			}
		}
		// return ret
		return ret;
	}

	/**
	 * Check if Input contains multiple of the same colors
	 * Example: "abcc" = true, "abcd" = false 
	 * @param s = Input Code
	 * @return ret
	 */
	public static boolean enthaeltDoppelte(String s) {
		// Declare count
		int count = 0;
		// Declare ret
		boolean ret = false;
		// Loop s.Length() times for each char
		for (int i = 0; i < s.length() - 1; i++) {
			// Loop through String
			for (int j = i + 1; j < s.length(); j++) {
				// If is same Letter increment count
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
		}
		// ret is true if count isnt 1
		if (count > 1) {
			ret = true;
		}
		// return ret
		return ret;
	}

	/**
	 * Get random number between min und max
	 * Example: getRandomNumberInRange(1,5) = 3
	 * @param min = min Number from random
	 * @param max = max Number from random
	 * @return Random Number between min and max
	 */
	public static int getRandomNumberInRange(int min, int max) {
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
}