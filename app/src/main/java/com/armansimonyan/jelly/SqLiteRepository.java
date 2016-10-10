package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public abstract class SqLiteRepository implements Repository {
	@Override
	public QueryBuilder getQueryBuilder() {
		return new QueryBuilder() {
			@Override
			public Query build() {
				return new SqLiteQuery(getWhere(), getOrderBy(), getIsAscending());
			}
		};
	}
}
