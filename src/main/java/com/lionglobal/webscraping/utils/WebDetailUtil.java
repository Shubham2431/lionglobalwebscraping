package com.lionglobal.webscraping.utils;

import java.util.Date;

import javax.persistence.Column;

public class WebDetailUtil {
	
	
	private String url;
	
	private Date lastCrawled;
	
	
	private  int crawlFrequency;
	
	
	private  String status;
	
	
	private String errorMessage ;
	
	
	private Object metadata ;


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Date getLastCrawled() {
		return lastCrawled;
	}


	public void setLastCrawled(Date lastCrawled) {
		this.lastCrawled = lastCrawled;
	}


	public int getCrawlFrequency() {
		return crawlFrequency;
	}


	public void setCrawlFrequency(int crawlFrequency) {
		this.crawlFrequency = crawlFrequency;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public Object getMetadata() {
		return metadata;
	}


	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}


}
