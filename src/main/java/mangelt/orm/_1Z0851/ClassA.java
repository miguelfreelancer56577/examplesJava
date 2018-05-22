package mangelt.orm._1Z0851;

public class ClassA {
	
	public int numberOfinstances;
	
	protected ClassA(int number){
		numberOfinstances = number;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfinstances;
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
		ClassA other = (ClassA) obj;
		if (numberOfinstances != other.numberOfinstances)
			return false;
		return true;
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
