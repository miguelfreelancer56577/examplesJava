
public class Boxer1 {

	Integer i;
	int x;
	
	public Boxer1(int y) {
		x = i+y;
		System.out.println(x);
	}
	
	public Boxer1(){}
	
	public static void main(String[] args) {
		
//		new Boxer1(new Integer(4));
		
		Boxer1 b = new Boxer1();
		
		System.out.println("finish");

	}

}
