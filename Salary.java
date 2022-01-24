
public class Salary {
	public static void main(String[] args) {
		int bs = 85000;
		float ta = 0.15f;
		float da = 0.20f;
		float hra = 0.18f;
		float pf = 0.20f;
		float tax = 0.25f;
		ta = ta*bs;
		da = da*bs;
		hra = hra*bs;
		pf = pf*bs;
		tax = tax*bs;
		float ga = 0.0f;
		ga = bs+ta+da+hra+pf;
		System.out.println("The gross amount is "+ga);
		float na = 0.0f;
		na = ga -tax;
		System.out.println("The net amount is "+na);
		
			
				
				
	}
	

}
