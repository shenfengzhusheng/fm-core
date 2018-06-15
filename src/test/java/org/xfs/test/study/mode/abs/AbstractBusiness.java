package org.xfs.test.study.mode.abs;

public abstract class AbstractBusiness {
	protected abstract String check(Object object);
	
	public void business(Object object) {
		System.out.println("check:"+check(object));
		System.out.println("业务处理！");
	}
}
