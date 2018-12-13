
import java.util.*;

public class Name implements Comparable{
	private String first;
	private String last;
	
	public Name (String firstName, String lastName) {
		first = firstName;
		last = lastName;
	}
	
	private String getFirst () {
		return first;
	}
	
	private String getLast () {
		return last;
	}
	
	public String toString () {
		return first + last;
	}
	
	public int compareTo (Name b) {
		Scanner scan = new Scanner (this.getLast());
		int i = 0;
		
		if (this.getLast().equals(b.getLast()) == true && this.getFirst().equals(b.getFirst()))
			return 0;
		else if (this.getLast().charAt(i) == b.getLast().charAt(i)) {
			i++;
			while (scan.hasNext()) {
				if (this.getLast().charAt(i) < b.getLast().charAt(i)) {
					scan.close();
					return -1;
				}
				else
					continue;	
			}
		}
		else {
			scan.close();
			return 1;
		}
	}
}
	