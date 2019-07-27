package org.openelisglobal.testconfiguration.form;

import java.util.List;

import org.openelisglobal.common.form.BaseForm;

public class SampleTypeOrderForm extends BaseForm {
	// for display
	private List sampleTypeList;

	// in validator
	private String jsonChangeList = "";

	public SampleTypeOrderForm() {
		setFormName("sampleTypeOrderForm");
	}

	public List getSampleTypeList() {
		return sampleTypeList;
	}

	public void setSampleTypeList(List sampleTypeList) {
		this.sampleTypeList = sampleTypeList;
	}

	public String getJsonChangeList() {
		return jsonChangeList;
	}

	public void setJsonChangeList(String jsonChangeList) {
		this.jsonChangeList = jsonChangeList;
	}
}