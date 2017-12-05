package delegate.test;

import delegate.handler.JDKProxy;
import delegate.service.IServiceTest;
import delegate.service.impl.ServiceTestImpl;

public class JDKDelegateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IServiceTest serviceTest = new ServiceTestImpl();
		System.out.println(serviceTest.getClass().getName() + " " + serviceTest.getClass().getSimpleName());
		IServiceTest proxy = (IServiceTest) JDKProxy.getProxyObject(serviceTest);
		System.out.println(proxy.getClass().getName() + " " + proxy.getClass().getSimpleName());
		proxy.say("first");
		proxy.say("second");
		proxy.say("third");
	}

}
