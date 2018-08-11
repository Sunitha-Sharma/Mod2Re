package com.cg.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.beans.Query_Master;
import com.cg.daoservices.UpdateDaoServices;


@Component(value="schedulerservices")
public class UpdateServicesImpl implements UpdateServices {

	@Autowired
	private UpdateDaoServices daoServices;

	
	
	@Transactional
	@Override
	public Query_Master getdetails(int id) {
		Query_Master query_master=daoServices.findOne(id);
		System.out.println(query_master.getQuery_raised_by());
		return query_master;
	}
	@Transactional
	@Override
	public Query_Master updatedetails(Query_Master query_master) {
		query_master=daoServices.save(query_master);
		return query_master;
	}

}