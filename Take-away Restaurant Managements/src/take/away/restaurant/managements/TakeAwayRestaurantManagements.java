package take.away.restaurant.managements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class TakeAwayRestaurantManagements {

    public static List address, card, order, restaurant, user, menulist;
    public static Connection connection;

    public static void main(String[] args) throws IOException {
        address = new ArrayList();
        card = new ArrayList();
        order = new ArrayList();
        restaurant = new ArrayList();
        user = new ArrayList();
        menulist = new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tarm", "root", "");
            JOptionPane.showMessageDialog(null, "Connection True!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection failed!" + e.getMessage());
        }
        new Menu().setVisible(true);
    }

    public static void add_address(int ad_id, int u_id, String u_name, String u_surname, String ad_addressline1,
            String ad_addressline2, String ad_city, String ad_state_province_region,
            int ad_zipcode, String ad_country, String u_phone_no) {
        try {
            String sql = "INSERT INTO address (ad_id,u_id ,u_name, u_surname, ad_addressline1, "
                    + "ad_addressline2, ad_city,ad_state_province_region,"
                    + "ad_zipcode,ad_country,u_phone_no) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ad_id);
            statement.setInt(2, u_id);
            statement.setString(3, u_name);
            statement.setString(4, u_surname);
            statement.setString(5, ad_addressline1);
            statement.setString(6, ad_addressline2);
            statement.setString(7, ad_city);
            statement.setString(8, ad_state_province_region);
            statement.setInt(9, ad_zipcode);
            statement.setString(10, ad_country);
            statement.setString(11, u_phone_no);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data insertion failed!" + e.getMessage());
        }
    }

    public static void edit_address(int ad_id, int u_id, String u_name, String u_surname, String ad_addressline1,
            String ad_addressline2, String ad_city, String ad_state_province_region,
            int ad_zipcode, String ad_country, String u_phone_no) {

        Address ad = null;
        Boolean found = false;
        Iterator<Address> itr = address.iterator();
        while (itr.hasNext()) {
            ad = itr.next();
            if (ad_id == ad.getAd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            ad.setAd_id(ad_id);
            ad.setU_id(u_id);
            ad.setU_name(u_name);
            ad.setU_surname(u_surname);
            ad.setAd_addressline1(ad_addressline1);
            ad.setAd_addressline2(ad_addressline2);
            ad.setAd_city(ad_city);
            ad.setAd_state_province_region(ad_state_province_region);
            ad.setAd_zipcode(ad_zipcode);
            ad.setAd_country(ad_country);
            ad.setU_phone_no(u_phone_no);
        }

        try {
            String sql = "UPDATE address SET ad_id = ?, u_id= ?, u_name= ?,u_surname= ?,ad_addressline1= ?,ad_addressline2= ?,"
                    + "ad_city=?,ad_state_province_region=?,"
                    + "ad_zipcode=?,ad_country=?,u_phone_no=? WHERE ad_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ad_id);
            statement.setInt(2, u_id);
            statement.setString(3, u_name);
            statement.setString(4, u_surname);
            statement.setString(5, ad_addressline1);
            statement.setString(6, ad_addressline2);
            statement.setString(7, ad_city);
            statement.setString(8, ad_state_province_region);
            statement.setInt(9, ad_zipcode);
            statement.setString(10, ad_country);
            statement.setString(11, u_phone_no);
            statement.setInt(12, ad_id);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data saved!" + e.getMessage());
        }

    }

    public static void add_card(int crd_id, int crd_no, String crd_fname, String crd_exp_date) {

        try {
            String sql = "INSERT INTO card (crd_id,crd_no ,crd_fname, crd_exp_date) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, crd_id);
            statement.setInt(2, crd_no);
            statement.setString(3, crd_fname);
            statement.setString(4, crd_exp_date);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data insertion failed!" + e.getMessage());
        }
    }

    public static void edit_card(int crd_id, int crd_no, String crd_fname, String crd_exp_date) {
        Card cd = null;
        Boolean found = false;
        Iterator<Card> itr = card.iterator();
        while (itr.hasNext()) {
            cd = itr.next();
            if (crd_id == cd.getCrd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            cd.setCrd_id(crd_id);
            cd.setCrd_no(crd_no);
            cd.setCrd_fname(crd_fname);
            cd.setCrd_exp_date(crd_exp_date);
        }

        try {
            String sql = "UPDATE card SET crd_id = ?, crd_no= ?, crd_fname= ?,crd_exp_date= ? WHERE crd_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, crd_id);
            statement.setInt(2, crd_no);
            statement.setString(3, crd_fname);
            statement.setString(4, crd_exp_date);
            statement.setInt(5, crd_id);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data saved!" + e.getMessage());
        }
    }

    public static void add_menulist(int menu_id, int res_id, String food_name, float food_price) {

        try {
            String sql = "INSERT INTO menulist (menu_id,res_id ,food_name, food_price) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, menu_id);
            statement.setInt(2, res_id);
            statement.setString(3, food_name);
            statement.setFloat(4, food_price);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data insertion failed!" + e.getMessage());
        }
    }

    public static void edit_menulist(int menu_id, int res_id, String food_name, float food_price) {
        Menulist ml = null;
        Boolean found = false;
        Iterator<Menulist> itr = menulist.iterator();
        while (itr.hasNext()) {
            ml = itr.next();
            if (menu_id == ml.getMenu_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            ml.setMenu_id(menu_id);
            ml.setRes_id(res_id);
            ml.setFood_name(food_name);
            ml.setFood_price(food_price);

        }

        try {
            String sql = "UPDATE menulist SET menu_id = ?, res_id= ?, food_name= ?,food_price= ? WHERE menu_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, menu_id);
            statement.setInt(2, res_id);
            statement.setString(3, food_name);
            statement.setFloat(4, food_price);
            statement.setInt(5, menu_id);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data saved!" + e.getMessage());
        }
    }

    public static void add_order(int ord_id, int res_id, int u_id, int ad_id, int crd_id, float food_price, int food_quantity, float total_price) {

        try {
            String sql = "INSERT INTO orders (ord_id,res_id ,u_id, ad_id,crd_id,food_price,food_quantity,total_price) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ord_id);
            statement.setInt(2, res_id);
            statement.setInt(3, u_id);
            statement.setInt(4, ad_id);
            statement.setInt(5, crd_id);
            statement.setFloat(6, food_price);
            statement.setInt(7, food_quantity);
            statement.setFloat(8, total_price);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data insertion failed!" + e.getMessage());
        }
    }

    public static void edit_order(int ord_id, int res_id, int u_id, int ad_id, int crd_id, float food_price, int food_quantity, float total_price) {
        Order or = null;
        Boolean found = false;
        Iterator<Order> itr = order.iterator();
        while (itr.hasNext()) {
            or = itr.next();
            if (ord_id == or.getOrd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            or.setOrd_id(ord_id);
            or.setRes_id(res_id);
            or.setU_id(u_id);
            or.setAd_id(ad_id);
            or.setCrd_id(crd_id);
            or.setFood_price(food_price);
            or.setFood_quantity(food_quantity);
            or.setTotal_price(total_price);
        }

        try {
            String sql = "UPDATE orders SET ord_id = ?, res_id= ?, u_id= ?,ad_id= ?, crd_id=? ,food_price=?,food_quantity=?,total_price=?WHERE ord_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ord_id);
            statement.setInt(2, res_id);
            statement.setInt(3, u_id);
            statement.setInt(4, ad_id);
            statement.setInt(5, crd_id);
            statement.setFloat(6, food_price);
            statement.setInt(7, food_quantity);
            statement.setFloat(8, total_price);
            statement.setInt(9, ord_id);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data saved!" + e.getMessage());
        }
    }

    public static void add_restaurant(int res_id, String res_name) {

        try {
            String sql = "INSERT INTO restaurant (res_id,res_name) VALUES (?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, res_id);
            statement.setString(2, res_name);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data insertion failed!" + e.getMessage());
        }
    }

    public static void edit_restaurant(int res_id, String res_name) {
        Restaurant rs = null;
        Boolean found = false;
        Iterator<Restaurant> itr = restaurant.iterator();
        while (itr.hasNext()) {
            rs = itr.next();
            if (res_id == rs.getRes_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            rs.setRes_id(res_id);
            rs.setRes_name(res_name);

        }

        try {
            String sql = "UPDATE restaurant SET res_id=?,res_name=? WHERE res_id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, res_id);
            statement.setString(2, res_name);
            statement.setInt(3, res_id);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data saved!" + e.getMessage());
        }
    }

    public static void add_user(int u_id, String u_name, String u_surname, String u_phone_no, String u_birthdate, String u_email) {
        try {
            String sql = "INSERT INTO user (u_id,u_name,u_surname,u_phone_no,u_birthdate,u_email) VALUES (?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, u_id);
            statement.setString(2, u_name);
            statement.setString(3, u_surname);
            statement.setString(4, u_phone_no);
            statement.setString(5, u_birthdate);
            statement.setString(6, u_email);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data insertion failed!" + e.getMessage());
        }
    }

    public static void edit_user(int u_id, String u_name, String u_surname, String u_phone_no, String u_birthdate, String u_email) {
        User u = null;
        Boolean found = false;
        Iterator<User> itr = user.iterator();
        while (itr.hasNext()) {
            u = itr.next();
            if (u_id == u.getU_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            u.setU_id(u_id);
            u.setU_name(u_name);
            u.setU_surname(u_surname);
            u.setU_phone_no(u_phone_no);
            u.setU_birthdate(u_birthdate);
            u.setU_email(u_email);
        }

        try {
            String sql = "UPDATE user SET u_id = ?, u_name= ?,u_surname=?,u_phone_no=?,u_birthdate=?,u_email=? WHERE u_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, u_id);
            statement.setString(2, u_name);
            statement.setString(3, u_surname);
            statement.setString(4, u_phone_no);
            statement.setString(5, u_birthdate);
            statement.setString(6, u_email);
            statement.setInt(7, u_id);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data saved!" + e.getMessage());
        }
    }

    public static void draw_line(int num) {
        String ln = "";
        for (int i = 0; i < num; i++) {
            ln += "=";
        }
        System.out.printf("\n" + ln);
    }

    public static void backup_address() throws IOException {
        File outfile = new File("address.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
        outObjectStream.writeObject(address);
        outObjectStream.close();
    }

    public static void backup_card() throws IOException {
        File outfile = new File("card.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
        outObjectStream.writeObject(card);
        outObjectStream.close();
    }

    public static void backup_order() throws IOException {
        File outfile = new File("order.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
        outObjectStream.writeObject(order);
        outObjectStream.close();
    }

    public static void backup_restaurant() throws IOException {
        File outfile = new File("restaurant.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
        outObjectStream.writeObject(restaurant);
        outObjectStream.close();
    }

    public static void backup_user() throws IOException {
        File outfile = new File("user.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
        outObjectStream.writeObject(user);
        outObjectStream.close();
    }

    public static void retrieve_address() throws IOException, ClassNotFoundException {
        File infile = new File("address.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
        address = (ArrayList) inObjectStream.readObject();
        inObjectStream.close();
    }

    public static void retrieve_card() throws IOException, ClassNotFoundException {
        File infile = new File("card.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
        card = (ArrayList) inObjectStream.readObject();
        inObjectStream.close();
    }

    public static void retrieve_order() throws IOException, ClassNotFoundException {
        File infile = new File("order.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
        order = (ArrayList) inObjectStream.readObject();
        inObjectStream.close();
    }

    public static void retrieve_restaurant() throws IOException, ClassNotFoundException {
        File infile = new File("restaurant.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
        restaurant = (ArrayList) inObjectStream.readObject();
        inObjectStream.close();
    }

    public static void retrieve_user() throws IOException, ClassNotFoundException {
        File infile = new File("user.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
        user = (ArrayList) inObjectStream.readObject();
        inObjectStream.close();
    }
}
