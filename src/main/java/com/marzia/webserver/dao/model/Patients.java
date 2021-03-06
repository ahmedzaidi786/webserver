package com.marzia.webserver.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Patients implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.casenumber
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private Integer casenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.firstname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.lastname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.mobile
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private Integer mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.email
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.address
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.picture
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.wordfile
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String wordfile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.barcode
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String barcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.since
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private Date since;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patients.fileno
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String fileno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patients
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.casenumber
     *
     * @return the value of patients.casenumber
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public Integer getCasenumber() {
        return casenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.casenumber
     *
     * @param casenumber the value for patients.casenumber
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setCasenumber(Integer casenumber) {
        this.casenumber = casenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.firstname
     *
     * @return the value of patients.firstname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.firstname
     *
     * @param firstname the value for patients.firstname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.lastname
     *
     * @return the value of patients.lastname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.lastname
     *
     * @param lastname the value for patients.lastname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.mobile
     *
     * @return the value of patients.mobile
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public Integer getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.mobile
     *
     * @param mobile the value for patients.mobile
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.email
     *
     * @return the value of patients.email
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.email
     *
     * @param email the value for patients.email
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.address
     *
     * @return the value of patients.address
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.address
     *
     * @param address the value for patients.address
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.picture
     *
     * @return the value of patients.picture
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.picture
     *
     * @param picture the value for patients.picture
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.wordfile
     *
     * @return the value of patients.wordfile
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getWordfile() {
        return wordfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.wordfile
     *
     * @param wordfile the value for patients.wordfile
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setWordfile(String wordfile) {
        this.wordfile = wordfile == null ? null : wordfile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.barcode
     *
     * @return the value of patients.barcode
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.barcode
     *
     * @param barcode the value for patients.barcode
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.since
     *
     * @return the value of patients.since
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public Date getSince() {
        return since;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.since
     *
     * @param since the value for patients.since
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setSince(Date since) {
        this.since = since;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patients.fileno
     *
     * @return the value of patients.fileno
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getFileno() {
        return fileno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column patients.fileno
     *
     * @param fileno the value for patients.fileno
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setFileno(String fileno) {
        this.fileno = fileno == null ? null : fileno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patients
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", casenumber=").append(casenumber);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", picture=").append(picture);
        sb.append(", wordfile=").append(wordfile);
        sb.append(", barcode=").append(barcode);
        sb.append(", since=").append(since);
        sb.append(", fileno=").append(fileno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}