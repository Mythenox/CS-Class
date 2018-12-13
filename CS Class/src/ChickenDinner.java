import java.util.Scanner;

/**
 * Finds the next four prime numbers after user-given
 * input and prints them to the console. 
 * 
 * Many figurative tears were shed in the creation of
 * this program.
 * 
 * @author AaronAndrews
 * Finished on September 24th, 2018 at 8:06 PM.
 */
public class ChickenDinner {
	
	public static boolean isPrime(int arg) {
		for (int i = 2; i <= arg; i++) {
			/**If a factor is not found, continue to the next
			 * test conditions.**/
			if (arg % i != 0) {
				continue;
			}
			/**If a factor has not been found at this point,
			 * this number is prime.**/
			else if (arg == i) {
				return true;
			}
			/**Lastly, if a factor has been found before the above
			 * condition is true, the number is not prime and the
			 * loop moves on to the next number to test.**/
			else if (arg % i == 0) {
				arg++;
				i = 2;
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int count = 0;
		
		//Creates new Scanner object that allows for input to be taken through System.in.
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		//The next int recorded through the console is assigned to the variable x.
		int x = reader.nextInt();
		reader.close();
		
		//Prints the first 4 prime numbers to the console.
		while (count < 4) {
			x++;
			if (isPrime(x) == true) {
				System.out.println("Next prime number: " + x);
				count++;
			}
		}
	}
}
