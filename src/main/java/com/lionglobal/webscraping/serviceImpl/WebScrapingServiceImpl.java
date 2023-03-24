package com.lionglobal.webscraping.serviceImpl;



import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lionglobal.webscraping.dao.WebScrapingDao;
import com.lionglobal.webscraping.model.WebDetails;
import com.lionglobal.webscraping.service.WebScrapingService;
import com.lionglobal.webscraping.utils.WebDetailUtil;

@Service
@Transactional("mydb")
public class WebScrapingServiceImpl implements WebScrapingService{

	@Autowired
	WebScrapingDao webScrapingDao ;
	
	
	@Override
	public void saveWebDetails(WebDetailUtil util) {
		// TODO Auto-generated method stub
		
	try {
		Document document =	Jsoup.connect("https://www.lionglobalinvestors.com/en/index.html").get();
	 
	 Elements links = document.select("a[href]");
	 
	 for (Element link : links) {
		WebDetails webdetails = new WebDetails();
			
			if(!link.attr("href").startsWith("javascript") && !link.attr("href").startsWith("https") && !link.attr("href").startsWith("#")) {
				 webdetails.setUrl(link.attr("href"));
				
				 
				 String baseurl = "https://www.lionglobalinvestors.com/en/";
				 String url = baseurl + link.attr("href");
			 Response response = Jsoup.connect(url).execute();
			 System.err.println(response.statusMessage());
			 
			 if(response.statusMessage().equalsIgnoreCase("ok")) {
				 webdetails.setStatus("active"); 
				 
			 }else {
				 webdetails.setStatus("inactive"); 
				 webdetails.setErrorMessage(response.statusMessage());
			 }
			 webdetails.setLastCrawled(new Timestamp(new Date().getTime()));
	             webScrapingDao.saveWeb(webdetails);
			}

		}
	
	} catch (IOException e) {
		
		e.printStackTrace();
	}

	}

}

