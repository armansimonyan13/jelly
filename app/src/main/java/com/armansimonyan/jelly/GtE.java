package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public class GtE extends AbstractOperator {
	public GtE(Object arg0, Object arg1) {
		super(arg0, arg1);
	}

	@Override
	protected String getOperatorString() {
		return ">=";
	}
}
