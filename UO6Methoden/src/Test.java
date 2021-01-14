
public class Test {

	public static void main(String[] args) {
		System.out.println(decToHex(90));
	}
	
	public static String decToHex (int dec) {
		int basis = 16;
		String ret = "";
		int rest = 0;
		while(dec > 0) {
			rest = dec%basis;
			dec = dec/basis;
			ret = ret+MeinZahlensystemwandler.getDigit(rest);
			
			
		}
		ret = MeinStringAnalysierer.umdrehenString(ret);
		return ret;
		
	}
}
