package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public class SqLiteQuery implements Query {
	private Operator where;
	private String orderBy;
	private boolean isAscending;

	public SqLiteQuery(Operator where, String orderBy, boolean isAscending) {
		this.where = where;
		this.orderBy = orderBy;
		this.isAscending = isAscending;
	}

	@Override
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
