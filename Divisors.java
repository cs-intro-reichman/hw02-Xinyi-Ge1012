/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
	int x = Integer.parseInt(args[0]);
                 int i = 1;
     
            while ((x >= i) && (x % i = 0)){
              System.out.println(i);
                 i++;
     }

	}
}
