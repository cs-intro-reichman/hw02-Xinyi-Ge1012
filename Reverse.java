/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String s = args[0];
		int i;
	for (i=0; i <= (s.length()-1); i++ ){
                  System.out.print(s.charAt(s.length()-1-i));
                   }
	     if(s.length() % 2 ==0){
			System.out.println("The middle character is " + s.charAt(s.length()/2-1));
		} else {
			System.out.println("The middle character is " + s.charAt((s.length()+1)/2-1)) ;
		}
	}
}
