package service;

import dao.HoaDonDAO;
import dao.ProductAddminDAO;
import model.HoaDon;

import java.util.List;

public class HoaDonService {
    public static List<HoaDon> hoaDons = HoaDonDAO.getAll();



    public static void add(HoaDon hoaDon) {
        hoaDons.add(hoaDon);
        HoaDonDAO.save(hoaDon);
    }

    public static boolean checkid(int hoadonID) {
        for (int i = 0; i < hoaDons.size(); i++) {
            if (hoaDons.get(i).getHoadonID() == hoadonID) {
                return false;
            }
        }
        return true;
    }
    public static void edit ( int productID, HoaDon hoaDon){
        for (int i = 0; i < hoaDons.size(); i++) {
            if (hoaDons.get(i).getHoadonID() == productID) {
                hoaDons.set(i, hoaDon);
            }
        }
    }

    public static void delete ( int productID){
        for (int i = 0; i < hoaDons.size(); i++) {
            if (hoaDons.get(i).getHoadonID() == productID) {
                hoaDons.remove(i);
            }
        }
        ProductAddminDAO.delete(productID);
    }

    public static void tamtinh(int productID){
        int tamtinh;

    }
}
