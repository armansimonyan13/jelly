package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class LtTest {
	@Test
	public void testEvaluate() throws Exception {
		Lt lt = new Lt("id", 5);

		assertThat(lt.evaluate(), is("(id < '5')"));
	}
}
