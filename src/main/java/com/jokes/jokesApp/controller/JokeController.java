package com.jokes.jokesApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jokes.jokesApp.service.ChuckNorrisJokeService;

@Controller
public class JokeController {

	ChuckNorrisJokeService chuckNorrisJokeService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getJoke() {
		return chuckNorrisJokeService.getJoke();
	}
}
