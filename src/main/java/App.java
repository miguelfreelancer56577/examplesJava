import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class App {

	public static void main(String[] args) {

		 Object [] myObjects = {
			 new Integer(12),
			 new String("foo"),
			 new Integer(5),
			 new Boolean(true)
		 };
		 Arrays.sort(myObjects);
		 for(int i=0; i<myObjects.length; i++) {
		 System.out.print(myObjects[i].toString());
		 System.out.print(" ");
		 }
		
	}

}
