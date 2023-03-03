package com.zty.noteflow.core.facade.DO.examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PipelineConfigDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipelineConfigDOExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeIsNull() {
            addCriterion("pipeline_type is null");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeIsNotNull() {
            addCriterion("pipeline_type is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeEqualTo(Integer value) {
            addCriterion("pipeline_type =", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotEqualTo(Integer value) {
            addCriterion("pipeline_type <>", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeGreaterThan(Integer value) {
            addCriterion("pipeline_type >", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pipeline_type >=", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeLessThan(Integer value) {
            addCriterion("pipeline_type <", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pipeline_type <=", value, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeIn(List<Integer> values) {
            addCriterion("pipeline_type in", values, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotIn(List<Integer> values) {
            addCriterion("pipeline_type not in", values, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeBetween(Integer value1, Integer value2) {
            addCriterion("pipeline_type between", value1, value2, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPipelineTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pipeline_type not between", value1, value2, "pipelineType");
            return (Criteria) this;
        }

        public Criteria andPullerMaskIsNull() {
            addCriterion("puller_mask is null");
            return (Criteria) this;
        }

        public Criteria andPullerMaskIsNotNull() {
            addCriterion("puller_mask is not null");
            return (Criteria) this;
        }

        public Criteria andPullerMaskEqualTo(Integer value) {
            addCriterion("puller_mask =", value, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskNotEqualTo(Integer value) {
            addCriterion("puller_mask <>", value, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskGreaterThan(Integer value) {
            addCriterion("puller_mask >", value, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("puller_mask >=", value, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskLessThan(Integer value) {
            addCriterion("puller_mask <", value, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskLessThanOrEqualTo(Integer value) {
            addCriterion("puller_mask <=", value, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskIn(List<Integer> values) {
            addCriterion("puller_mask in", values, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskNotIn(List<Integer> values) {
            addCriterion("puller_mask not in", values, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskBetween(Integer value1, Integer value2) {
            addCriterion("puller_mask between", value1, value2, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPullerMaskNotBetween(Integer value1, Integer value2) {
            addCriterion("puller_mask not between", value1, value2, "pullerMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskIsNull() {
            addCriterion("pusher_mask is null");
            return (Criteria) this;
        }

        public Criteria andPusherMaskIsNotNull() {
            addCriterion("pusher_mask is not null");
            return (Criteria) this;
        }

        public Criteria andPusherMaskEqualTo(Integer value) {
            addCriterion("pusher_mask =", value, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskNotEqualTo(Integer value) {
            addCriterion("pusher_mask <>", value, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskGreaterThan(Integer value) {
            addCriterion("pusher_mask >", value, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("pusher_mask >=", value, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskLessThan(Integer value) {
            addCriterion("pusher_mask <", value, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskLessThanOrEqualTo(Integer value) {
            addCriterion("pusher_mask <=", value, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskIn(List<Integer> values) {
            addCriterion("pusher_mask in", values, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskNotIn(List<Integer> values) {
            addCriterion("pusher_mask not in", values, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskBetween(Integer value1, Integer value2) {
            addCriterion("pusher_mask between", value1, value2, "pusherMask");
            return (Criteria) this;
        }

        public Criteria andPusherMaskNotBetween(Integer value1, Integer value2) {
            addCriterion("pusher_mask not between", value1, value2, "pusherMask");
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