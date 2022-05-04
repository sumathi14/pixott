package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.UserDao;
import com.revature.pixott.model.UserDetails;

public class LoginHandler {
	public static void display() {
		System.out.println("MobileNumber:");
		String mobileNumber= App.scanner.next();
		
		System.out.println("Enter Password:");
		String password= App.scanner.next();
		
		UserDao dao = new UserDao();
		UserDetails userdetails=dao.getUserDetails(mobileNumber);
	    if (password.equals(userdetails.getPassword())) {
	    	System.out.println("Login Successfull");
	    	System.out.println(userdetails.getName());
	    	UserMenu.menuDisplay();
	    	
	    }
	    else {
	    	System.out.println("Invalid mobile or password");
	    }
		
	}


		

}
