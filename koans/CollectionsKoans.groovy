package koans;
/**
 * Groovy Collections
 * 
 * Instructions: Replace __ with your answer.
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
		//assert [] instanceof List
	}
	
	void testCollectionType() {
		assert __ == [].class
	}
	
	void testInitializingCollection() {
		def list = ['a', 1, 'a', 'a', 2.5, 2.5f, 2.5d, 'hello', 7g, null, 9 as byte, ];
		assert __ == list.size, "collections hold multiple types, duplicates and can contain an extra comma"
	}
	
	void testCollectionTruth() {
		assertTruth __ ,[]
		assertTruth __, ['a']
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
	
	void testAppendingCollections() {
		def list = ['a'];
		
		list.add('b')
		list.addAll(['c','d'])
		list.push('e')
		list << 'f'
		assert [__] == list, "add, push and << operator"
		
		assert [__] == list + 'g', "+ operator"
		
		list += 'h'
		assert [__] == list, "+= operator"
	}

	void testInsertIntoCollections() {
		def list = ['a','b','c'];
		
		list.add(1,'d')
		assert [__] == list, "add with index"
		
		list.addAll(2, ['e','f'])
		assert [__] == list, "add all with index"
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

	void testFlatteningLists() {
		def list = [['a',['b','b']], ['c','d'], 'e'];
		
		assert [__] == list.flatten()
	}

	
	void testBeyondBounds() {
		int beyondBounds = 5
		def list = ['a', 'b','c'];
		
		assert __ == list[beyondBounds], "accessing element beyond current size"
		
		list[beyondBounds] = 'j'
		assert [__] == list, "setting element beyond current size"
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
	
	void testEachClosure() {
		def items = ""
		
		['a', 'b', 'c'].each{ items += "Item: $it \n" }

		assert __ == items
	}
	
	void testEachIndexClosure() {
		def items = ""
	
		['a', 'b', 'c'].eachWithIndex{ it, i -> items += "$i: $it\n" }
		
		assert __ == items
	}
	
}
