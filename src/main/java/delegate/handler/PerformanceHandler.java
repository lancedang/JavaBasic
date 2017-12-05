package delegate.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

	private Object target;

	public PerformanceHandler(Object target) { // target为目标的业务类,即实际 被代理 的那个业务对象
		// TODO Auto-generated constructor stub
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		//1. AOP横切代码---对应Spring xml中 aop标签指定的横切代码，AOP指定了
		//1)哪些方法需要使用日志等横切逻辑
		//2)在这些方法的前、后哪个位置 执行横切代码
		//3)横切代码 是一个普通POJO，AOP可以指定，横切代码不是硬编码在Handler中，
		System.out.println("类 " + target.getClass().getName() + " 的 " + method.getName() + " 方法 begin.");
		//2. 通过反射调用 目标业务类的 业务方法，即实际的业务方法
		Object object = method.invoke(target, args);
		// AOP横切代码
		System.out.println("类 " + target.getClass().getName() + " 的 " + method + " 方法  end.");
		return object;
	}

}
