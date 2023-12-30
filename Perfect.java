/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
	int sum = 1;
	String isPerfect = x +  " is a perfect number since " + x + " = 1";
	int i;
	for (i = 2; i < x; i++){
      if(x%i == 0){
		sum += i;
		isPerfect += " + " + i ;
	  }
	}
      if (sum == i){
				System.out.println( isPerfect );
			 }	else {
				System.out.println(x + " is not a perfect number");
			 }	
		
	}
		
	}

