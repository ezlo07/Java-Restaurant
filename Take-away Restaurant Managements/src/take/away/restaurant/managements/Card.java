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
public class Card implements Serializable{
   private int crd_id;
   private int crd_no;
   private String crd_fname;
   private String crd_exp_date;

    public Card(int crd_id, int crd_no, String crd_fname, String crd_exp_date) {
        this.crd_id = crd_id;
        this.crd_no = crd_no;
        this.crd_fname = crd_fname;
        this.crd_exp_date = crd_exp_date;
    }

    public int getCrd_id() {
        return crd_id;
    }

    public void setCrd_id(int crd_id) {
        this.crd_id = crd_id;
    }

    public int getCrd_no() {
        return crd_no;
    }

    public void setCrd_no(int crd_no) {
        this.crd_no = crd_no;
    }

    public String getCrd_fname() {
        return crd_fname;
    }

    public void setCrd_fname(String crd_fname) {
        this.crd_fname = crd_fname;
    }

    public String getCrd_exp_date() {
        return crd_exp_date;
    }

    public void setCrd_exp_date(String crd_exp_date) {
        this.crd_exp_date = crd_exp_date;
    }
   
}
