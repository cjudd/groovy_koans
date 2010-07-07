package koans;

/**
* Groovy Truth
* 
* Instructions: Replace __ with either a true or false.
*
* For more information, See:
* - http://groovy.codehaus.org/Groovy+Truth
*
*/
class TruthKoans extends Koans {
	public static ZERO = 0
	public static NON_ZERO = 3
	public static EMPTY_STRING = ""
	public static NEGATIVE_NUMBER = -1

	// Boolean expressions
	
	void testTrueForTruth() {
		assertTruth true, true
	}
	
	void testFalseForTruth() {
		assertTruth false, false
	}
	
	// Objects
	
	void testNullForTruth() {
		assertTruth false, null
	}

	void testObjectReferencesForTruth() {
		assertTruth true, new Object()
	}
	
	// Numbers
	
	void testZeroForTruth() {
		assertTruth false, ZERO
	}
	
	void testNonZeroForTruth() {
		assertTruth true, NON_ZERO
	}
	
	void testNegativeNumberForTruth() {
		assertTruth true, NEGATIVE_NUMBER
	}
	
	// Strings
	
	void testEmptyStringForTruth() {
		assertTruth false, EMPTY_STRING
	}
	
	void testNonEmptyForTruth() {
		assertTruth true, "Groovy is cool!!!"
	}
	
	// Collections
	
	void testEmptyCollectionForTruth() {
		assertTruth false, []
	}
	
	void testCollectionWithItemsForTruth() {
		assertTruth true, [1,2,3] 
	}
	
	void testIteratorOnEmptyCollectionForTruth() {
		assertTruth false, [].iterator()
	}
	
	void testIteratorOnNonEmptyForTruth() {
		assertTruth true, [1,2,3].iterator()
	}
	
	// Maps
	
	void testEmptyMapForTruth() {
		assertTruth false, [:]
	}
	
	void testPopulatedMapForTruth() {
		assertTruth true, ['one':1]
	}
	
	// Matchers
	
	void testUnMatchingMatcherForTruth() {
		assertTruth false, 'Hello Groovy' =~ /World/
	}
	
	void testMatchingMatcherForTruth() {
		assertTruth true, 'Hello World' =~ /World/
	}
	
}