package com.SpringRestAPI.springrest.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRestAPI.springrest.Dao.LoadDao;
import com.SpringRestAPI.springrest.entity.Load;

@Service
public class LoadserviceImpl implements LoadService{
	
	@Autowired
	private LoadDao loadDao;

//	List<Load> list;
	
	public LoadserviceImpl() {
		
//		list=new ArrayList<>();
//		list.add(new Load(1234,"delhi", "silvassa", "car", "tata",
//				32, 1000, "fragile", LocalDate.of(2023, 12, 23)));
//		list.add(new Load(12345,"delhi", "silvassa", "car", "tata",
//				32, 1000, "Rest api load", LocalDate.of(2023, 12, 23)));
	
	
	}
	
	@Override
	public List<Load> getLoad() {
		
		return loadDao.findAll();
	}

	
	
	@Override
	public Load getLoadID(long loadId) {
//		
//		Load i=null;
//		for(Load Load:list)
//		{
//			if(Load.getShipperID() == loadId) 
//			{
//				i=Load;
//				break;
//			}
//		}
		Optional<Load> optionalLoad = Optional.ofNullable(loadDao.findById(loadId));
        return optionalLoad.orElse(null);
		
	};

	@Override
	public Load addload(Load load) {
//		list.add(load);
		loadDao.save(load);
		return load;
	}

	@Override
	public Load updateLoad(Load load) {
		
//		list.forEach(i -> {
//			if (i.getShipperID() == load.getShipperID()) {
//				i.setLoadingPoint(load.getLoadingPoint());
//				i.setUnloadingPoint(load.getUnloadingPoint());
//				i.setProductType(load.getProductType());
//				i.setTruckType(load.getTruckType());
//				i.setNoOfTrucks(load.getNoOfTrucks());
//				i.setWeight(load.getWeight());
//				i.setComment(load.getComment());
//				i.setDate(load.getDate());
//			}
//		});
		
		loadDao.save(load);
		return load;
	}

	
	@Override
	public Load deleteLoad(long parseLong) {
	//	list=this.list.stream().filter(e->e.getShipperID()!=parseLong).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Load entity = loadDao.findById(parseLong);
		loadDao.delete(entity);
		return null;
	}

}
