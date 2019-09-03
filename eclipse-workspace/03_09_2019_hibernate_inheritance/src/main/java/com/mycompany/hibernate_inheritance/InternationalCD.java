package com.mycompany.hibernate_inheritance;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("international_cd")
public class InternationalCD extends CD {
	
	private String languages;
	private int region;
	
	
	public InternationalCD() {
		
	}
	
	public InternationalCD(String title, String artist, Date purchaseDate, double cost, String language, int region) {
		super(title, artist, purchaseDate, cost);
		languages = language;
		this.region = region;
		
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}
	
	
	
	

}
