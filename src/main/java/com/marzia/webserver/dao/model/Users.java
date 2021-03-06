package com.marzia.webserver.dao.model;

import java.io.Serializable;

public class Users implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_id
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.enabled
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private Integer enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_id
     *
     * @return the value of users.user_id
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_id
     *
     * @param userId the value for users.user_id
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.enabled
     *
     * @return the value of users.enabled
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.enabled
     *
     * @param enabled the value for users.enabled
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}