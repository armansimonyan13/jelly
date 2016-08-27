package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public class Query {
	private Operator where;
	private String orderBy;
	private boolean isAscending;

	public Query(Operator where, String orderBy, boolean isAscending) {
		this.where = where;
		this.orderBy = orderBy;
		this.isAscending = isAscending;
	}

	public String evaluate() {
		return new StringBuilder()
				.append("WHERE ")
				.append(where.evaluate())
				.append(" ORDER BY ")
				.append(orderBy)
				.append(isAscending ? " ASC" : " DESC")
				.toString();
	}
}
