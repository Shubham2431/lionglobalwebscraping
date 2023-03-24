package com.lionglobal.webscraping.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.xdevapi.JsonArray;

@Entity
@Table(name = "websites")
public class WebDetails implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8179107531133809758L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "url")
	private String url;
	@Column(name = "last_crawled")
	private Timestamp lastCrawled;
	
	@Column(name = "crawl_frequency")
	private  int crawlFrequency;
	
	@Column(name = "status")
	private  String status;
	
	@Column(name = "error_message")
	private String errorMessage ;
	
	@Column(name = "metadata")
	private JsonArray metadata ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Timestamp  getLastCrawled() {
		return lastCrawled;
	}

	public void setLastCrawled(Timestamp date) {
		this.lastCrawled = date;
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

	public JsonArray getMetadata() {
		return metadata;
	}

	public void setMetadata(JsonArray metadata) {
		this.metadata = metadata;
	}
	
	
	
}
	