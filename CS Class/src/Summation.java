
public class Summation {

	public static void main (String[] args) {
		
		Player toast = new Player (400);
		int turns = 0;
		int damage = 1;
		
		while (toast.getHealth() > 0) {
			toast.changeHealth(damage);
			damage++;
			turns++;
		}

		System.out.println("Turns to kill: " + turns);
	}
}

class Player {
	
	private int health;
	
	public Player (int hp) {
		health = hp;
	}
	
	public int getHealth () {
		return health;
	}

	public void changeHealth (int damage) {
		health -= damage;
	}
	
}