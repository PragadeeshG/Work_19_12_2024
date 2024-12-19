package com.test1;

public class UnsecuredLendingMechanism {
	private long variationsCode;
	private long digitalCode;
	private long assetBasedLending;
	private String lendingAccount;
	private double lendingAmount;
	private String workingCapital;
	private String payday;
	private String invoiceFinancing;
	private String overdraft;
	private boolean termLoan;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UnsecuredLendingMechanism() {

	}

	public UnsecuredLendingMechanism(long variationsCode, long digitalCode, long assetBasedLending,
			String lendingAccount, double lendingAmount, String workingCapital, String payday, String invoiceFinancing,
			String overdraft, boolean termLoan, String creationDate, String modifiedDate, String entityState) {
		super();
		this.variationsCode = variationsCode;
		this.digitalCode = digitalCode;
		this.assetBasedLending = assetBasedLending;
		this.lendingAccount = lendingAccount;
		this.lendingAmount = lendingAmount;
		this.workingCapital = workingCapital;
		this.payday = payday;
		this.invoiceFinancing = invoiceFinancing;
		this.overdraft = overdraft;
		this.termLoan = termLoan;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getVariationsCode() {
		return variationsCode;
	}

	public void setVariationsCode(long variationsCode) {
		this.variationsCode = variationsCode;
	}

	public long getDigitalCode() {
		return digitalCode;
	}

	public void setDigitalCode(long digitalCode) {
		this.digitalCode = digitalCode;
	}

	public long getAssetBasedLending() {
		return assetBasedLending;
	}

	public void setAssetBasedLending(long assetBasedLending) {
		this.assetBasedLending = assetBasedLending;
	}

	public String getLendingAccount() {
		return lendingAccount;
	}

	public void setLendingAccount(String lendingAccount) {
		this.lendingAccount = lendingAccount;
	}

	public double getLendingAmount() {
		return lendingAmount;
	}

	public void setLendingAmount(double lendingAmount) {
		this.lendingAmount = lendingAmount;
	}

	public String getWorkingCapital() {
		return workingCapital;
	}

	public void setWorkingCapital(String workingCapital) {
		this.workingCapital = workingCapital;
	}

	public String getPayday() {
		return payday;
	}

	public void setPayday(String payday) {
		this.payday = payday;
	}

	public String getInvoiceFinancing() {
		return invoiceFinancing;
	}

	public void setInvoiceFinancing(String invoiceFinancing) {
		this.invoiceFinancing = invoiceFinancing;
	}

	public String getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}

	public boolean isTermLoan() {
		return termLoan;
	}

	public void setTermLoan(boolean termLoan) {
		this.termLoan = termLoan;
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
