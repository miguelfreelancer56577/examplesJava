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


		TreeSet<String> s = new TreeSet<>();
		TreeSet<String> subs = new TreeSet<>();
		
		for(int i = 806; i < 813; i++)
			if(i%2 == 0) s.add("a"+i);
		
		for(int i = 606; i < 613; i++)
			if(i%2 == 0) s.add("a"+i);
		
		subs = (TreeSet)s.subSet("a1", true, "a4", true);
		
		s.add("a"+1);
		
		System.out.println(s + " " + subs);
		
		TreeSet<String> authors = new TreeSet<String>();
		
	    authors.add("Andreas Gryphius");
	    authors.add("Fjodor Michailowitsch Dostojewski");
	    authors.add("Alexander Puschkin");
	    authors.add("Ruslana Lyzhichko");
	    authors.add("Wladimir Klitschko");
	    authors.add("Andrij Schewtschenko");
	    authors.add("Wayne Gretzky");
	    authors.add("Johann Jakob Christoffel");
	    authors.add("Milla Jovovich");
	    authors.add("Taras Schewtschenko");
	    
	    System.out.println(authors.subSet("Milla", "Wladimir"));
		
	}

}
