package utilities;

import exceptions.DuplicateKeyException;
import exceptions.KeyNotFoundException;

/**
* DictionaryADT.java
*
* @author your name
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
	/**
	 * Mutator method to insert the key and value
	 * 
	 * Precondition: None
	 * 
	 * Postcondition: The key and value are added
	 * 
	 * @param key
	 * @param value
	 * @throws DuplicateKeyException will be thrown if the key value are duplicate
	 */
	public void insert(K key, V value ) throws DuplicateKeyException;
	
	/**
	 * Mutator method to update the key and value
	 * 
	 * Precondition: A valid key object must be existed
	 * 
	 * Postcondition: The key and value are updated 
	 * 
	 * @param key
	 * @param value
	 * @throws KeyNotFoundException will be thrown if the key does not exist
	 */
	public void update(K key, V value ) throws KeyNotFoundException;
	
	/**
	 * Mutator method to delete the key
	 * 
	 * Precondition: A valid key object must be existed
	 * 
	 * Postcondition: The key object has been deleted
	 * 
	 * @param KeyNotFoundException will be thrown if the key does not exist
	 */
	public void remove(K key) throws KeyNotFoundException;
	
	/**
	 * Mutator method to get the key
	 * 
	 * Precondition: A valid key object must be existed
	 * 
	 * Postcondition: A V value representing the key value.
	 * 
	 * @param key
	 * @return V represent of value
	 * @throws KeyNotFoundException will be thrown if the key does not exist
	 */
	public V get(K key) throws KeyNotFoundException;
	
	
}
