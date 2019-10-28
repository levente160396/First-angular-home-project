package hu.template.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BrcryptEncoderTest {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		for(int i = 1; i<=10;i++) {
			String encodeString = encoder.encode("password@!23@");
			System.out.println(encodeString);
		}
		
	}

}
