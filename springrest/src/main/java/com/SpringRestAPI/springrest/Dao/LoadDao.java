package com.SpringRestAPI.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRestAPI.springrest.entity.Load;

public interface LoadDao extends JpaRepository<Load, Long>{
	
	Load findById(long id);

}
