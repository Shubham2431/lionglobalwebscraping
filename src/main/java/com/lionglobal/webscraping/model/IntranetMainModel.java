package com.lionglobal.webscraping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author Shubham Dubey
 * @CreationDate - 13-02-2023
 * @Desc - Entity to store data in database
 */
@Entity
@Table(name = "intranetmain")
public class IntranetMainModel {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
