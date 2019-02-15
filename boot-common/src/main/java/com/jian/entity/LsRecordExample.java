package com.jian.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LsRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRecordidIsNull() {
            addCriterion("recordId is null");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNotNull() {
            addCriterion("recordId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordidEqualTo(String value) {
            addCriterion("recordId =", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotEqualTo(String value) {
            addCriterion("recordId <>", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThan(String value) {
            addCriterion("recordId >", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThanOrEqualTo(String value) {
            addCriterion("recordId >=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThan(String value) {
            addCriterion("recordId <", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThanOrEqualTo(String value) {
            addCriterion("recordId <=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLike(String value) {
            addCriterion("recordId like", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotLike(String value) {
            addCriterion("recordId not like", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidIn(List<String> values) {
            addCriterion("recordId in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotIn(List<String> values) {
            addCriterion("recordId not in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidBetween(String value1, String value2) {
            addCriterion("recordId between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotBetween(String value1, String value2) {
            addCriterion("recordId not between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("cardId is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("cardId is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(String value) {
            addCriterion("cardId =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(String value) {
            addCriterion("cardId <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(String value) {
            addCriterion("cardId >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(String value) {
            addCriterion("cardId >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(String value) {
            addCriterion("cardId <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(String value) {
            addCriterion("cardId <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLike(String value) {
            addCriterion("cardId like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotLike(String value) {
            addCriterion("cardId not like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<String> values) {
            addCriterion("cardId in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<String> values) {
            addCriterion("cardId not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(String value1, String value2) {
            addCriterion("cardId between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(String value1, String value2) {
            addCriterion("cardId not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreIsNull() {
            addCriterion("verify_score is null");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreIsNotNull() {
            addCriterion("verify_score is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreEqualTo(Float value) {
            addCriterion("verify_score =", value, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreNotEqualTo(Float value) {
            addCriterion("verify_score <>", value, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreGreaterThan(Float value) {
            addCriterion("verify_score >", value, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("verify_score >=", value, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreLessThan(Float value) {
            addCriterion("verify_score <", value, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreLessThanOrEqualTo(Float value) {
            addCriterion("verify_score <=", value, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreIn(List<Float> values) {
            addCriterion("verify_score in", values, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreNotIn(List<Float> values) {
            addCriterion("verify_score not in", values, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreBetween(Float value1, Float value2) {
            addCriterion("verify_score between", value1, value2, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyScoreNotBetween(Float value1, Float value2) {
            addCriterion("verify_score not between", value1, value2, "verifyScore");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoIsNull() {
            addCriterion("verify_photo is null");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoIsNotNull() {
            addCriterion("verify_photo is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoEqualTo(String value) {
            addCriterion("verify_photo =", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoNotEqualTo(String value) {
            addCriterion("verify_photo <>", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoGreaterThan(String value) {
            addCriterion("verify_photo >", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("verify_photo >=", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoLessThan(String value) {
            addCriterion("verify_photo <", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoLessThanOrEqualTo(String value) {
            addCriterion("verify_photo <=", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoLike(String value) {
            addCriterion("verify_photo like", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoNotLike(String value) {
            addCriterion("verify_photo not like", value, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoIn(List<String> values) {
            addCriterion("verify_photo in", values, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoNotIn(List<String> values) {
            addCriterion("verify_photo not in", values, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoBetween(String value1, String value2) {
            addCriterion("verify_photo between", value1, value2, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoNotBetween(String value1, String value2) {
            addCriterion("verify_photo not between", value1, value2, "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyResultIsNull() {
            addCriterion("verify_result is null");
            return (Criteria) this;
        }

        public Criteria andVerifyResultIsNotNull() {
            addCriterion("verify_result is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyResultEqualTo(String value) {
            addCriterion("verify_result =", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotEqualTo(String value) {
            addCriterion("verify_result <>", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultGreaterThan(String value) {
            addCriterion("verify_result >", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultGreaterThanOrEqualTo(String value) {
            addCriterion("verify_result >=", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLessThan(String value) {
            addCriterion("verify_result <", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLessThanOrEqualTo(String value) {
            addCriterion("verify_result <=", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLike(String value) {
            addCriterion("verify_result like", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotLike(String value) {
            addCriterion("verify_result not like", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultIn(List<String> values) {
            addCriterion("verify_result in", values, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotIn(List<String> values) {
            addCriterion("verify_result not in", values, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultBetween(String value1, String value2) {
            addCriterion("verify_result between", value1, value2, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotBetween(String value1, String value2) {
            addCriterion("verify_result not between", value1, value2, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andDeviceserilIsNull() {
            addCriterion("deviceSeril is null");
            return (Criteria) this;
        }

        public Criteria andDeviceserilIsNotNull() {
            addCriterion("deviceSeril is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceserilEqualTo(String value) {
            addCriterion("deviceSeril =", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilNotEqualTo(String value) {
            addCriterion("deviceSeril <>", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilGreaterThan(String value) {
            addCriterion("deviceSeril >", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilGreaterThanOrEqualTo(String value) {
            addCriterion("deviceSeril >=", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilLessThan(String value) {
            addCriterion("deviceSeril <", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilLessThanOrEqualTo(String value) {
            addCriterion("deviceSeril <=", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilLike(String value) {
            addCriterion("deviceSeril like", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilNotLike(String value) {
            addCriterion("deviceSeril not like", value, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilIn(List<String> values) {
            addCriterion("deviceSeril in", values, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilNotIn(List<String> values) {
            addCriterion("deviceSeril not in", values, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilBetween(String value1, String value2) {
            addCriterion("deviceSeril between", value1, value2, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andDeviceserilNotBetween(String value1, String value2) {
            addCriterion("deviceSeril not between", value1, value2, "deviceseril");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andRecordidLikeInsensitive(String value) {
            addCriterion("upper(recordId) like", value.toUpperCase(), "recordid");
            return (Criteria) this;
        }

        public Criteria andCardidLikeInsensitive(String value) {
            addCriterion("upper(cardId) like", value.toUpperCase(), "cardid");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andVerifyPhotoLikeInsensitive(String value) {
            addCriterion("upper(verify_photo) like", value.toUpperCase(), "verifyPhoto");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLikeInsensitive(String value) {
            addCriterion("upper(verify_result) like", value.toUpperCase(), "verifyResult");
            return (Criteria) this;
        }

        public Criteria andDeviceserilLikeInsensitive(String value) {
            addCriterion("upper(deviceSeril) like", value.toUpperCase(), "deviceseril");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLikeInsensitive(String value) {
            addCriterion("upper(merchant_id) like", value.toUpperCase(), "merchantId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}