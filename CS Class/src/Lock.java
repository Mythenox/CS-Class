
public abstract class Lock implements Lockable {
	// False = unlocked, true = locked
	
	private int combination;
	private boolean state;
	
	public void setKey (int oldKey, int newKey) {
		assertUnlocked();
		if (oldKey == combination)
			combination = newKey;
		else
			throw new ObjectLockedException ("Incorret combination.");
	}

	public void lock (int key) {
		assertUnlocked();
		if (key == combination)
			state = true;
		else
			throw new ObjectLockedException ("Incorret combination.");
	}

	public void unlock (int key) {
		assertUnlocked();
		if (key == combination)
			state = false;
		else
			throw new ObjectLockedException ("Incorret combination.");
	}

	public boolean locked () {
		return state;
	}
	
	 protected void assertUnlocked() {
	      if (state)
	         throw new ObjectLockedException("Can't call method. Object is locked. Call unlock(int key) prior to method call.");   
	   }
}