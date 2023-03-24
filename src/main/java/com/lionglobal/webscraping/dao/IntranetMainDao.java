package com.lionglobal.webscraping.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lionglobal.webscraping.model.IntranetMainModel;

/**
 * @Author Shubham Dubey
 * @CreationDate - 13-02-2023
 * @ModifyDate - 13-02-2023
 * @Desc
 */
@Repository
public interface IntranetMainDao {

	List<IntranetMainModel> getAllEmployeeList();

}
