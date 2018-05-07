package mangelt.orm._1Z0851;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeSet;

public class Tail {
	
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("about");
		ts.add("red");
		ts.add("blue");
		ts.add("zoo");
		ts.add("red");
		
		System.out.println(ts);
		
		class Customer {
			
			private int id;
			private String name;
			
			public Customer(int i, String n){
				this.id=i;
				this.name=n;
			}

			public int getId() {
				return id;
			}

			public String getName() {
				return name;
			}

			@Override
			public String toString() {
				return "Customer [id=" + id + ", name=" + name + "]";
			}
			
		}
		
		Comparator<Customer> idComparator = new Comparator<Customer>(){
			@Override
			public int compare(Customer c1, Customer c2) {
	            return (int) (c1.getId() - c2.getId());
	        }
		};
		
		PriorityQueue<Customer> pq = new PriorityQueue<Customer>(7, idComparator);
		Random rand = new Random();
		for(int i=0; i<7; i++){
			int id = rand.nextInt(100);
			pq.add(new Customer(id, "Customer: "+id));
		}

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
//		System.out.println(pq.peek());
		
		
	}

}

