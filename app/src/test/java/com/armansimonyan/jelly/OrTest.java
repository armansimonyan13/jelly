package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class OrTest {
	@Test
	public void testEvaluate() throws Exception {
		Or or = new Or(1, 2);

		assertThat(or.evaluate(), is("(1 OR '2')"));
	}
}
