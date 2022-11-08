package model;

import java.util.Date;

public class HoaDon {
    private int hoadonID;
    private Double total;
    private Date create_day;
    private int id_user;

    public HoaDon() {
    }

    public HoaDon(int hoadonID, Double total, Date create_day, int id_user) {
        this.hoadonID = hoadonID;
        this.total = total;
        this.create_day = create_day;
        this.id_user = id_user;
    }

    public int getHoadonID() {
        return hoadonID;
    }

    public void setHoadonID(int hoadonID) {
        this.hoadonID = hoadonID;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getCreate_day() {
        return create_day;
    }

    public void setCreate_day(Date create_day) {
        this.create_day = create_day;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
