package koans;

import junit.framework.TestResult 

class Koans extends GroovyTestCase {
	def __ = "FILL ME IN"
	def ___
	
	void run(final TestResult result) {
		super.run(result)
		
		if (!(result.errorCount() || result.failureCount()) ) { 
			println "${name.replace('test','')} has taught you much, padawan." 
		} else { 
			println "\nMuch you have to learn.\n"
			println "Study well the following from ${getClass().getName()}.${name}:\n" 
			
			result.errors().each {
				println it.exceptionMessage()
			}
			result.failures().each {
				println it.exceptionMessage()
			}
			result.stop();
		}
		
	}
	
	public static void assertTruth(Object expected, Object actual) {
		if(actual == null) {
			assertEquals(expected, false);
		} else {
			assertEquals(expected, actual.asBoolean());
		}
	}

}
