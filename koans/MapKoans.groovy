package koans

import java.util.LinkedHashMap;

/**
* Groovy Collections
*
* Instructions: Replace __ with your answer.
*
* For more information, see:
* - http://groovy.codehaus.org/JN1035-Maps
* - http://groovy.codehaus.org/groovy-jdk/java/util/Map.html
*/
class MapKoans extends Koans {
	
	void testCreateMap() {
		def map = [:]
		assert __ == map.size()
	}

	void testMapInterface() {
//		assert [:] instanceof Map
	}
	
	void testMapType() {
//		assert LinkedHashMap.class == [:].getClass()
	}
	
	void testInitializingMaps() {
		def key = new Object()
		def map = ["1":1, 2:"2", three:new Object(), key:[1, 2, 3]]
		
		assert __ == map.size(), "Maps hold multiple types"
	}
	
	void testMapTruth() {
		def map = [:]
		assertTruth __ ,map
		
		map = ['a':'b']
		assertTruth __, map
		assertTruth __, map.get('a')
		assertTruth __, map.get('c')

		assert __ == map.get('a')
		assert __ == map.get('c')
		
		map = ['a':null]
		assertTruth __, map.get('a') 
		
	}
	
	void testMapsHaveUniqueKeys() {
		def map = [1:"2", 2:"3", 1:"4"]
		assert __ == map.size()
		assert __ == map.get(1)
	}
	
	void testMapsMayHaveNonUniqueValues() {
		def map = [1:"2", 2:"2"]
		assert __ == map.get(1)
		assert __ == map.get(2)
	}
	
	void testMapsAreUnordered() {
		assertTruth __, [1:"2", 2:"3"] == [2:"3", 1:"2"]
	}

	void testAccessingMaps() {
		def map = ['a':1, 'b':2, c:3, 'd':4];
		
		assert __ == map.get('a'), 'get method'
		assert __ == map.get('a', "default return value")
		assert __ == map.get("e", "default return value")
		assert __ == map.getAt('a'), 'alternate method'
		assert __ == map['b'], 'subscript syntax'
		assert __ == map.c, 'property syntax'
		assert __ == map."d", 'key as a string'
	}
	
	void testAppendingToMaps() {
		def map = [a:1];
		
		map.put("b", 2)
		assert __ == map
		
		map.putAll([c:3,d:4])
		assert __ == map
		
		map.e = 5
		assert __ == map
		
		map."f" = 6
		assert __ == map
		
		map << [g:7]
		assert __ == map
		
		map['h'] = 8
		assert __ == map
		
		map += [i:9]
		assert __ == map
		
		assert __ == map.size()
		
		assert __ == map + [j:10]
		assert __ == map.size()
	}
	
	void testRemovingFromMaps() {
		def map = [1:"a", "2":"b", 3:"c"]
		map.remove(1)
		
		assert __ == map.containsKey(1)
		assert __ == map.size()
		assert __ == map.get(1)
		
		map."2" = null
		assert __ == map.get("2")
		assert __ == map.containsKey("2")
		
		map.clear()
		assert __ == map.size()
		assert __ == map.containsKey(3)
	}
}