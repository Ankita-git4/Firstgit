package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.IMovieDao;
import com.mycompany.entities.Movies;

@Service
public class MovieService {
	
	@Autowired
	private IMovieDao imdao;

	public IMovieDao getImdao() {
		return imdao;
	}

	public void setImdao(IMovieDao imdao) {
		this.imdao = imdao;
	}

	public MovieService() {
	}
	
	public void deleteMovie(int id)
	{
		imdao.deleteById(id);
	}
	
	public void addMovie(Movies m)
	{
		imdao.save(m);
	}
	
	public void addMoviess(List<Movies> l)
	{
		imdao.saveAll(l);
	}
	
	public void updateMovie(Movies m)
	{
		imdao.save(m);
	}
	
	public Movies findMovie(String m)
	{
		
		return imdao.findByName(null);
	}

}
