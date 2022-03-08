package com.grs.springdemo.bean;

public class SeasonBean {
	private String seasonName;
	
	public SeasonBean() {
	}
	public SeasonBean(String season) {
		this.seasonName = season;
	}
	
	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	
	public void provideClimate() {
		System.out.println("Season");
	}

	

}
