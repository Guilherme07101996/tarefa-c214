package br.inatel.guilherme.model;
import lombok.Data;

@Data
public class Game {
	
	private int rank;
    private String name;
    private int year;
    private String platform;
    private String global_sales;    
    private String publisher;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getGlobal_sales() {
		return global_sales;
	}
	public void setGlobal_sales(String global_sales) {
		this.global_sales = global_sales;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
