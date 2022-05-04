package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class SearchMovieDao {
	 public static int movId;
	 public static String movName;
	public static void getMovie(String movieName) {
        String sql="SELECT id,movieName FROM top5movies Where movieName like ?";
		
		try(
			    Connection conn=Util.getConnection();
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
		{
			stmt.setString(1, "%"+movieName+"%");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
			   
			   movId=rs.getInt("id");
			   movName=rs.getString("movieName");
			   
			 
				
	        }
		}
		catch(SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
			}
}
