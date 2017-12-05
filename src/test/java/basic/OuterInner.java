package basic;

public class OuterInner {
	public void outer() {
		// 实例化内部类
		Inner xInner = new Inner();
		Inner2 inner2 = new Inner2();
	}
	public static void main(String[] args) {
		
		OuterInner outer = new OuterInner();
		// 实例化内部类
		outer.new Inner();
		new OuterInner().new Inner();
		Inner2 xInner2 = new Inner2();
	}
	// 内部类
	public class Inner {
		
	}
	
	public static class Inner2 {
		
	}
	
}
