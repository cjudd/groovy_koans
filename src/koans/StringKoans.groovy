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
	public static FIRSTNAME = "Luke"
	public static LASTNAME = 'Skywalker'
	public static JEDIMASTER = /Yoda/
	public static OBIWAN = """Obi-Wan
Kenobi"""
	
	
	void testDoubleQuoteStringType() {
		assertEquals __, FIRSTNAME.class.name
	}
	
	void testSingleQuoteStringType() {
		assertEquals __, LASTNAME.class.name
	}
	
	void testSlashyQuoteStringType() {
		assertEquals __, JEDIMASTER.class.name
	}

	void testMultiLineStringType() {
		assertEquals __, OBIWAN.class.name
	}

	void testStringInterpolation() {
		assertEquals __, "Use the force ${FIRSTNAME}"
		assertEquals __, 'Use the force ${FIRSTNAME}'
	    assertEquals __, /Use the force ${FIRSTNAME}/
	}
	
	void testInterpolatedStringType() {
		assertEquals __, "Use the force ${FIRSTNAME}".class.name
		assertEquals __, 'Use the force ${FIRSTNAME}'.class.name
	    assertEquals __, /Use the force ${FIRSTNAME}/.class.name
	}
	
	void testMultiLineString() {
		def name = """${FIRSTNAME}
${LASTNAME}"""
		assertEquals __, name
		
		name = """${FIRSTNAME} \
${LASTNAME}"""
		assertEquals __, name
	}
	
	void testStringConcatenation() {
		assertEquals __, FIRSTNAME + " " + LASTNAME
		assertEquals __, FIRSTNAME << " " << LASTNAME
		assertEquals __, FIRSTNAME.plus(" ").plus(LASTNAME)
	}
	
	void testStringMutable() {
		assertEquals __, FIRSTNAME
		assertEquals __, FIRSTNAME.reverse()
		assertEquals __, FIRSTNAME
	}
	
	void testStringBuilderMutable(){
		def nameSB = new StringBuilder(FIRSTNAME)
		assertEquals __, nameSB.toString()
		assertEquals __, nameSB.reverse().toString()
		assertEquals __, nameSB.toString()
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