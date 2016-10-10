package com.armansimonyan.jelly;

import java.util.List;

/**
 * @author armansimonyan
 */

public interface Repository<Type, Key> {
	int create(Type entity);

	int create(List<Type> entityList);

	Type read(Key key);

	List<Type> read(Query query);

	int update(Type entity);

	int update(List<Type> entityList);

	int delete(Key key);

	int delete(Query query);

	QueryBuilder getQueryBuilder();
}
