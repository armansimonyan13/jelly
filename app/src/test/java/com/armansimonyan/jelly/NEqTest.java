package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class NEqTest {
	@Test
	public void testEvaluate() throws Exception {
		NEq not = new NEq(1, 2);

		assertThat(not.evaluate(), is("(1 != '2')"));
	}
}
