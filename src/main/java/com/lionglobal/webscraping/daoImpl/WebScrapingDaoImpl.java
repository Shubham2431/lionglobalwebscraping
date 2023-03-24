package com.lionglobal.webscraping.daoImpl;

import org.springframework.stereotype.Repository;

import com.lionglobal.webscraping.dao.AbstractDao;
import com.lionglobal.webscraping.dao.WebScrapingDao;
import com.lionglobal.webscraping.model.IntranetMainModel;
import com.lionglobal.webscraping.model.WebDetails;


@Repository("webScrapingDao")
public class WebScrapingDaoImpl extends  AbstractDao<Integer, WebDetails>implements WebScrapingDao{

	@Override
	public void saveWeb(WebDetails webdetails) {
		// TODO Auto-generated method stub
		
		persist(webdetails);
		
	}
	

}
