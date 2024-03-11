/**
 * 
 */
package testDictionary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.DuplicateKeyException;
import exceptions.KeyNotFoundException;
import implementations.Dictionary;
import utilities.DictionaryADT;

/**
 * 
 */
class TestDictionary {

	DictionaryADT<Integer, String> dict;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		dict = new Dictionary<>();
	}

	/**
	 * Test method for
	 * {@link implementations.Dictionary#insert(java.lang.Object, java.lang.Object)}.
	 * 
	 * @throws KeyNotFoundException
	 */
	@Test
	void testGoodInsert() {
		dict = new Dictionary<>();

		try {
			dict.insert(1, "AA");
			assertEquals("AA", dict.get(1));

		} catch (DuplicateKeyException e) {
			fail("Exception was thrown");
		}

		catch (KeyNotFoundException e) {
			fail("Exception was thrown");
		}

	}

	/**
	 * Test method for
	 * {@link implementations.Dictionary#insert(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	void testDupeInsert() {
		dict = new Dictionary<>();

		try {
			dict.insert(1, "AA");
			dict.insert(1, "AA");
			fail("Exception was not thrown");

		} catch (DuplicateKeyException e) {
			assertTrue(true);
		}

	}

	/**
	 * Test method for
	 * {@link implementations.Dictionary#update(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	void testGoodUpdate() {
		dict = new Dictionary<>();

		try {
			dict.insert(1, "AA");
			dict.update(1, "AB");
			assertEquals("AB", dict.get(1));

		} catch (KeyNotFoundException e) {
			
		} catch (DuplicateKeyException e) {
			fail("Exception was thrown");
		}
	}

	/**
	 * Test method for
	 * {@link implementations.Dictionary#update(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	void testKeyNotFoundUpdate() {
		dict = new Dictionary<>();

		try {
			dict.update(1, "AB");
			fail("Exception was not thrown");
			

		} catch (KeyNotFoundException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link implementations.Dictionary#remove(java.lang.Object)}.
	 */
	@Test
	void testGoodRemove() {
		dict = new Dictionary<>();

		try {
			dict.insert(1, "AA");
			dict.remove(1);
			fail("Exception was not thrown");

		} catch (KeyNotFoundException e) {
			
		} catch (DuplicateKeyException e) {
			fail("Exception was thrown");
		}
	}
	
	/**
	 * Test method for {@link implementations.Dictionary#remove(java.lang.Object)}.
	 */
	@Test
	void testKeyNotFoundRemove() {
		dict = new Dictionary<>();

		try {
			dict.remove(1);
			fail("Exception was not thrown");
			

		} catch (KeyNotFoundException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for {@link implementations.Dictionary#get(java.lang.Object)}.
	 */
	@Test
	void testGoodGet() {
		dict = new Dictionary<>();

		try {
			dict.insert(1, "AA");
			assertEquals("AA", dict.get(1));

		} catch (KeyNotFoundException e) {
			assertTrue(true);
		} catch (DuplicateKeyException e) {
			fail("Exception was thrown");
		}
	}
	
	/**
	 * Test method for {@link implementations.Dictionary#get(java.lang.Object)}.
	 */
	@Test
	void testKeyNotFoundGet() {
		dict = new Dictionary<>();

		try {
			dict.get(1);
			fail("Exception was not thrown");
			

		} catch (KeyNotFoundException e) {
			assertTrue(true);
		}
	}

}
