package com.galeriRestfull.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.galeriRestfull.model.OtomobilSahip;
 
@Repository
public class OtomobilSahipRepositoryImpl implements OtomobilSahipRepository {
	
	private Map<Long, OtomobilSahip> otomobilSahipMap = new HashMap<>();
	 public OtomobilSahipRepositoryImpl() {
		OtomobilSahip otomobilSahip1 = new OtomobilSahip();
		otomobilSahip1.setId(1L);
		otomobilSahip1.setAdi("ZEYNEP");
		otomobilSahip1.setSoyAdi("Sit");
		OtomobilSahip otomobilSahip2 = new OtomobilSahip();
		otomobilSahip2.setId(2L);
		otomobilSahip2.setAdi("ASLI");
		otomobilSahip2.setSoyAdi("DEMİR");
		
		otomobilSahipMap.put(otomobilSahip1.getId(), otomobilSahip1);
		otomobilSahipMap.put(otomobilSahip2.getId(), otomobilSahip2);
	} 

	@Override
	public List<OtomobilSahip> findAll() {
		return new ArrayList<>(otomobilSahipMap.values());		 
	}

	@Override
	public OtomobilSahip findById(Long id) {
		return otomobilSahipMap.get(id);
	}
}
