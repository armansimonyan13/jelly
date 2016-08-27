package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class AndTest {
	@Test
	public void testEvaluate() throws Exception {
		And and = new And(1, 2);

		assertThat(and.evaluate(), is("(1 AND '2')"));
	}
}
