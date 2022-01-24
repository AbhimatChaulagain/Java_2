
public class Interest {
	public static void main(String[] args) {
		int p = 500000;
		int t = 5;
		float r = 0.68f;
		float i = 0.0f;
		i = (p*t*r)/100;
		float a =0.0f;
		a = i + p;
		System.out.println("The interest amount is "+i+ " and the final amount is "+a);

	}

}
