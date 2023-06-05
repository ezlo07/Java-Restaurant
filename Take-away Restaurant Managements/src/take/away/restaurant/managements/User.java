package take.away.restaurant.managements;

import java.io.Serializable;

public class User implements Serializable {
    private int u_id;
    private String u_name;
    private String u_surname;
    private String u_phone_no;
    private String u_birthdate;
    private String u_email;

    public User(int u_id, String u_name, String u_surname, String u_phone_no, String u_birthdate, String u_email) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_surname = u_surname;
        this.u_phone_no = u_phone_no;
        this.u_birthdate = u_birthdate;
        this.u_email = u_email;
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

    public String getU_phone_no() {
        return u_phone_no;
    }

    public void setU_phone_no(String u_phone_no) {
        this.u_phone_no = u_phone_no;
    }

    public String getU_birthdate() {
        return u_birthdate;
    }

    public void setU_birthdate(String u_birthdate) {
        this.u_birthdate = u_birthdate;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

}
