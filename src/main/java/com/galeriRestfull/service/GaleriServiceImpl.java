package com.galeriRestfull.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.galeriRestfull.dao.OtomobilSahipRepository;
import com.galeriRestfull.model.OtomobilSahip;

@Service
public class GaleriServiceImpl implements GaleriService {

	private OtomobilSahipRepository otomobilSahipRepository;

	@Autowired
	public void setOtomobilSahipRepository(OtomobilSahipRepository otomobilSahipRepository) {
		this.otomobilSahipRepository = otomobilSahipRepository;
	}

	@Override
	public List<OtomobilSahip> findOtomobilSahipler() {
		return otomobilSahipRepository.findAll();
	}

	@Override
	public OtomobilSahip findOtomobilSahip(Long id) {
		OtomobilSahip otomobilSahip = otomobilSahipRepository.findById(id);
		return otomobilSahip;
	}

}
