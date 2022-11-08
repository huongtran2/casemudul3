package dao;

import model.HoaDon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO {
    static Connection connection = ConnectMySQL.getConnection();

    public static List<HoaDon> getAll() {
        String sql = "Select * from HoaDon";
        List<HoaDon> hoaDons = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                int hoadonID = resultSet.getInt("hoadonID");
                Double total = resultSet.getDouble("total");
                Date create_day = resultSet.getDate("create_day");
                int id_user = resultSet.getInt("id_user");

                hoaDons.add(new HoaDon( hoadonID, total, create_day,id_user));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hoaDons;
    }

    public static void save(HoaDon hoaDon) {
        try {
            String sql = "INSERT INTO hoaDon(giohangID,total,create_day,id_user) VALUES (?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, hoaDon.getHoadonID());
            preparedStatement.setDouble(2, hoaDon.getTotal());
            preparedStatement.setDate(3, (Date) hoaDon.getCreate_day());
            preparedStatement.setInt(4, hoaDon.getId_user());

            System.out.println(sql);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void delete(int productID) {
        String sql = "delete from hoadon where productID = '" + productID + "'";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<HoaDon> getByType(String typeHoaDon) {
        String sql = "Select * from hoadon where  type = N'" + typeHoaDon + "'";
        List<HoaDon> hoaDons = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int hoadonID = resultSet.getInt("hoadonID");
                Double total = resultSet.getDouble("total");
                Date create_day = resultSet.getDate("create_day");
                int id_user = resultSet.getInt("id_user");

                ;
                hoaDons.add(new HoaDon(hoadonID,total,create_day,id_user));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hoaDons;
    }
}
