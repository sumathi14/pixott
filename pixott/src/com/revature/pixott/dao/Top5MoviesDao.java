package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.revature.pixott.model.Top5Movies;

public class Top5MoviesDao {
	public List<Top5Movies> findAll() {
		String sql = "select * from top5movies";
		List<Top5Movies> top5movies = new ArrayList<>();
		try (
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
		) {
			System.out.println("update");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Top5Movies top5movie = new Top5Movies();
				top5movie.setId(rs.getInt("id"));
				top5movie.setMovieName(rs.getString("movieName"));
				top5movies.add(top5movie);
				
			}
		} catch (SQLException e) {
			Util.displayMessage(e);
		}
		return top5movies;
	}

}
