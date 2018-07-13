package com.galeriRestfull.dao;
import java.util.List;
import com.galeriRestfull.model.OtomobilSahip;
public interface OtomobilSahipRepository {

	List<OtomobilSahip> findAll();
	OtomobilSahip findById(Long id);
	
}
