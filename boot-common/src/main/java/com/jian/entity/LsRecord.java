package com.jian.entity;

import java.io.Serializable;
import java.util.Date;

public class LsRecord implements Serializable {
    private String recordid;

    private String cardid;

    private String name;

    private Date verifyTime;

    private Float verifyScore;

    private String verifyPhoto;

    private String verifyResult;

    private String deviceseril;

    private String merchantId;
    
    private String verifytime;

    private static final long serialVersionUID = 1L;

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Float getVerifyScore() {
        return verifyScore;
    }

    public void setVerifyScore(Float verifyScore) {
        this.verifyScore = verifyScore;
    }

    public String getVerifyPhoto() {
        return verifyPhoto;
    }

    public void setVerifyPhoto(String verifyPhoto) {
        this.verifyPhoto = verifyPhoto == null ? null : verifyPhoto.trim();
    }

    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult == null ? null : verifyResult.trim();
    }

    public String getDeviceseril() {
        return deviceseril;
    }

    public void setDeviceseril(String deviceseril) {
        this.deviceseril = deviceseril == null ? null : deviceseril.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

	public String getVerifytime() {
		return verifytime;
	}

	public void setVerifytime(String verifytime) {
		this.verifytime = verifytime;
	}
    
    
}