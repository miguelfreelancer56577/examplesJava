package practice;

import java.util.Iterator;

public class Test {
	
	final static int BUFFER = 2048;

	public static void main(String[] args) {
		
//		int num = 1;
//		
//		for (num = 0; num < 3; num++ ) {
//			num *= 2;
//		}
//		
//		System.out.println("num = " + (num++));
		
//		print all values
		Operations.insert.setSql("new insert");
		
		for (Operations o: Operations.values()) {
			System.out.println(o.getSql());
		}
		
		
		
	}

}
