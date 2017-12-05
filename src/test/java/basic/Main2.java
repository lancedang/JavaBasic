package basic;

import java.util.*;


public class Main2 {

	static String st1 = "st1";
	static {
		System.out.println("static chunk.");
	}
	String st2 = "st2";
	//这种格式还是第一次见
	{
		System.out.println("......");
	}
	
	
	public static void main(String[] args) {
		//new Main2();
		//new Main2();
		
		
		
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		
		list.add("st1");
		list.add("st1");
		
		set.add("st1");
		set.add("st1");
		
		System.out.println(list.size());
		System.out.println(set.size());
		
	}
}
