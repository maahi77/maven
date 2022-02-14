package com.example.SPRINGBOOT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.UserRepository.UserRepository;
import com.model.User;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
	
	@Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}
    @Override
    public void run(String...args) throws Exception {
        User user = new User();
        user.setId(28);
        user.setEadd("mahendra@gmail.com");
        user.setLname("anipireddy");
        user.setFname("mahendra");
        user = userRepository.save(user);


        User user2 = userRepository.findByEmailAddress("mahendra@gmail.com");
        System.out.println(user2.toString());


        List< User > user3 = userRepository.findByLastname("anipireddy");
        System.out.println(user3.get(0).toString());
    }


}
