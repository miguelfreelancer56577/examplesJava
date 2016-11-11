package practice;

import org.springframework.web.client.RestTemplate;

import practice.model.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mp = new ObjectMapper();
		User user = new User("Miguel", "Torres");
		user.setName("Luis");
		user.setSurname("Martinez");
		try {
			System.out.println(mp.writeValueAsString(user));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("block finally ...");
		}
		System.out.println("ended the application ...");
	}

}
