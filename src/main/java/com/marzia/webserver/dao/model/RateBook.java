package com.marzia.webserver.dao.model;

import java.io.Serializable;

public class RateBook implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ratebook.sno
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private Integer sno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ratebook.medname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String medname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ratebook.medrate
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String medrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ratebook.mednumber
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private String mednumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ratebook.sno
     *
     * @return the value of ratebook.sno
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public Integer getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ratebook.sno
     *
     * @param sno the value for ratebook.sno
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setSno(Integer sno) {
        this.sno = sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ratebook.medname
     *
     * @return the value of ratebook.medname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getMedname() {
        return medname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ratebook.medname
     *
     * @param medname the value for ratebook.medname
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setMedname(String medname) {
        this.medname = medname == null ? null : medname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ratebook.medrate
     *
     * @return the value of ratebook.medrate
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getMedrate() {
        return medrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ratebook.medrate
     *
     * @param medrate the value for ratebook.medrate
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setMedrate(String medrate) {
        this.medrate = medrate == null ? null : medrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ratebook.mednumber
     *
     * @return the value of ratebook.mednumber
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public String getMednumber() {
        return mednumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ratebook.mednumber
     *
     * @param mednumber the value for ratebook.mednumber
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    public void setMednumber(String mednumber) {
        this.mednumber = mednumber == null ? null : mednumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratebook
     *
     * @mbg.generated Tue Jun 11 13:44:19 EDT 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sno=").append(sno);
        sb.append(", medname=").append(medname);
        sb.append(", medrate=").append(medrate);
        sb.append(", mednumber=").append(mednumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}