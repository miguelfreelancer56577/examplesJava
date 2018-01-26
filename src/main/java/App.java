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
	    
	    System.out.println(authors.first());
	    System.out.println(authors.floor("F"));
	    System.out.println(authors.contains("A"));
	    System.out.println(authors.higher("A"));
	    System.out.println(authors.pollFirst());
	    System.out.println(authors.pollLast());
	    
	    Object[] arrayAuthors = authors.toArray();
	    
	    for (Object object : arrayAuthors) {
			System.out.println("name author: " + object);
		}
	    
	}

}
