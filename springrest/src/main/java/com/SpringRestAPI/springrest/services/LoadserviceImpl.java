package com.SpringRestAPI.springrest.services;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRestAPI.springrest.Dao.LoadDao;
import com.SpringRestAPI.springrest.entity.Load;

@Service
public class LoadserviceImpl implements LoadService{
	
	@Autowired
	private LoadDao loadDao;

	
	public LoadserviceImpl() {
			
	}
	
	@Override
	public List<Load> getLoad() {
		
		return loadDao.findAll();
	}

	
	
	@Override
	public Load getLoadID(long loadId) {
		Optional<Load> optionalLoad = Optional.ofNullable(loadDao.findById(loadId));
        return optionalLoad.orElse(null);
		
	};

	@Override
	public Load addload(Load load) {
		loadDao.save(load);
		return load;
	}

	@Override
	public Load updateLoad(Load load) {
		
		loadDao.save(load);
		return load;
	}

	
	@Override
	public Load deleteLoad(long parseLong) {
		Load entity = loadDao.findById(parseLong);
		loadDao.delete(entity);
		return null;
	}

}
