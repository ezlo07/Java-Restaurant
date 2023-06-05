/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.away.restaurant.managements;

import java.io.Serializable;


public class Restaurant implements Serializable{
    private int res_id;
    private String res_name;

    public Restaurant(int res_id, String res_name) {
        this.res_id = res_id;
        this.res_name = res_name;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }
    
    

   
    
}
