package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class GtETest {
	@Test
	public void testEvaluate() throws Exception {
		GtE gtE = new GtE("id", 5);

		assertThat(gtE.evaluate(), is("(id >= '5')"));
	}
}
