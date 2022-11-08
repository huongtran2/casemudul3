package controller;

import dao.RegisterDAO;
import model.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;


@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        Date birthday = Date.valueOf(req.getParameter("birthday"));
        int id_role = Integer.parseInt(req.getParameter("id_role"));
        Account account = new Account(id,username,password,address,birthday,id_role);

        if(RegisterDAO.register(account) == true) {
            resp.sendRedirect("/login.jsp");
        }else resp.sendRedirect("/register.jsp");

        }
    }

