package dao;

import model.HoaDonChiTiet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietDao {
    public class GioHangDao {
        static Connection connection = ConnectMySQL.getConnection();
        public static List<HoaDonChiTiet> getAll(){
            String sql = "Select * from hoadonchitiet";
            List<HoaDonChiTiet> hoaDons = new ArrayList<>();
            try {
                // tạo cái xe để đưa câu lệnh sql qua CSDL
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    int hoadonchitietID = resultSet.getInt("hoadonchitietID");
                    int productID = resultSet.getInt("productID");
                    int hoadonID = resultSet.getInt("hoadonID");
                    hoaDons.add(new HoaDonChiTiet(hoadonchitietID,productID,hoadonID));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return hoaDons;
        }

        public static void save(HoaDonChiTiet hoaDon){
            try {
                String sql = "INSERT INTO `demo_login_mudule3`.`hoadonchitiet` (`hoadonchitietID`,`productID`,`hoadonID`) VALUES (?,?,?);";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,hoaDon.getHoadonchitietID());
                preparedStatement.setInt(2,hoaDon.getProductID());
                preparedStatement.setInt(3,hoaDon.getHoadonID());


                System.out.println(sql);
                preparedStatement.execute();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


//        public static void delete(int giohangID) {
//            String sql = "delete from giohang where giohangID = '" + giohangID +"'";
//            try {
//                Statement statement = connection.createStatement();
//                statement.execute(sql);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

//        public static List<GioHang> getByType(String typeGioHang){
//            String sql = "Select * from giohang where  type = N'" + typeGioHang + "'";
//            List<GioHang> gioHangs = new ArrayList<>();
//            try {
//                // tạo cái xe để đưa câu lệnh sql qua CSDL
//                Statement statement = connection.createStatement();
//                ResultSet resultSet = statement.executeQuery(sql);
//
//                while (resultSet.next()){
//                    int giohangID = resultSet.getInt("giohangID");
//                    String img = resultSet.getString("img");
//                    String name = resultSet.getString("name");
//                    int price = resultSet.getInt("price");
//                    int soluong = resultSet.getInt("soluong");
//                    gioHangs.add(new GioHang(giohangID,img,name,price, soluong));
//                }
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            return gioHangs;
//        }
    }



}
