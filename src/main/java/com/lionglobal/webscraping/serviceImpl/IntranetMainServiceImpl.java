package com.lionglobal.webscraping.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lionglobal.webscraping.dao.IntranetMainDao;
import com.lionglobal.webscraping.model.IntranetMainModel;
import com.lionglobal.webscraping.service.IntranetMainService;

/**
 * @Author Shubham Dubey
 * @CreationDate - 13-02-2023
 * @ModifyDate - 13-02-2023
 * @Desc
 */

@Service
@Transactional("mydb")
public class IntranetMainServiceImpl implements IntranetMainService {

	@Autowired
	private IntranetMainDao intranetMainDao;

	@Override
	public List<IntranetMainModel> getAllEmployeeList() {
		System.out.println("serviceimpl");
		return intranetMainDao.getAllEmployeeList();
	}

}
