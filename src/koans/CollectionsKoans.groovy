package koans;

/**
 * Groovy Collections
 * 
 * Instructions: Replace __ with either a true or false.
 *
 * For more information, see:
 * - http://groovy.codehaus.org/JN1015-Collections
 * - http://groovy.codehaus.org/Collections
 * - http://groovy.codehaus.org/groovy-jdk/java/util/Collection.html
 * - http://groovy.codehaus.org/groovy-jdk/java/util/List.html
 * - http://groovy.codehaus.org/groovy-jdk/java/util/Set.html
 */
class CollectionsKoans extends Koans {
	
	void testCreateCollection() {
		def list = []
		assert __ == list.size
	}

	void testCollectionInterface() {
		// [] instanceof __
	}
	
	void testCollectionType() {
		assert __ == [].class
	}
	
	void testCreatingCollection() {
		def list = ['a', 1, 'a', 'a', 2.5, 2.5f, 2.5d, 'hello', 7g, null, 9 as byte, ];
		assert __ == list.size, "collections hold multiple types"
	}

	void testAccessingCollections() {
		def list = ['a', 'b', 'c', 'd', 'e'];
		
		assert __ == list.get(2), 'get method'
		assert __ == list[3], 'index access'
		assert __ == list.first(), 'first method'
		assert __ == list.last(), 'last method'
		assert __ == list.head(), 'head method'
		assert __ == list.tail(), 'tail method'
	}
	
	void testPopulatingCollections() {
		def list = ['a'];
		
		list.add('b')
		list.push('c')
		list << 'd'
		assert [__] == list
	}
	
	void testUpdatingCollections() {
		def list = ['a','b','c'];
		
		list[0] = 'e'
		assert ['e','b','c'] == list, 'subscript index update'
		
		assert 'c' == list.set(2, 'f'), 'element replacement'
        assert [__] == list		
	}
		
	void testChaninedAppending() {
		def list = ['a']
		
		list << 'g' << 'h'
		assert [__] == list
	}
	
	void testAppendingLists() {
	    def list = ['a']
		
		list << ['i','j']
		assert [__] == list
	}
	
	void testBeyondBounds() {
	    int beyondBounds = 5
		def list = ['a', 'b','c'];
		
		assert __ == list[beyondBounds]
		
		list[beyondBounds] = 'j'
		assert [__] == list		
	}

	void testNegativeIndices() {
		def list = ['a', 'b', 'c', 'd', 'e'];
		
		assert __ == list[-1], "-1 indices"
		assert __ == list[-2], "-2 indices"
	}
	
    void testSlicingCollection() {
		def list = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];
		
		assert [__] == list[1..3], "range slicing"
		assert [__] == list[0,2,4], "index slicing"	
		assert [__] == list[0,2,4,5..8], "combination of index and range slicing"
	}
	
}