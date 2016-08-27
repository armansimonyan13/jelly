package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public abstract class AbstractOperator implements Operator {
	private Object arg0;
	private Object arg1;

	public AbstractOperator(Object arg0, Object arg1) {
		this.arg0 = arg0;
		this.arg1 = arg1;
	}

	@Override
	public String evaluate() {
		return "(" + getColumn(arg0) + " " + getOperatorString() + " " + getValue(arg1) + ")";
	}

	protected abstract String getOperatorString();

	private static String getColumn(Object o) {
		return o instanceof Operator ? ((Operator) o).evaluate() : o.toString();
	}

	private static String getValue(Object o) {
		return o instanceof Operator ? ((Operator) o).evaluate() : "'" + escape(o.toString()) + "'";
	}

	private static String escape(String s) {
		return s.replace("'", "''");
	}
}
