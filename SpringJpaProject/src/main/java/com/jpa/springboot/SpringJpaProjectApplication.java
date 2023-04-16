package com.jpa.springboot;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.springboot.dao.UserRepository;
import com.jpa.springboot.entites.User;

@SpringBootApplication
public class SpringJpaProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJpaProjectApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);

	
	//save code
	
	//create obj for user class
//	User user1=new User();
//	user1.setName("Dev");
//	user1.setCity("delhi");
//	user1.setStatus("single");
//   
//	
//	User user2=new User();
//	user2.setName("Dev");
//	user2.setCity("delhi");
//	user2.setStatus("single");
//	//saving single user
////	 User resultUser=userRepository.save(user2);
//	//saving multiple value
//	List<User> users=List.of(user1,user2);
//	Iterable<User> result =userRepository.saveAll(users);
//	//bar bari se user lane ke liye for each use hua h
//	result.forEach(user->{
//		System.out.println(user);
//	});
//		
	
	//update the user id 102
//	Optional<User> optional =userRepository.findById(102);
//	User user=optional.get();
//	user.setName("dev yadav");
//	User result=userRepository.save(user);
//	System.out.println(result);
	
	
	//how to get the data 
	//findById-return optional containing your data

	
	
	//Iterable<User> itr=userRepository.findAll();
	
	
	//first metod for finding
	
	
//	Iterator<User> iterator=itr.iterator();
//	while(iterator.hasNext())
//	{
//		User user=iterator.next();
//	System.out.println(user);	
//	}
	
	
	
	//second method for finding
	
	
//	itr.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			// TODO Auto-generated method stub
//System.out.println(t);			
//		}
//	});

	
	//third methode
//	
//	itr.forEach(user->{
//		System.out.println(user);});
//		
	
	//deleting the user element
	
//	userRepository.deleteById(152);
	
	//delete multiple
//	Iterable<User> allusers= userRepository.findAll();
//	allusers.forEach(user->System.out.println(user));
//	userRepository.deleteAll(allusers);
//	
	
	
	//searching user
	List<User> user=userRepository.findByName("dev");
	user.forEach(e->System.out.println(e));
	
	//search on internate for keyword for data
	
	//go in google
	
	//spring data supported keyword
	}

}
