
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	        int children = 0;
		boolean boy = false;
		boolean girl = false;

		while(!boy || !girl){
			double a = Math.random();
		if (a < 0.5){
			System.out.print("g ");
			girl = true;

		} else {
			System.out.print("b ");
			boy = true;
		}
		 children++;
	  }
	  System.out.println("You made it... and you now have " + children + " children.");
	}
}
	
