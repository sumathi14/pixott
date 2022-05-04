package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.dao.MovieDao;
import com.revature.pixott.model.Movie;



public class MovieHandler {
	public static void display(){
		MovieDao dao = new MovieDao();
		
		List<Movie> movies = dao.findAll();
		System.out.println("------");
		System.out.println("Movies");
		System.out.println("------");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "--", "----");
		  
		
		
		movies.forEach(e->System.out.println(e));
		System.out.println();
		MainMenuHandler.display();
	}

}

