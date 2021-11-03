package com.rbc.db_provisioning;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TimeMachineInfo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String slaId;
	private com.rbc.db_provisioning.Schedule schedule;

	public TimeMachineInfo() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getSlaId() {
		return this.slaId;
	}

	public void setSlaId(java.lang.String slaId) {
		this.slaId = slaId;
	}

	public com.rbc.db_provisioning.Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(com.rbc.db_provisioning.Schedule schedule) {
		this.schedule = schedule;
	}

	public TimeMachineInfo(java.lang.String name, java.lang.String description,
			java.lang.String slaId, com.rbc.db_provisioning.Schedule schedule) {
		this.name = name;
		this.description = description;
		this.slaId = slaId;
		this.schedule = schedule;
	}

}