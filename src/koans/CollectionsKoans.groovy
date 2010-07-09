package koans;

class CollectionsKoans extends Koans {

	public static int BEYOND_BOUNDS = 10
	
	void testCollectionInterface() {
		def list = []
		assert false //list instanceof __
	}
	
	void testCollectionType() {
		assert __ == [].getClass()
	}
	
	void testCreatingCollection() {
		def list = [5, 6, 7, 8, 9];
		assert __ == list.size
	}

	void testAccessingCollectionElements() {
		def list = [5, 6, 7, 8, 9];
		
		assert __ == list.get(2)
		assert __ == list[0]
		assert __ == list[3]
		assert __ == list.first()
		assert __ == list.last()
		assert __ == list.head()
		assert __ == list.tail()
		assert __ == list[BEYOND_BOUNDS]
		assert __ == list[1..3]
		assert __ == list[0,2,4]
	}
}
