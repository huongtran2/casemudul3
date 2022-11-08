package model;

import java.util.Date;

public class HoaDonChiTiet {
    private int hoadonchitietID;
    private int productID;
    private int hoadonID;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int hoadonctID, int productID, int hoadonID) {
        this.hoadonchitietID = hoadonctID;
        this.productID = productID;
        this.hoadonID = hoadonID;
    }

    public int getHoadonchitietID() {
        return hoadonchitietID;
    }

    public void setHoadonchitietID(int hoadonchitietID) {
        this.hoadonchitietID = hoadonchitietID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getHoadonID() {
        return hoadonID;
    }

    public void setHoadonID(int hoadonID) {
        this.hoadonID = hoadonID;
    }
}

