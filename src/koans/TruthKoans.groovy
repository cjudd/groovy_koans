package koans;

/*
* Groovy Truth
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
		assertEquals __, true
	}
	
	void testFalseForTruth() {
		assertEquals __, false
	}
	
	// Objects
	
	void testNullForTruth() {
		assertEquals __, null
	}

	void testObjectReferencesForTruth() {
		assertEquals __, new Object()
	}
	
	// Numbers
	
	void testZeroForTruth() {
		assertEquals __, ZERO
	}
	
	void testNonZeroForTruth() {
		assertEquals __, NON_ZERO
	}
	
	void testNegativeNumberForTruth() {
		assertEquals __, NEGATIVE_NUMBER
	}
	
	// Strings
	
	void testEmptyStringForTruth() {
		assertEquals __, EMPTY_STRING
	}
	
	void testNonEmptyForTruth() {
		assertEquals __, "Groovy is cool!!!"
	}
	
	// Collections
	
	void testEmptyCollectionForTruth() {
		assertEquals __, []
	}
	
	void testCollectionWithItemsForTruth() {
		assertEquals __, [1,2,3] 
	}
	
	void testIteratorOnEmptyCollectionForTruth() {
		assertEquals __, [].iterator()
	}
	
	void testIteratorOnNonEmptyForTruth() {
		assertEquals __, [1,2,3].iterator()
	}
	
	// Maps
	
	void testEmptyMapForTruth() {
		assertEquals __, [:]
	}
	
	void testPopulatedMapForTruth() {
		assertEquals __, ['one':1]
	}
	
	// Matchers
	
	void testUnMatchingMatcherForTruth() {
		assertEquals __, 'Hello Groovy' =~ /World/
	}
	
	void testMatchingMatcherForTruth() {
		assertEquals __, 'Hello World' =~ /World/
	}
	
}