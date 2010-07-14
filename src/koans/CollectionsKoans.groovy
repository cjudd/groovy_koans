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

	public static int BEYOND_BOUNDS = 10
	
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
		assert __ == list.size
	}

	void testAccessingCollections() {
		def list = ['a', 'b', 'c', 'd', 'e'];
		
		assert __ == list.get(2)
		assert __ == list[0]
		assert __ == list[3]
		assert __ == list.first()
		assert __ == list.last()
		assert __ == list.head()
		assert __ == list.tail()
		assert __ == list[BEYOND_BOUNDS]
	}
	
	void testPopulatingCollections() {
		def list = ['a'];
		
		list.add('b')
		list.push('c')
		list << 'd'
		
		assert [__] == list
		
		list[0] = 'e'
		
		assert [__] == list
		
		assert __ == list.set(2, 'f')
        assert [__] == list
		
		list[BEYOND_BOUNDS] = 'g'
		
		assert [__] == list
	}

    void testSlicingCollection() {
		def list = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];
		
		assert __ == list[-1]
		assert __ == list[-2]
		assert [__] == list[1..3]
		assert [__] == list[2,5]
		assert [__] == list[0,2,4]	
		assert [__] == list[0,2,4,5..8]	
	}
	
}