
public class GgTEuklid {

	public static void main(String[] args) {
		System.out.println("GgT von Euklid");
		System.out.println("=============");
		//Die Variablen werden eingegeben
		int a = TestScanner.readInt("Erste Zahl: ");
        int b = TestScanner.readInt("Zweite Zahl: ");
        int c = 0;
        //ggT wird berechnet
        if(a>b) {
        	while(b!=0) {
            	if (a%b==0) {
            		System.out.println("Der größte geimeinsame Teiler ist: "+b);
            	}else {
            		c=a%b;
            		a=b;
            		b=c;
            		
            		
            	}
            }
        }else 
        	System.out.println("Die erste Zahl muss größer als die zweite Zahl ein");
       
	}

}
