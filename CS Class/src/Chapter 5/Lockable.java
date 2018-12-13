
public interface Lockable {
	void setKey (int oldKey, int newKey);
	void lock (int key);
	void unlock (int key);
	boolean locked ();
	
}
