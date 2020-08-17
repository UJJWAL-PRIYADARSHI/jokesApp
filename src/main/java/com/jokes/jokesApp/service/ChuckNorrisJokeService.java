package com.jokes.jokesApp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService{

	ChuckNorrisQuotes chuckNorrisQuotes;
	
	ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes){
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}

}
