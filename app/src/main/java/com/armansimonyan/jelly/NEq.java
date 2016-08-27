package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public class NEq extends AbstractOperator {
	public NEq(Object arg0, Object arg1) {
		super(arg0, arg1);
	}

	@Override
	protected String getOperatorString() {
		return "!=";
	}
}
