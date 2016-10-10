package com.armansimonyan.jelly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author armansimonyan
 */

public class SqLiteQueryTest {
	@Test
	public void testEvaluate() throws Exception {
		Query query = new SqLiteQuery(
				Where.or(
						Where.and(
								Where.gt("age", 13),
								Where.lt("age", 19)
						),
						Where.in("age", 21, 23, 25)
				),
				"age",
				true
		);

		assertThat(query.evaluate(), is("WHERE (((age > '13') AND (age < '19')) OR (age IN ('21','23','25'))) ORDER BY age ASC"));
	}
}
