package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class ExpressionTest {
	@Test
	public void testExpression0() throws Exception {
		Operator operator = new And(new Or(new Eq("userID", 1), new Eq("userID", 2)), new NEq("age", 15));

		assertThat(operator.evaluate(), is("(((userID == '1') OR (userID == '2')) AND (age != '15'))"));
	}

	@Test
	public void testExpression1() throws Exception {
		Operator operator = new And(new Or(new Eq("userID", 1), new Eq("userID", 2)), new In("age", 16, 17, 18, 19));

		assertThat(operator.evaluate(), is("(((userID == '1') OR (userID == '2')) AND (age IN ('16','17','18','19')))"));
	}
}
