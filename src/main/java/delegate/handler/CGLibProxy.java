package delegate.handler;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxy {
	public static Object getProxyObject(Object target) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new MethodInterceptor() {

			public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy proxy) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("you say before: ");
				// proxy.invoke(arg0, arg2);
				proxy.invokeSuper(arg0, arg2);
				System.out.println("you say end: ");
				return null;
			}
		});
		return enhancer.create();
	}
}
