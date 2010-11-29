package koans

import static java.util.Calendar.*

/*
* Groovy Dates
*
* Instructions: Replace __ with your answer.
*
* For more information, See:
* - http://groovy.codehaus.org/JN0545-Dates
* - http://groovy.codehaus.org/groovy-jdk/java/util/Date.html
* - http://download.oracle.com/javase/6/docs/api/java/util/Date.html 
* - http://groovy.codehaus.org/groovy-jdk/java/util/Calendar.html
* - http://download.oracle.com/javase/6/docs/api/java/util/Calendar.html
*
*/
class DateKoans extends Koans {
	// Creating Dates
	void testParseStringToDate() {
		def date = new Date().parse('yyyy/MM/dd', '2001/09/11')
		assert __ == date.class.name
		assert __ == date.year
		assert __ == date.month
		assert __ == date.date
		assert __ == date.hours
		assert __ == date.minutes
	}
	
	void testCreateDateViaConstructor() {
		// Java Constructor
		def date = new Date(101,8,11)
		assert __ == date.class.name
		assert __ == date.year
		assert __ == date.month
		assert __ == date.date
		assert __ == date.hours
		assert __ == date.minutes
		
		// Groovy Named Parameters
		def date2 = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		assert __ == date2.class.name
		assert __ == date2.year
		assert __ == date2.month
		assert __ == date2.date
		assert __ == date2.hours
		assert __ == date2.minutes
	}
	
	void testCreateDateFromCalendar() {
		def cal = Calendar.instance
		cal.set(year: 2001, month: SEPTEMBER, date: 11, hourOfDay: 0, minute: 0, second: 0)
		assert __ == cal.class.name
		assert __ == cal.time.class.name
		def date = cal.time
		assert __ == date.year
		assert __ == date.month
		assert __ == date.date
		assert __ == date.hours
		assert __ == date.minutes
	}
	
	void testDateSetter() {
		def date = new Date()
		date.set(hourOfDay: 0, minute: 0, second: 0, year: 2001, month: SEPTEMBER, date: 11)
		assert __ == date.class.name
		assert __ == date.year
		assert __ == date.month
		assert __ == date.date
		assert __ == date.hours
		assert __ == date.minutes
		
		def date2 = new Date()
		date2.year = 101
		date2.month = SEPTEMBER
		date2.date = 11
		date2.hours = 0
		date2.minutes = 0
		date2.seconds = 0
		assert __ == date2.year
		assert __ == date2.month
		assert __ == date2.date
		assert __ == date2.hours
		assert __ == date2.minutes
	}
	
	void testClearTime() {
		def date = new Date()
		date.clearTime()
		assert __ == date.hours
		assert __ == date.minutes
		assert __ == date.seconds
	}
	
	// accessors
	void testDateFieldAccessLikeMap() {
		def date = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		assert __ == date[YEAR]
		assert __ == date[MONTH]
		assert __ == date[DATE]
		assert __ == date[HOUR]
		assert __ == date[MINUTE]
		assert __ == date[SECOND]
	}
	
	void testDateFieldAccessLikeGetter() {
		def date = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		assert __ == date.year
		assert __ == date.month
		assert __ == date.date
		assert __ == date.hours
		assert __ == date.minutes
		assert __ == date.seconds
	}
	
	void testDateStringGetters() {
		def date = new Date(year: 41, month: DECEMBER, date: 07, hours:7, minutes: 55, seconds: 0)
		assert __ == date.dateString	
		assert __ == date.timeString 
		assert __ == date.dateTimeString
	}
	
	
	// Date Math
	void testDateMath() {
		def date = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		def datePlusOne = date + 1
		def dateMinusOne = date - 1
		assert __ == datePlusOne.year
		assert __ == datePlusOne.month
		assert __ == datePlusOne.date
		assert __ == datePlusOne.hours
		assert __ == datePlusOne.minutes
		assert __ == datePlusOne.seconds
		
		assert __ == dateMinusOne.year
		assert __ == dateMinusOne.month
		assert __ == dateMinusOne.date
		assert __ == dateMinusOne.hours
		assert __ == dateMinusOne.minutes
		assert __ == dateMinusOne.seconds
		
		def dateIncrement = ++date
		assert __ == dateIncrement.year
		assert __ == dateIncrement.month
		assert __ == dateIncrement.date
		assert __ == dateIncrement.hours
		assert __ == dateIncrement.minutes
		assert __ == dateIncrement.seconds
		
		def dateDecrement = --date
		assert __ == dateDecrement.year
		assert __ == dateDecrement.month
		assert __ == dateDecrement.date
		assert __ == dateDecrement.hours
		assert __ == dateDecrement.minutes
		assert __ == dateDecrement.seconds
	}
	
	// Compare Dates
	void testCompareDates() {
		def date = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		def datePlusOne = date + 1
		def dateMinusOne = date - 1
		
		assert __.after(date)
		assert __.before(date)
		assert __.compareTo(date) > 0
		assert __.compareTo(date) < 0
		assert __.compareTo(date) == 0
	}

}
