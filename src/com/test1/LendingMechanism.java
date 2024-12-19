package com.test1;

public class LendingMechanism {
	private long lendingCode;
	private long secured;
	private String unsecured;
	private String shortTermLending;
	private String longTermLending;
	private String commercial;
	private String consumer;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LendingMechanism() {

	}

	public LendingMechanism(long lendingCode, long secured, String unsecured, String shortTermLending,
			String longTermLending, String commercial, String consumer, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.lendingCode = lendingCode;
		this.secured = secured;
		this.unsecured = unsecured;
		this.shortTermLending = shortTermLending;
		this.longTermLending = longTermLending;
		this.commercial = commercial;
		this.consumer = consumer;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getLendingCode() {
		return lendingCode;
	}

	public void setLendingCode(long lendingCode) {
		this.lendingCode = lendingCode;
	}

	public long getSecured() {
		return secured;
	}

	public void setSecured(long secured) {
		this.secured = secured;
	}

	public String getUnsecured() {
		return unsecured;
	}

	public void setUnsecured(String unsecured) {
		this.unsecured = unsecured;
	}

	public String getShortTermLending() {
		return shortTermLending;
	}

	public void setShortTermLending(String shortTermLending) {
		this.shortTermLending = shortTermLending;
	}

	public String getLongTermLending() {
		return longTermLending;
	}

	public void setLongTermLending(String longTermLending) {
		this.longTermLending = longTermLending;
	}

	public String getCommercial() {
		return commercial;
	}

	public void setCommercial(String commercial) {
		this.commercial = commercial;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
