package mangelt.orm._1Z0851;

public class ClassA {
	
	public int numberOfinstances;
	
	protected ClassA(int number){
		numberOfinstances = number;
	}
	
	static class ExtendedA extends ClassA{
		private ExtendedA(int passNumber){
			super(passNumber);
		}
	}
	
	public static void main(String[] args) {
		
		ClassA ca = new ClassA(4);
		
		ExtendedA ea = new ClassA.ExtendedA(420);
		
	}
	
}
