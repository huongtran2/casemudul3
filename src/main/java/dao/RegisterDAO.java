package dao;

import model.Account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
    public static boolean register(Account account){
        try {
            String sql = "insert into account value (?,?,?,?,?,?)";
            Connection connection = ConnectMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setString(2,account.getName());
            preparedStatement.setString(3, account.getPassword());
            preparedStatement.setString(4, account.getAddress());
            preparedStatement.setDate(5, (Date) account.getBirthday());
            preparedStatement.setInt(6, account.getId_role());
            preparedStatement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

}
