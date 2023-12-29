/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int i;
		int a = -1;
		 do{ 
                      i = (int) (Math.random() * 10);
		
		    if (i>=a){
                       System.out.print(i + " ");
                          a = i;
		}  else {
			   break;
			}
			  
		 } while (i < 10); 
	}
}
