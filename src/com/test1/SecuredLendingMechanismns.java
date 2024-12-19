package com.test1;

public class SecuredLendingMechanismns {
	private long secureCode;
	private String peerToPeer;
	private String microFinance;
	private String macroFinance;
	private String governmentApprovedLendings;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SecuredLendingMechanismns() {

	}

	public SecuredLendingMechanismns(long secureCode, String peerToPeer, String microFinance, String macroFinance,
			String governmentApprovedLendings, String creationDate, String modifiedDate, String entityState) {
		super();
		this.secureCode = secureCode;
		this.peerToPeer = peerToPeer;
		this.microFinance = microFinance;
		this.macroFinance = macroFinance;
		this.governmentApprovedLendings = governmentApprovedLendings;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSecureCode() {
		return secureCode;
	}

	public void setSecureCode(long secureCode) {
		this.secureCode = secureCode;
	}

	public String getPeerToPeer() {
		return peerToPeer;
	}

	public void setPeerToPeer(String peerToPeer) {
		this.peerToPeer = peerToPeer;
	}

	public String getMicroFinance() {
		return microFinance;
	}

	public void setMicroFinance(String microFinance) {
		this.microFinance = microFinance;
	}

	public String getMacroFinance() {
		return macroFinance;
	}

	public void setMacroFinance(String macroFinance) {
		this.macroFinance = macroFinance;
	}

	public String getGovernmentApprovedLendings() {
		return governmentApprovedLendings;
	}

	public void setGovernmentApprovedLendings(String governmentApprovedLendings) {
		this.governmentApprovedLendings = governmentApprovedLendings;
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
