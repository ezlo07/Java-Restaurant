/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package take.away.restaurant.managements;

/**
 *
 * @author nesri
 */
public class Menulist {
    private int menu_id;
    private int res_id;
    private String food_name;
    private Float food_price;

    public Menulist(int menu_id, int res_id, String food_name, Float food_price) {
        this.menu_id = menu_id;
        this.res_id = res_id;
        this.food_name = food_name;
        this.food_price = food_price;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public Float getFood_price() {
        return food_price;
    }

    public void setFood_price(Float food_price) {
        this.food_price = food_price;
    }
    
    
    
    
}
