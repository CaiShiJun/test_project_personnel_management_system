package com.senyint.pmsystem.service.imp;

import org.springframework.stereotype.Service;

import com.senyint.pmsystem.bean.ajax.GridParam;
import com.senyint.pmsystem.bean.ajax.GridResult;
import com.senyint.pmsystem.entity.Station;
import com.senyint.pmsystem.service.PostManagementService;

@Service
public class PostManagementServiceImp implements PostManagementService{

	@Override
	public GridResult getPostByGridParam(GridParam gridParam, Station station) {
		
		return null;
	}

}
