package com.galeriRestfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.galeriRestfull.model.OtomobilSahip;
import com.galeriRestfull.service.GaleriService;
 
@Controller
@RequestMapping("/rest")
public class GaleriRestController {

	@Autowired
	private GaleriService galeriService;
	
	@RequestMapping(method=RequestMethod.GET,value="/index")
	@ResponseBody
	public ResponseEntity<List<OtomobilSahip>> getOtomobilSahipler(){
		List<OtomobilSahip> kisiListesi=galeriService.findOtomobilSahipler();
		return ResponseEntity.ok(kisiListesi);
		
	}
  
	@RequestMapping(method = RequestMethod.GET, value = "/index/{id}")
	@ResponseBody
	public ResponseEntity<?> getOtomobilSahip(@PathVariable("id") Long id) {
			OtomobilSahip kisi = galeriService.findOtomobilSahip(id);
			return ResponseEntity.ok(kisi);
	}
 
}