package com.cg.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.Query_Master;

public interface UpdateDaoServices extends JpaRepository<Query_Master, Integer> {

}
