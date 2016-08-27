package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class LtETest {
	@Test
	public void testEvaluate() throws Exception {
		LtE ltE = new LtE("id", 5);

		assertThat(ltE.evaluate(), is("(id <= '5')"));
	}
}
