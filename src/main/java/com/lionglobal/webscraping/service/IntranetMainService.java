package com.lionglobal.webscraping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lionglobal.webscraping.model.IntranetMainModel;

/**
 * @Author Shubham Dubey
 * @CreationDate - 13-02-2023
 * @ModifyDate - 13-02-2023
 * @Desc
 */
@Service
public interface IntranetMainService {

	List<IntranetMainModel> getAllEmployeeList();

}
