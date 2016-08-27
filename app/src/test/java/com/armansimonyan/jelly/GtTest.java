package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class GtTest {
	@Test
	public void testEvaluate() throws Exception {
		Gt gt = new Gt("id", 5);

		assertThat(gt.evaluate(), is("(id > '5')"));
	}
}
