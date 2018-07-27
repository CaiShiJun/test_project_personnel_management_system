package com.senyint.pmsystem.service;

import com.senyint.pmsystem.bean.ajax.GridParam;
import com.senyint.pmsystem.bean.ajax.GridResult;
import com.senyint.pmsystem.entity.Station;

public interface PostManagementService {
	
	GridResult getPostByGridParam(GridParam gridParam, Station station);
	
}
