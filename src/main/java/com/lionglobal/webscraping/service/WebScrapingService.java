package com.lionglobal.webscraping.service;

import org.springframework.stereotype.Service;

import com.lionglobal.webscraping.utils.WebDetailUtil;

@Service
public interface WebScrapingService {
	
	public void saveWebDetails(WebDetailUtil util);

}
