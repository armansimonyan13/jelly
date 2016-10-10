package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public abstract class QueryBuilder {
	private Operator where;
	private String orderBy;
	private boolean isAscending;

	public abstract Query build();

	protected Operator getWhere() {
		return where;
	}

	public QueryBuilder setWhere(Operator where) {
		this.where = where;
		return this;
	}

	protected String getOrderBy() {
		return orderBy;
	}

	public QueryBuilder setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	protected boolean getIsAscending() {
		return isAscending;
	}

	public QueryBuilder setIsAscending(boolean isAscending) {
		this.isAscending = isAscending;
		return this;
	}
}
