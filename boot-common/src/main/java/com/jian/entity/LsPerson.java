package com.jian.entity;

import java.io.Serializable;
import java.util.Date;

public class LsPerson implements Serializable {
    private String cardid;

    private String name;

    private Integer persontype;

    private String photo;

    private Long version;

    private Integer action;

    private String merchantId;

    private Date startDate;

    private Date endDate;

    private byte[] photofeatrue;
    
    private String  datetime;

    private static final long serialVersionUID = 1L;

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

    public Integer getPersontype() {
        return persontype;
    }

    public void setPersontype(Integer persontype) {
        this.persontype = persontype;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public byte[] getPhotofeatrue() {
        return photofeatrue;
    }

    public void setPhotofeatrue(byte[] photofeatrue) {
        this.photofeatrue = photofeatrue;
    }

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
    
}