package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public class Gt extends AbstractOperator {
	public Gt(Object arg0, Object arg1) {
		super(arg0, arg1);
	}

	@Override
	protected String getOperatorString() {
		return ">";
	}
}
