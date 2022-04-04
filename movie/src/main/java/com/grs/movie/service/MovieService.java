package com.grs.movie.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	public Long calculatebudget(String actor) {
		Long budget = 1000l;
		if (Objects.isNull(actor) || actor.isEmpty()) budget= null;
		else if(actor.equalsIgnoreCase("Punith")) budget= 5000000l;
		else if(actor.equalsIgnoreCase("yash")) budget= 70000l;
		
		return budget;
	}

}
