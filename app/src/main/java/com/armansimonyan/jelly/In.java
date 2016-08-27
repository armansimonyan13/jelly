package com.armansimonyan.jelly;

/**
 * @author armansimonyan
 */

public class In implements Operator {
	private Object arg0;
	private Object[] args;

	public In(String arg0, Object... args) {
		this.arg0 = arg0;
		this.args = args;
	}

	@Override
	public String evaluate() {
		StringBuilder sb = new StringBuilder();
		sb.append("(").append(arg0).append(" IN (");
		if (args.length > 0) {
			sb.append("'").append(args[0]).append("'");
		}
		for (int i = 1; i < args.length; i++) {
			sb.append(",").append("'").append(args[i]).append("'");
		}
		sb.append("))");
		return sb.toString();
	}
}
