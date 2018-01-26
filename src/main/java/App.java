import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
	

	public static void main(String[] args) {


		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		
		for(int i = 806; i < 813; i++)
			if(i%2 == 0) s.add(i);
		
		for(int i = 606; i < 613; i++)
			if(i%2 == 0) s.add(i);
		
		subs = (TreeSet)s.subSet(608, true, 611, true);
		s.add(609);
		System.out.println(s + " " + subs);
		
	}

}
