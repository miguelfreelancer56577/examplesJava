import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class App {

	public static void main(String[] args) {

		int x = 5;
		App p = new App();
		p.doStuff(x);
		System.out.print(" main x = " + x);
		
	}
	
	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
		}

}
