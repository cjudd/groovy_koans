package koans;

/*
* Groovy Truth
*
* For more information, See:
* - http://groovy.codehaus.org/Groovy+Truth
*
*/
class TruthKoans extends Koans {

	void testTruth() {
		assert ___
	}
	
	void testFalse() {
		assert !__
	}
	
	void testNumberZeroIsFalse() {
		def zero = 0
		assert !__
	}
	
	void testNonZeroNumberIsTrue() {
		def nonZero = 3
		assert ___
	}
	
	void testEmptyStringIsFalse() {
		def str = ""
		assert !__
	}
	
	void testNonEmptyStringIsTrue() {
		def str = "Groovy Is Cool!"
		assert ___
	}
	
	void testEmptyCollectionIsFalse() {
		def col = []
		assert !__
	}
	
	void testCollectionWithItemsIsTrue() {
		def col = [1,2,3]
		assert ___
	}
	
	void testIteratorOnEmptyCollectionIsFalse() {
		def iter = [].iterator()
		assert !__
	}
	
	void testIteratorOnNonEmptyCollectionIsTrue() {
		def iter = [1,2,3].iterator()
		assert ___
	}
	
	void testObjectReferencesIsTrue() {
		def object = new Object()
		assert ___
	}

}
