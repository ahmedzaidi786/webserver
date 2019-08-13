package com.marzia.webserver.dao.model;

import java.util.ArrayList;
import java.util.List;

public class RateBookExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public RateBookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andMednameIsNull() {
            addCriterion("medname is null");
            return (Criteria) this;
        }

        public Criteria andMednameIsNotNull() {
            addCriterion("medname is not null");
            return (Criteria) this;
        }

        public Criteria andMednameEqualTo(String value) {
            addCriterion("medname =", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotEqualTo(String value) {
            addCriterion("medname <>", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameGreaterThan(String value) {
            addCriterion("medname >", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameGreaterThanOrEqualTo(String value) {
            addCriterion("medname >=", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameLessThan(String value) {
            addCriterion("medname <", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameLessThanOrEqualTo(String value) {
            addCriterion("medname <=", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameLike(String value) {
            addCriterion("medname like", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotLike(String value) {
            addCriterion("medname not like", value, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameIn(List<String> values) {
            addCriterion("medname in", values, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotIn(List<String> values) {
            addCriterion("medname not in", values, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameBetween(String value1, String value2) {
            addCriterion("medname between", value1, value2, "medname");
            return (Criteria) this;
        }

        public Criteria andMednameNotBetween(String value1, String value2) {
            addCriterion("medname not between", value1, value2, "medname");
            return (Criteria) this;
        }

        public Criteria andMedrateIsNull() {
            addCriterion("medrate is null");
            return (Criteria) this;
        }

        public Criteria andMedrateIsNotNull() {
            addCriterion("medrate is not null");
            return (Criteria) this;
        }

        public Criteria andMedrateEqualTo(String value) {
            addCriterion("medrate =", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateNotEqualTo(String value) {
            addCriterion("medrate <>", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateGreaterThan(String value) {
            addCriterion("medrate >", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateGreaterThanOrEqualTo(String value) {
            addCriterion("medrate >=", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateLessThan(String value) {
            addCriterion("medrate <", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateLessThanOrEqualTo(String value) {
            addCriterion("medrate <=", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateLike(String value) {
            addCriterion("medrate like", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateNotLike(String value) {
            addCriterion("medrate not like", value, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateIn(List<String> values) {
            addCriterion("medrate in", values, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateNotIn(List<String> values) {
            addCriterion("medrate not in", values, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateBetween(String value1, String value2) {
            addCriterion("medrate between", value1, value2, "medrate");
            return (Criteria) this;
        }

        public Criteria andMedrateNotBetween(String value1, String value2) {
            addCriterion("medrate not between", value1, value2, "medrate");
            return (Criteria) this;
        }

        public Criteria andMednumberIsNull() {
            addCriterion("mednumber is null");
            return (Criteria) this;
        }

        public Criteria andMednumberIsNotNull() {
            addCriterion("mednumber is not null");
            return (Criteria) this;
        }

        public Criteria andMednumberEqualTo(String value) {
            addCriterion("mednumber =", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotEqualTo(String value) {
            addCriterion("mednumber <>", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberGreaterThan(String value) {
            addCriterion("mednumber >", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberGreaterThanOrEqualTo(String value) {
            addCriterion("mednumber >=", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberLessThan(String value) {
            addCriterion("mednumber <", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberLessThanOrEqualTo(String value) {
            addCriterion("mednumber <=", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberLike(String value) {
            addCriterion("mednumber like", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotLike(String value) {
            addCriterion("mednumber not like", value, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberIn(List<String> values) {
            addCriterion("mednumber in", values, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotIn(List<String> values) {
            addCriterion("mednumber not in", values, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberBetween(String value1, String value2) {
            addCriterion("mednumber between", value1, value2, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednumberNotBetween(String value1, String value2) {
            addCriterion("mednumber not between", value1, value2, "mednumber");
            return (Criteria) this;
        }

        public Criteria andMednameLikeInsensitive(String value) {
            addCriterion("upper(medname) like", value.toUpperCase(), "medname");
            return (Criteria) this;
        }

        public Criteria andMedrateLikeInsensitive(String value) {
            addCriterion("upper(medrate) like", value.toUpperCase(), "medrate");
            return (Criteria) this;
        }

        public Criteria andMednumberLikeInsensitive(String value) {
            addCriterion("upper(mednumber) like", value.toUpperCase(), "mednumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ratebook
     *
     * @mbg.generated do_not_delete_during_merge Tue Jul 02 11:26:47 EDT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
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