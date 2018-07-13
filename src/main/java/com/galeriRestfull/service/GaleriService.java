package com.galeriRestfull.service;
import java.util.List;
 
import com.galeriRestfull.model.OtomobilSahip;
 
public interface GaleriService {
	
	List<OtomobilSahip> findOtomobilSahipler();
	OtomobilSahip findOtomobilSahip(Long id);

}
