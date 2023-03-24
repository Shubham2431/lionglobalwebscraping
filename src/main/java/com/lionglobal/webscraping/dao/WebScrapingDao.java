package com.lionglobal.webscraping.dao;

import org.springframework.stereotype.Repository;

import com.lionglobal.webscraping.model.WebDetails;

@Repository
public interface WebScrapingDao {
	public void saveWeb(WebDetails webdetails);

}

