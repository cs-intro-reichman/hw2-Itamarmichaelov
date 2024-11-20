// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int reapet = Integer.parseInt(args[0]);
		double sum = 0.0 ;
		for(int i=0 ; i < reapet;i++){
			double term = 1.0/((2*i)+1);
			if ( i % 2 == 0 ) 
			{
			sum += term;
			// System.out.println(sum); TO CHECK 
			}
			else
			{
			sum -= term;
			// System.out.println(sum); TO CHECH 
			}
		}
		sum = (sum*4);
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     " + sum);

	}
}
