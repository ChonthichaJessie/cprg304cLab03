package implementations;

import java.util.ArrayList;

import exceptions.DuplicateKeyException;
import exceptions.KeyNotFoundException;
import utilities.DictionaryADT;

@SuppressWarnings("unused")
public class Dictionary<K, V> implements DictionaryADT<K, V> {
	// constant
	private static final int DEFAULT_SIZE = 10;

	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	// Create a class constructor
	public Dictionary() {
		this.keys = new ArrayList<>();
		this.values = new ArrayList<>();
	}

	@Override
	public void insert(K key, V value) throws DuplicateKeyException {
		if (this.keys.contains(key)) {
			throw new DuplicateKeyException("The key duplicates with current key");
		}
		this.keys.add(key);
		this.values.add(value);
	}

	@Override
	public void update(K key, V value) throws KeyNotFoundException {
		int index = this.keys.indexOf(key);
		if (this.keys.contains(key)) {
			this.values.set(index, value);
		}
		throw new KeyNotFoundException("Key must exist");

	}

	@Override
	public void remove(K key) throws KeyNotFoundException {
		int index = this.keys.indexOf(key);
		if (this.keys.contains(key)) {
			this.keys.remove(index);
			this.values.remove(index);
		}
		throw new KeyNotFoundException("Key must exist");

	}

	@Override
	public V get(K key) throws KeyNotFoundException {
		int index = this.keys.indexOf(key);
		if (this.keys.contains(key)) {
			return this.values.get(index);
		}
		throw new KeyNotFoundException("Key must exist");

	}

}
