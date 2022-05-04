package com.revature.pixott.handler;


import com.revature.pixott.app.App;
import com.revature.pixott.dao.SearchMovieDao;

public class SearchMovieHandler {
	public static void searchMovie() {
		System.out.println("----------");
		System.out.println("Search Movie");
		System.out.println("----------");
		System.out.println("Enter MovieName/Keyword:");
		String movieName= App.scanner.next();
		
		SearchMovieDao.getMovie(movieName);
		System.out.print(SearchMovieDao.movId+")");
		System.out.print(" "+SearchMovieDao.movName);
		System.out.println();
		UserMenu.menuDisplay();
		
		
	}

}
