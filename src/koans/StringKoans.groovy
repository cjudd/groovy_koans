package koans;

class StringKoans extends Koans {
	
	void testInterpolation() {
		def name = "Luke"
		assert __ == "Use the force ${name}"
	}
	
	void testNoInterpolation() {
		def name = "Luke"
		assert __ == 'Use the force ${name}'
	}

}