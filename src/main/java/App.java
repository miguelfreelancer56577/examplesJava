import java.io.Console;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class App {
	
	private String s;
	public App(String s) { this.s = s; }

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<Object>();
		App ws1 = new App("aardvark");
		App ws2 = new App("aardvark");
		String s1 = new String("aardvark");
		String s2 = new String("aardvark");
		hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);
		System.out.println(hs.size());
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		App other = (App) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
}
