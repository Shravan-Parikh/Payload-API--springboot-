package com.SpringRestAPI.springrest.services;

import java.util.List;

import com.SpringRestAPI.springrest.entity.Load;

public interface LoadService {
	
	public List<Load> getLoad();
	
	public Load getLoadID(long loadId);
	
	public Load addload(Load load);
	
	public Load updateLoad(Load load);
	
	public Load deleteLoad(long parseLong);

}
