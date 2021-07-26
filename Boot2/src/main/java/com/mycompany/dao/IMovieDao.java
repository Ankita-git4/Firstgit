package com.mycompany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.entities.Movies;

public interface IMovieDao extends CrudRepository<Movies,Integer>{

	Movies findByName(Object object);

}
