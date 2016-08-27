package com.armansimonyan.jelly;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class EqTest {
	@Test
	public void testEvaluate() throws Exception {
		Eq eq = new Eq(1, 2);

		assertThat(eq.evaluate(), is("(1 == '2')"));
	}
}
