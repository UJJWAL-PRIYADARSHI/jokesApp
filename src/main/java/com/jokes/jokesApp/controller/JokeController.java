package com.jokes.jokesApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jokes.jokesApp.service.ChuckNorrisJokeService;

@RestController
public class JokeController {

	ChuckNorrisJokeService chuckNorrisJokeService;
	
	JokeController(ChuckNorrisJokeService chuckNorrisJokeService){
		this.chuckNorrisJokeService = chuckNorrisJokeService;
	}
	
	@RequestMapping(value = "/getJoke", method = RequestMethod.GET)
	public String getJoke() {
		return chuckNorrisJokeService.getJoke();
	}
}
