
public class DoubleUeberlauf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = Math.pow(2, 1024);
		int j = 1;
		
		while(j<=100000) {
			i=i+1000;
			System.out.println(j+"   "+i);
			j++;
		}
		System.out.print("     ");
		System.out.println(Math.pow(2,1024));
		
		
		
			
		}
		
				
		
		

}


