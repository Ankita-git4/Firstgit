package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.entities.Movies;
import com.mycompany.service.MovieService;

@Controller
public class MoviesController {
	
	@Autowired
	private MovieService serv;
	
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public String adddMovie(@ModelAttribute Movies m)
	{
		serv.addMovie(m);
		
		//m.addAttribute()
		return "add_success";
	}

}
