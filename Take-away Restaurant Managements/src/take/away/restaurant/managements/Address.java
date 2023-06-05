/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.away.restaurant.managements;

import java.io.Serializable;

/**
 *
 * @author nesri
 */
public class Address implements Serializable{
    private int ad_id;
    private int u_id;
    private String u_name;
    private String u_surname;
    private String ad_addressline1;
    private String ad_addressline2;
    private String ad_city;
    private String ad_state_province_region;
    private int    ad_zipcode;
    private String ad_country;
    private String u_phone_no;

    public Address(int ad_id, int u_id, String u_name, String u_surname, String ad_addressline1, String ad_addressline2, String ad_city, String ad_state_province_region, int ad_zipcode, String ad_country, String u_phone_no) {
        this.ad_id = ad_id;
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_surname = u_surname;
        this.ad_addressline1 = ad_addressline1;
        this.ad_addressline2 = ad_addressline2;
        this.ad_city = ad_city;
        this.ad_state_province_region = ad_state_province_region;
        this.ad_zipcode = ad_zipcode;
        this.ad_country = ad_country;
        this.u_phone_no = u_phone_no;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_surname() {
        return u_surname;
    }

    public void setU_surname(String u_surname) {
        this.u_surname = u_surname;
    }

    public String getAd_addressline1() {
        return ad_addressline1;
    }

    public void setAd_addressline1(String ad_addressline1) {
        this.ad_addressline1 = ad_addressline1;
    }

    public String getAd_addressline2() {
        return ad_addressline2;
    }

    public void setAd_addressline2(String ad_addressline2) {
        this.ad_addressline2 = ad_addressline2;
    }

    public String getAd_city() {
        return ad_city;
    }

    public void setAd_city(String ad_city) {
        this.ad_city = ad_city;
    }

    public String getAd_state_province_region() {
        return ad_state_province_region;
    }

    public void setAd_state_province_region(String ad_state_province_region) {
        this.ad_state_province_region = ad_state_province_region;
    }

    public int getAd_zipcode() {
        return ad_zipcode;
    }

    public void setAd_zipcode(int ad_zipcode) {
        this.ad_zipcode = ad_zipcode;
    }

    public String getAd_country() {
        return ad_country;
    }

    public void setAd_country(String ad_country) {
        this.ad_country = ad_country;
    }

    public String getU_phone_no() {
        return u_phone_no;
    }

    public void setU_phone_no(String u_phone_no) {
        this.u_phone_no = u_phone_no;
    }

    
    
}
