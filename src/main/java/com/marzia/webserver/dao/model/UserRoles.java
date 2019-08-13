package com.marzia.webserver.dao.model;

import java.io.Serializable;

public class UserRoles implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_roles.user_role_id
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    private Integer userRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_roles.user_id
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_roles.role
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_roles
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_roles.user_role_id
     *
     * @return the value of user_roles.user_role_id
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_roles.user_role_id
     *
     * @param userRoleId the value for user_roles.user_role_id
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_roles.user_id
     *
     * @return the value of user_roles.user_id
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_roles.user_id
     *
     * @param userId the value for user_roles.user_id
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_roles.role
     *
     * @return the value of user_roles.role
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_roles.role
     *
     * @param role the value for user_roles.role
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roles
     *
     * @mbg.generated Tue Jul 02 11:26:47 EDT 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleId=").append(userRoleId);
        sb.append(", userId=").append(userId);
        sb.append(", role=").append(role);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}