
public class Dog2 {

	 String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dog2 d1 = new Dog2();
		 Dog2 d2 = new Dog2();
		 d1.name = "Aiko";
		 d2.name = "Aiko";
		 if (d1 == d2) System.out.print("== ");
		 if (d1.equals(d2)) System.out.println("dot =");
	}

	
}
