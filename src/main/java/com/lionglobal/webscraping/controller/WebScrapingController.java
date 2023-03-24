package com.lionglobal.webscraping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lionglobal.webscraping.service.WebScrapingService;

@RestController
@RequestMapping("/")

public class WebScrapingController {
 @Autowired
 WebScrapingService webScrapingService;
 
	@RequestMapping(value = { "/webScrap" }, method = RequestMethod.GET)
	public ResponseEntity<?> getWebScrap() {
		webScrapingService.saveWebDetails(null);
		return ResponseEntity.ok().body("success");
	
}
}

