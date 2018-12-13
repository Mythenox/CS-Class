import javax.swing.JOptionPane;

public class Driver {
	
	public static void main (String[] args) {
		String str;
		int left, right, another;
		
		do {
			str = JOptionPane.showInputDialog("Enter a potential palindrome:");
			
			left = 0;
			right = str.length() - 1;
			
			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}
			
			System.out.println();
			
			if (left < right)
				JOptionPane.showMessageDialog (null, "That string is NOT a palindrome.");
			else
				JOptionPane.showMessageDialog (null, "That string IS a palindrome.");
			
			another = JOptionPane.showConfirmDialog (null, "Do another?");
		}
		while (another == JOptionPane.YES_OPTION);
	}
}
