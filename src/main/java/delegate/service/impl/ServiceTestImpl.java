package delegate.service.impl;

import delegate.service.IServiceTest;

public class ServiceTestImpl implements IServiceTest{
	public void say(String hi) {
		System.out.println("say something: " + hi);
	}
}
