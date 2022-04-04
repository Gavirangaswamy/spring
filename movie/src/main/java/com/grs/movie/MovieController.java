package com.grs.movie;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grs.movie.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	public MovieService service;
	
	public MovieController() {
		System.out.println("Object created");
	}
	
	@GetMapping("/saveMovie.do")
	public ModelAndView saveMovie(String movieName,String actorName,HttpSession session) {
		Long budget = service.calculatebudget(actorName);
		ModelAndView modelAndView = new ModelAndView("MovieProfile");
		modelAndView.addObject("movie", movieName);
		modelAndView.addObject("movieBudget",budget);
		if(session.getAttribute("movie")==null)
			session.setAttribute("movie", movieName);
		
		return modelAndView;
	}
}
