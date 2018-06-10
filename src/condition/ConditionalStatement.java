/*
 * Find the largest number 
 */

package condition;

public class ConditionalStatement {

	public static void main(String[] args) {
		String name = "Ismail";
		int a=60, b=50, c=60;
		
		if(a>b&&a>c){
			System.out.println("a is the larger number");
		}
		
		else if(b>a && b >c){
			System.out.println("b is largest number");
		}
		else if(c==b)
			System.out.println("c and b is largest number");
		else if (c==a)
			System.out.println("c and a is largest number");
		else 
			System.out.println("c is the largest number");
		
		
	}

}
