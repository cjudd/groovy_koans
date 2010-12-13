package koans;

/*
* Groovy Strings
*
* Instructions: Replace __ with your answer.
*
* For more information, See:
* - http://groovy.codehaus.org/Strings+and+GString
* - http://groovy.codehaus.org/JN1525-Strings
*
*/
class StringKoans extends Koans {
	
	
	void testDoubleQuoteStringType() {
		assertEquals __, "Any ole String".class.name
	}
	
	void testSingleQuoteStringType() {
		assertEquals __, 'A Single Quote String'.class.name
	}
	
	void testSlashyQuoteStringType() {
		assertEquals __, /A Slashy String/.class.name
	}

	void testMultiLineStringType() {
		assertEquals __, """A Triple Quote String""".class.name
	}

	void testStringInterpolation() {
		def answer = "c"
		assertEquals __, "ab${answer}"
		assertEquals __, 'ab${answer}'
		assertEquals __, /ab${answer}/
	}
	
	void testInterpolatedStringType() {
		def answer = "c"
		assertEquals __, "ab${answer}".class.name
		assertEquals __, 'ab${answer}'.class.name
		assertEquals __, /ab${answer}/.class.name
	}
	
	void testMultiLineString() {
		def myStr1 = "Stuff"
		def myStr2 = "More Stuff"
		def name = """${myStr1}
${myStr2}"""
		assertEquals __, name
		
		name = """${myStr1} \
${myStr2}"""
		assertEquals __, name
	}
	
	void testStringConcatenation() {
		def myStr1 = "ab"
		def myStr2 = "cd"
		assertEquals __, myStr1 + " " + myStr2
		assertEquals __, (myStr1 << " " << myStr2).toString() // leftShift returns a StringBuffer
		assertEquals __, myStr1.plus(" ").plus(myStr2)
	}
	
	void testStringMutable() {
		def myString = "abc"
		assertEquals __, myString
		assertEquals __, myString.reverse()
		assertEquals __, myString
	}
	
	void testStringBuilderMutable(){
		def myStrBldr = new StringBuilder("abc")
		assertEquals __, myStrBldr.toString()
		assertEquals __, myStrBldr.reverse().toString()
		assertEquals __, myStrBldr.toString()
	}
	
	
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
	
	
	void testSubScriptingStringBuilder() {
		def myStrBldr = new StringBuilder("abcd")
		assert __ == myStrBldr[1..3]
		assert __ == myStrBldr.toString()
	}
	
	void testAppendingStringBuilder() {
		def myStrBldr = new StringBuilder("ab")
		myStrBldr.append "cd"
		assert __ == myStrBldr.toString()
		myStrBldr << "ef"
		assert __ == myStrBldr.toString()
	}
}
