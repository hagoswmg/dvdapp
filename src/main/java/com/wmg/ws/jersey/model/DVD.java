package com.wmg.ws.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DVD {
	private String artist;
	private String title;
	private String year;

	public DVD() {
	}

	public DVD(String artist, String title, String year) {
		super();
		this.artist = artist;
		this.title = title;
		this.year = year;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
