package koans;

/*
* Groovy Strings
*
* For more information, See:
* - http://groovy.codehaus.org/Strings+and+GString
* - http://groovy.codehaus.org/JN1525-Strings
*
*/
class StringKoans extends Koans {
	
	void testDoubleQuoteIsAString() {
		def name = "Luke"
		assert ___ instanceof String
	}
	
	void testSingleQuoteIsAString() {
		def name = 'Luke'
		assert ___ instanceof String
	}
	
	void testInterpolation() {
		def name = "Luke"
		assert __ == "Use the force ${name}"
	}
	
	void testNoInterpolation() {
		def name = "Luke"
		assert __ == 'Use the force ${name}'
	}
	
	void testInterpolatedStringIsAGString() {
		def fName = "Luke"
		def lName = "Skywalker"
		def fullName = "${fName} ${lName}"
		assert __ instanceof org.codehaus.groovy.runtime.GStringImpl
	}
	
	void testGStringIsAString() {
		def fName = "Luke"
		def lName = "Skywalker"
		def fullName = "${fName} ${lName}"
		assert ___ instanceof String
	}
	
	void testStringConcatenation() {
		def fName = "Luke"
		def lName = "Skywalker"
		assert __ == fName + " " + lName
	}
	
	void testMultiLineString() {
		def name = """Luke
		Skywalker"""
		assert name == __
	}
	
	void testSlashyString() {
		def name = /Luke/
		assert __ == name
	}
	
	void testSlashyInterpolation() {
		def fName = "Luke"
		def fullName = /${fName} SkyWalker/
		assert __ == fullName
	}
	
	void testStringsAreImmutable() {
		def numbers = "1234"
		assert __ == numbers.reverse()
		assert __ == numbers
	}
	
	// ---------------
	
	void testSubScriptingStrings() {
		assert 'abcdefg'[ 3 ] == __
		assert 'abcdefg'.getAt( 3 ) == __ //equivalent method name
		assert 'abcdefg'.charAt( 3 ) == __ //alternative method name
		assert 'abcdefg'[ 3..5 ] == __
		assert 'abcdefg'.getAt( 3..5 ) == __
		assert 'abcdefg'[ 1, 3, 5, 6 ] == __
		assert 'abcdefg'[ 1, 3..5 ] == __
		assert 'abcdefg'[-5..-2] == __
		assert 'abcdefg'.getAt( [ 1, 3..5 ] ) == __
	}
	
	void testStringBuilderIsMutable(){
		def numbersSB = new StringBuilder("1234")
		assert __ == numbersSB.reverse().toString()
		assert __ == numbersSB.toString()
	}
	
	void testSubScriptingStringBuilder() {
		def numbersSB = new StringBuilder("1234")
		assert __ == numbersSB[1..3]
		assert __ == numbersSB.toString()
	}
	
	void testAppendingStringBuilder() {
		def numbersSB = new StringBuilder("12")
		numbersSB.append "34"
		assert __ == numbersSB.toString()
		numbers << "56"
		assert __ == numbersSB.toString()
	}
}