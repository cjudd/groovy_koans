import koans.*;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;

public class AllKoans {

	public static Test suite() {
		TestSuite suite = new TestSuite("Groovy Koans");
		suite.addTestSuite(TruthKoans.class);
		suite.addTestSuite(StringKoans.class);		
		suite.addTestSuite(DateKoans.class);
		suite.addTestSuite(RangesKoans.class);
		suite.addTestSuite(CollectionsKoans.class);
		suite.addTestSuite(OperatorOverloadingKoans.class);
		return suite;
	}

	public static void main(String[] args) {
	  println "\nMuch you will learn from the Groovy Koans.\n"
	  JUnitCore runner = new JUnitCore();
	  runner.run(suite());
	  println "\nDo or do not... there is no try. - Master Yoda";
    }

}
