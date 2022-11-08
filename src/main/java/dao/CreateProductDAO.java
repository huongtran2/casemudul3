package dao;

import model.ProductAddmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateProductDAO {
    public static boolean createProduct(ProductAddmin productAddmin) {
        try {
            String sql = "insert into productAddmin value (?,?,?,?,?)";
            Connection connection = ConnectMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productAddmin.getProductID());
            preparedStatement.setString(2, productAddmin.getUsername());
            preparedStatement.setString(3, productAddmin.getType());
            preparedStatement.setString(4, productAddmin.getImg());
            preparedStatement.setDouble(5, productAddmin.getTotal());
            preparedStatement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }
}
