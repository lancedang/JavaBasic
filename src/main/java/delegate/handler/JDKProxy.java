package delegate.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
	public static Object getProxyObject(final Object target) {
		// JDK实现动态代理,但JDK必须实现接口
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub

						System.out.println("业务逻辑之前。");
						Object object = method.invoke(target, args);
						System.out.println("业务逻辑之后。");
						return object;
					}
				});

	}

}
