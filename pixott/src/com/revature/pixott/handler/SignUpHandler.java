package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.UserDao;
import com.revature.pixott.model.UserDetails;

public class SignUpHandler {
	public static void display() {
		System.out.println("Enter  Name:");
		String name= App.scanner.next();
		
		System.out.println("MobileNumber:");
		String mobileNumber= App.scanner.next();
		
		System.out.println("Enter Password:");
		String password= App.scanner.next();
		
		UserDao dao = new UserDao();
		UserDetails userdetails =new UserDetails();
		userdetails.setName(name);
		userdetails.setMobileNumber(mobileNumber);
		userdetails.setPassword(password);
		dao.signup(userdetails);

		
	}
}

