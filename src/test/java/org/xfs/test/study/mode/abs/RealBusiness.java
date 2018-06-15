package org.xfs.test.study.mode.abs;

public class RealBusiness extends AbstractBusiness {
	public static void main(String[]args) {
		new RealBusiness().business("阿三");
	}

	@Override
	protected String check(Object object) {
		if(object instanceof String) {
			if(object.toString().equals("yes")) {
				return "true";
			}
		}
		return object.toString();
	}

}
