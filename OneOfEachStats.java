import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
	int totalChildren = 0;
		int childrenCount = 0;
        int familiesWith2Children = 0;
        int familiesWith3Children = 0;
        int familiesWith4orMoreChildren = 0;
		
		// Initailizes a random numbers generator with the given seed value
	     for (int i = 0; i < T; i++){
		int boy = 0;
		int girl = 0;
		do{
                    double rnd = generator.nextDouble();
		     if ( rnd < 0.5 ){
                           girl++;
		  } else {
			boy++;
			}

		}
          while (boy == 0 || girl== 0);
		
            childrenCount = boy + girl;
            totalChildren += childrenCount;

		if (childrenCount == 2) {
			familiesWith2Children++;
		} else if (childrenCount == 3) {
			familiesWith3Children++;
		} else if (childrenCount >= 4) {
			familiesWith4orMoreChildren++;
		}
		

	}
        double average = (double) totalChildren / T;

		System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWith2Children);
        System.out.println("Number of families with 3 children: " + familiesWith3Children);
        System.out.println("Number of families with 4 or more children: " + familiesWith4orMoreChildren);

         int a = 0 ;
        if (familiesWith2Children > familiesWith3Children ){
            if(familiesWith2Children > familiesWith4orMoreChildren){
				a = 2;
				System.out.println("The most common number of children is " + a + ".");
			} else {
				a = 4 ;
				System.out.println("The most common number of children is " + a + " or more.");
			}
		} else {
			if(familiesWith3Children > familiesWith4orMoreChildren){
				a = 3;
				System.out.println("The most common number of children is " + a + ".");
			} else {
				a = 4 ;
				System.out.println("The most common number of children is " + a + " or more.");
			}
			}
		}
		      
}





