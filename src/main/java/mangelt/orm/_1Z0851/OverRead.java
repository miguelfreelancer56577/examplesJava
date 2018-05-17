package mangelt.orm._1Z0851;

public class OverRead {
	
	interface test{
		int VALUE = 0;
	}

	public static void main(String[] args) {
		
		Runnable r = new Runnable(){
			
			public void run(){
				
				System.out.println("class A");
				
			}
			
		};
		
		Thread t = new Thread(r){
			public void run(){
				System.out.println("class B");
			}
		};
		
		t.start();
		

	}

}


