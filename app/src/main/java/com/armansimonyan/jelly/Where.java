package com.armansimonyan.jelly;

import java.util.List;

/**
 * @author armansimonyan
 */

public class Where {
	public static Operator and(Object arg0, Object arg1) {
		return new And(arg0, arg1);
	}

	public static Operator eq(Object arg0, Object arg1) {
		return new Eq(arg0, arg1);
	}

	public static Operator gt(Object arg0, Object arg1) {
		return new Gt(arg0, arg1);
	}

	public static Operator gte(Object arg0, Object arg1) {
		return new GtE(arg0, arg1);
	}

	public static Operator in(String column, Object... value) {
		return new In(column, value);
	}

	public static Operator lt(Object arg0, Object arg1) {
		return new Lt(arg0, arg1);
	}

	public static Operator lte(Object arg0, Object arg1) {
		return new LtE(arg0, arg1);
	}

	public static Operator neq(Object arg0, Object arg1) {
		return new NEq(arg0, arg1);
	}

	public static Operator or(Object arg0, Object arg1) {
		return new Or(arg0, arg1);
	}
}
