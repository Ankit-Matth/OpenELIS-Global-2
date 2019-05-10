package spring.service.systemmodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.service.common.BaseObjectServiceImpl;
import us.mn.state.health.lims.systemmodule.dao.SystemModuleUrlDAO;
import us.mn.state.health.lims.systemmodule.valueholder.SystemModuleUrl;

@Service
public class SystemModuleUrlServiceImpl extends BaseObjectServiceImpl<SystemModuleUrl> implements SystemModuleUrlService {
  @Autowired
  protected SystemModuleUrlDAO baseObjectDAO;

  SystemModuleUrlServiceImpl() {
    super(SystemModuleUrl.class);
  }

  @Override
  protected SystemModuleUrlDAO getBaseObjectDAO() {
    return baseObjectDAO;}
}