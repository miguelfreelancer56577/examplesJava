import java.io.Console;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class App {
	

	public static void main(String[] args) {

		
		
	}
	
	public void takeList(List<? extends String> list) {
		
		list.add("foo");
		Object o = list;
		String s = list.get(0);
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		
	}

}
