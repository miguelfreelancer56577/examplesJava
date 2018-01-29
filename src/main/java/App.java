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


		String[] colors = {"blue", "red", "orange", "green", "yellow", "orange"};
//		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, 1);
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(s2 + " " + s3);
		
	}

}
