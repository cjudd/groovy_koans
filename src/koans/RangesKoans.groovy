package koans;

class RangesKoans extends Koans {
	
	void testRange() {
		def range = 1..5
	
		assert __ instanceof Range
	  }
	
	  void testRangeIsAlsoList() {
		def range = 1..5
	
		assert __ instanceof List
	  }
	
	  void testRangeSize() {
		def range = 1..5
	
		assert __ == range.size()
	  }
	
	  void testRangeAccessors() {
		def range = 1..5
	
		assert range.get(2) == __
		assert range[2] == __
	  }
	
	  void testRangeBounds() {
		def range = 1..5
	
		assert range.from == __
		assert range.to == __
	  }
	
	  void testNonInclusiveRange() {
		def range = 1..<5
	
		assert range.from == __
		assert range.to == __
	  }
	
	  void testRangesCanBeCharactersToo() {
		def range = 'a'..'z'
	
		assert range instanceof Range
		assert range.from == '__'
		assert range[5] == '__'
		assert range.to == '__'
	  }

}
