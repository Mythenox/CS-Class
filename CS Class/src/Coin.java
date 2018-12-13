
public class Coin extends Lock implements Lockable{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	private int combination;
	private boolean state;
	
	public Coin (int pass, boolean lock) {
		combination = pass;
		state = lock;
		flip();
	}

	public void flip () {
		if (state == false)
			face = (int) (Math.random() * 2);
		else 
			System.out.println("Access denied.");
		
	}

	public boolean isHeads () {
		return (face == HEADS);
	}

	public String toString () {
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
	
}
