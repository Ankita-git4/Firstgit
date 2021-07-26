package com.mycompany.entities;

import javax.persistence.*;


@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private String language;
	
	private String director;
	
	private String star_cast;
	
	
	public Movies() {
		
	}
	public Movies(int id, String name, String language, String director, String star_cast, int year) {
		this.id = id;
		this.name = name;
		this.language = language;
		this.director = director;
		this.star_cast = star_cast;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + ", language=" + language + ", director=" + director
				+ ", star_cast=" + star_cast + ", year=" + year + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getStar_cast() {
		return star_cast;
	}
	public void setStar_cast(String star_cast) {
		this.star_cast = star_cast;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int year;

}
