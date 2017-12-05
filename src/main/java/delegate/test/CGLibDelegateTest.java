package delegate.test;

import delegate.handler.CGLibProxy;
import delegate.service.IServiceTest;
import delegate.service.impl.ServiceTestImpl;

public class CGLibDelegateTest {
	public static void main(String[] args) {
		IServiceTest target = new ServiceTestImpl();
		IServiceTest proxy = (IServiceTest) CGLibProxy.getProxyObject(target);
		System.out.println(target.getClass().getName());
		System.out.println(proxy.getClass().getName());
		proxy.say("ing");
	}
}
