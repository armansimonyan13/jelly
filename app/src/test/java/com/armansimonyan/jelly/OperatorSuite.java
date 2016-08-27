package com.armansimonyan.jelly;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author armansimonyan
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
		AndTest.class,
		EqTest.class,
		GtETest.class,
		GtTest.class,
		InTest.class,
		LtETest.class,
		LtTest.class,
		NEqTest.class,
		OrTest.class
})
public class OperatorSuite {
}
