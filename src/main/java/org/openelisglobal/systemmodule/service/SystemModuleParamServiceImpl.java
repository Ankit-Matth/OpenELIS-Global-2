package org.openelisglobal.systemmodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.openelisglobal.common.service.BaseObjectServiceImpl;
import org.openelisglobal.systemmodule.dao.SystemModuleParamDAO;
import org.openelisglobal.systemmodule.valueholder.SystemModuleParam;

@Service
public class SystemModuleParamServiceImpl extends BaseObjectServiceImpl<SystemModuleParam, String> implements SystemModuleParamService {
	@Autowired
	protected SystemModuleParamDAO baseObjectDAO;

	SystemModuleParamServiceImpl() {
		super(SystemModuleParam.class);
	}

	@Override
	protected SystemModuleParamDAO getBaseObjectDAO() {
		return baseObjectDAO;
	}
}