
package com.cybage.sonar.report.pdf.entity;

public class StatusPeriod {

    private Integer index;
    private String mode;
    private String date;
    private String parameter;

    public StatusPeriod(Integer index, String mode, String date, String parameter) {
		super();
		this.index = index;
		this.mode = mode;
		this.date = date;
		this.parameter = parameter;
	}
    
    public StatusPeriod() {
		this.index = null;
		this.mode = null;
		this.date = null;
		this.parameter = null;
	}
    

	public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

}
