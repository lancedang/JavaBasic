package delegate.test;

import java.lang.reflect.Proxy;

import delegate.handler.PerformanceHandler;
import delegate.service.IForumService;
import delegate.service.IUserService;
import delegate.service.impl.ForumServiceImpl;
import delegate.service.impl.UserServiceImpl;

public class DyDelegateDemo {
	public static void main(String[] args) {
		// 目标业务类,即被代理的对象
		IForumService target = new ForumServiceImpl();
		IUserService target2 = new UserServiceImpl();

		// 将目标业务类和 横切代码编织在一起
		PerformanceHandler handler = new PerformanceHandler(target);
		PerformanceHandler handler2 = new PerformanceHandler(target2);

		// 通过Proxy.newProxyInstance()生成动态代理对象
		// 且通过静态代理可知，代理类和被代理类具有共同的接口
		IForumService proxy = (IForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), handler);

		IUserService proxy2 = (IUserService) Proxy.newProxyInstance(target2.getClass().getClassLoader(),
				target2.getClass().getInterfaces(), handler2);

		proxy.removeForum(10);
		proxy.removeTopic(1012);

		proxy2.sayHi("hi");
		proxy2.sayBye("bye");
	}

}
