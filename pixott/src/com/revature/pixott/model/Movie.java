package com.revature.pixott.model;

public class Movie {
	private int id;
	private String movieName; 
	private String genre ;
	private String leadStudio;
	private int audienceScore;
	private double  profitability ;
	private int rottenTomatoes ;
	private double worldwideSales;  
	private int year;
	public Movie() {
		
	}
	public Movie(int id, String movieName, String genre, String leadStudio, int audienceScore, double profitability,
			int rottenTomatoes, double worldwideSales, int year) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.genre = genre;
		this.leadStudio = leadStudio;
		this.audienceScore = audienceScore;
		this.profitability = profitability;
		this.rottenTomatoes = rottenTomatoes;
		this.worldwideSales = worldwideSales;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLeadStudio() {
		return leadStudio;
	}
	public void setLeadStudio(String leadStudio) {
		this.leadStudio = leadStudio;
	}
	public int getAudienceScore() {
		return audienceScore;
	}
	public void setAudienceScore(int audienceScore) {
		this.audienceScore = audienceScore;
	}
	public double getProfitability() {
		return profitability;
	}
	public void setProfitability(double profitability) {
		this.profitability = profitability;
	}
	public int getRottenTomatoes() {
		return rottenTomatoes;
	}
	public void setRottenTomatoes(int rottenTomatoes) {
		this.rottenTomatoes = rottenTomatoes;
	}
	public double getWorldwideSales() {
		return worldwideSales;
	}
	public void setWorldwideSales(double worldwideSales) {
		this.worldwideSales = worldwideSales;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + audienceScore;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((leadStudio == null) ? 0 : leadStudio.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(profitability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rottenTomatoes;
		temp = Double.doubleToLongBits(worldwideSales);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (audienceScore != other.audienceScore)
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (leadStudio == null) {
			if (other.leadStudio != null)
				return false;
		} else if (!leadStudio.equals(other.leadStudio))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (Double.doubleToLongBits(profitability) != Double.doubleToLongBits(other.profitability))
			return false;
		if (rottenTomatoes != other.rottenTomatoes)
			return false;
		if (Double.doubleToLongBits(worldwideSales) != Double.doubleToLongBits(other.worldwideSales))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  String.format("%4d %-40s", id,movieName );
	}
	
	
	

} 
