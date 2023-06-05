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
public class Order implements Serializable{
    private int ord_id;
    private int res_id;
    private int u_id;
    private int ad_id;
    private int crd_id;
    private float food_price;
    private int food_quantity;
    private float total_price;

    public Order(int ord_id, int res_id, int u_id, int ad_id, int crd_id, float food_price, int food_quantity, float total_price) {
        this.ord_id = ord_id;
        this.res_id = res_id;
        this.u_id = u_id;
        this.ad_id = ad_id;
        this.crd_id = crd_id;
        this.food_price = food_price;
        this.food_quantity = food_quantity;
        this.total_price = total_price;
    }

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public int getCrd_id() {
        return crd_id;
    }

    public void setCrd_id(int crd_id) {
        this.crd_id = crd_id;
    }

    public float getFood_price() {
        return food_price;
    }

    public void setFood_price(float food_price) {
        this.food_price = food_price;
    }

    public int getFood_quantity() {
        return food_quantity;
    }

    public void setFood_quantity(int food_quantity) {
        this.food_quantity = food_quantity;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    

    
}
