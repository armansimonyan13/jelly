package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class InTest {
	@Test
	public void testEvaluate() throws Exception {
		In in = new In("age", 1, 2, 3, 4, 5);

		assertThat(in.evaluate(), is("(age IN ('1','2','3','4','5'))"));
	}
}
