package us.mn.state.health.lims.sampletracking.dao;

import org.springframework.stereotype.Component;

import us.mn.state.health.lims.common.daoimpl.BaseDAOImpl;
import us.mn.state.health.lims.sampletracking.valueholder.SampleTracking;

@Component
public class SampleTrackingDAOImpl extends BaseDAOImpl<SampleTracking> implements SampleTrackingDAO {
  SampleTrackingDAOImpl() {
    super(SampleTracking.class);
  }
}