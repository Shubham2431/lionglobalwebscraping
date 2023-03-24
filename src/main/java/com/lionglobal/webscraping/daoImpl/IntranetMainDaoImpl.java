package com.lionglobal.webscraping.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.lionglobal.webscraping.dao.AbstractDao;
import com.lionglobal.webscraping.dao.IntranetMainDao;
import com.lionglobal.webscraping.model.IntranetMainModel;

/**
 * @Author Shubham Dubey
 * @CreationDate - 13-02-2023
 * @ModifyDate - 13-02-2023
 * @Desc
 */

@Repository("intranetMainDao")
public class IntranetMainDaoImpl extends AbstractDao<Integer, IntranetMainModel> implements IntranetMainDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<IntranetMainModel> getAllEmployeeList() {
		System.out.println("dao");
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

}
