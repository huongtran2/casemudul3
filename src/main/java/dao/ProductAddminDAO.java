package dao;

import model.ProductAddmin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductAddminDAO {

    static Connection connection = ConnectMySQL.getConnection();

    public static List<ProductAddmin> getAll() {
        String sql = "Select * from productAddmin";
        List<ProductAddmin> productAddmins = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int productID = resultSet.getInt("productID");
                String username = resultSet.getString("username");
                String type = resultSet.getString("type");
                String img = resultSet.getString("img");
                Double total = resultSet.getDouble("total");
                productAddmins.add(new ProductAddmin(productID, username, type, img, total));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productAddmins;
    }

    public static void save(ProductAddmin productAddmin) {
        try {
            String sql = "INSERT INTO `demo_login_mudule3`.`productaddmin` (`productID`, `username`, `type`, `img`, `total`) VALUES (?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productAddmin.getProductID());
            preparedStatement.setString(2, productAddmin.getUsername());
            preparedStatement.setString(3, productAddmin.getType());
            preparedStatement.setString(4, productAddmin.getImg());
            preparedStatement.setDouble(5, productAddmin.getTotal());
            System.out.println(sql);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void delete(int productID) {
        String sql = "delete from productaddmin where productID = '" + productID + "'";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ProductAddmin getById(int productID) {
        String sql = "select * from productAddmin where productID = ?";
        ProductAddmin productAddmin = null;
        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int productID1 = resultSet.getInt("productID");
                String username = resultSet.getString("username");
                String type = resultSet.getString("type");
                String img = resultSet.getString("img");
                Double total = resultSet.getDouble("total");
                productAddmin = new ProductAddmin(productID1, username, type, img, total);
            }
            return productAddmin;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static List<ProductAddmin> getByType(String typeProduct) {
        String sql = "Select * from productAddmin where  type = N'" + typeProduct + "'";
        List<ProductAddmin> productAddmins = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int productID = resultSet.getInt("productID");
                String username = resultSet.getString("username");
                String type = resultSet.getString("type");
                String img = resultSet.getString("img");
                Double total = resultSet.getDouble("total");
                productAddmins.add(new ProductAddmin(productID,username, type, img, total));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productAddmins;
    }
}


