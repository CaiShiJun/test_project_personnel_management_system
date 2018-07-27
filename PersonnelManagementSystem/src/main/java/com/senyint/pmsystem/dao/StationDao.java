package com.senyint.pmsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.senyint.pmsystem.entity.Station;

public interface StationDao extends JpaRepository<Station,String>,JpaSpecificationExecutor<Station>{

}
