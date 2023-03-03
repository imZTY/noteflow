package com.zty.noteflow.core.facade.DO.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountSecretDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountSecretDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdIsNull() {
            addCriterion("pipeline_id is null");
            return (Criteria) this;
        }

        public Criteria andPipelineIdIsNotNull() {
            addCriterion("pipeline_id is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineIdEqualTo(Integer value) {
            addCriterion("pipeline_id =", value, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdNotEqualTo(Integer value) {
            addCriterion("pipeline_id <>", value, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdGreaterThan(Integer value) {
            addCriterion("pipeline_id >", value, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pipeline_id >=", value, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdLessThan(Integer value) {
            addCriterion("pipeline_id <", value, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdLessThanOrEqualTo(Integer value) {
            addCriterion("pipeline_id <=", value, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdIn(List<Integer> values) {
            addCriterion("pipeline_id in", values, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdNotIn(List<Integer> values) {
            addCriterion("pipeline_id not in", values, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdBetween(Integer value1, Integer value2) {
            addCriterion("pipeline_id between", value1, value2, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andPipelineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pipeline_id not between", value1, value2, "pipelineId");
            return (Criteria) this;
        }

        public Criteria andConfigTypeIsNull() {
            addCriterion("config_type is null");
            return (Criteria) this;
        }

        public Criteria andConfigTypeIsNotNull() {
            addCriterion("config_type is not null");
            return (Criteria) this;
        }

        public Criteria andConfigTypeEqualTo(Integer value) {
            addCriterion("config_type =", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotEqualTo(Integer value) {
            addCriterion("config_type <>", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeGreaterThan(Integer value) {
            addCriterion("config_type >", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("config_type >=", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeLessThan(Integer value) {
            addCriterion("config_type <", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeLessThanOrEqualTo(Integer value) {
            addCriterion("config_type <=", value, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeIn(List<Integer> values) {
            addCriterion("config_type in", values, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotIn(List<Integer> values) {
            addCriterion("config_type not in", values, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeBetween(Integer value1, Integer value2) {
            addCriterion("config_type between", value1, value2, "configType");
            return (Criteria) this;
        }

        public Criteria andConfigTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("config_type not between", value1, value2, "configType");
            return (Criteria) this;
        }

        public Criteria andSourceMaskIsNull() {
            addCriterion("source_mask is null");
            return (Criteria) this;
        }

        public Criteria andSourceMaskIsNotNull() {
            addCriterion("source_mask is not null");
            return (Criteria) this;
        }

        public Criteria andSourceMaskEqualTo(Integer value) {
            addCriterion("source_mask =", value, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskNotEqualTo(Integer value) {
            addCriterion("source_mask <>", value, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskGreaterThan(Integer value) {
            addCriterion("source_mask >", value, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_mask >=", value, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskLessThan(Integer value) {
            addCriterion("source_mask <", value, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskLessThanOrEqualTo(Integer value) {
            addCriterion("source_mask <=", value, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskIn(List<Integer> values) {
            addCriterion("source_mask in", values, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskNotIn(List<Integer> values) {
            addCriterion("source_mask not in", values, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskBetween(Integer value1, Integer value2) {
            addCriterion("source_mask between", value1, value2, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andSourceMaskNotBetween(Integer value1, Integer value2) {
            addCriterion("source_mask not between", value1, value2, "sourceMask");
            return (Criteria) this;
        }

        public Criteria andConfigJsonIsNull() {
            addCriterion("config_json is null");
            return (Criteria) this;
        }

        public Criteria andConfigJsonIsNotNull() {
            addCriterion("config_json is not null");
            return (Criteria) this;
        }

        public Criteria andConfigJsonEqualTo(String value) {
            addCriterion("config_json =", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonNotEqualTo(String value) {
            addCriterion("config_json <>", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonGreaterThan(String value) {
            addCriterion("config_json >", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonGreaterThanOrEqualTo(String value) {
            addCriterion("config_json >=", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonLessThan(String value) {
            addCriterion("config_json <", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonLessThanOrEqualTo(String value) {
            addCriterion("config_json <=", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonLike(String value) {
            addCriterion("config_json like", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonNotLike(String value) {
            addCriterion("config_json not like", value, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonIn(List<String> values) {
            addCriterion("config_json in", values, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonNotIn(List<String> values) {
            addCriterion("config_json not in", values, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonBetween(String value1, String value2) {
            addCriterion("config_json between", value1, value2, "configJson");
            return (Criteria) this;
        }

        public Criteria andConfigJsonNotBetween(String value1, String value2) {
            addCriterion("config_json not between", value1, value2, "configJson");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andRsapublicIsNull() {
            addCriterion("rsaPublic is null");
            return (Criteria) this;
        }

        public Criteria andRsapublicIsNotNull() {
            addCriterion("rsaPublic is not null");
            return (Criteria) this;
        }

        public Criteria andRsapublicEqualTo(String value) {
            addCriterion("rsaPublic =", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicNotEqualTo(String value) {
            addCriterion("rsaPublic <>", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicGreaterThan(String value) {
            addCriterion("rsaPublic >", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicGreaterThanOrEqualTo(String value) {
            addCriterion("rsaPublic >=", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicLessThan(String value) {
            addCriterion("rsaPublic <", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicLessThanOrEqualTo(String value) {
            addCriterion("rsaPublic <=", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicLike(String value) {
            addCriterion("rsaPublic like", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicNotLike(String value) {
            addCriterion("rsaPublic not like", value, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicIn(List<String> values) {
            addCriterion("rsaPublic in", values, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicNotIn(List<String> values) {
            addCriterion("rsaPublic not in", values, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicBetween(String value1, String value2) {
            addCriterion("rsaPublic between", value1, value2, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsapublicNotBetween(String value1, String value2) {
            addCriterion("rsaPublic not between", value1, value2, "rsapublic");
            return (Criteria) this;
        }

        public Criteria andRsaprivateIsNull() {
            addCriterion("rsaPrivate is null");
            return (Criteria) this;
        }

        public Criteria andRsaprivateIsNotNull() {
            addCriterion("rsaPrivate is not null");
            return (Criteria) this;
        }

        public Criteria andRsaprivateEqualTo(String value) {
            addCriterion("rsaPrivate =", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateNotEqualTo(String value) {
            addCriterion("rsaPrivate <>", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateGreaterThan(String value) {
            addCriterion("rsaPrivate >", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateGreaterThanOrEqualTo(String value) {
            addCriterion("rsaPrivate >=", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateLessThan(String value) {
            addCriterion("rsaPrivate <", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateLessThanOrEqualTo(String value) {
            addCriterion("rsaPrivate <=", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateLike(String value) {
            addCriterion("rsaPrivate like", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateNotLike(String value) {
            addCriterion("rsaPrivate not like", value, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateIn(List<String> values) {
            addCriterion("rsaPrivate in", values, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateNotIn(List<String> values) {
            addCriterion("rsaPrivate not in", values, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateBetween(String value1, String value2) {
            addCriterion("rsaPrivate between", value1, value2, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andRsaprivateNotBetween(String value1, String value2) {
            addCriterion("rsaPrivate not between", value1, value2, "rsaprivate");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Byte value) {
            addCriterion("disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Byte value) {
            addCriterion("disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Byte value) {
            addCriterion("disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Byte value) {
            addCriterion("disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Byte value) {
            addCriterion("disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Byte> values) {
            addCriterion("disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Byte> values) {
            addCriterion("disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Byte value1, Byte value2) {
            addCriterion("disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Byte value1, Byte value2) {
            addCriterion("disabled not between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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