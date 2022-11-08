package controller;

import dao.ProductAddminDAO;
import model.Account;
import model.ProductAddmin;
import service.HoaDonService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "PdUserServlet", value = "/PdUserServlet")
public class PdUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("sanphams", HoaDonService.hoaDons);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/hoaDonChiTiet.jsp");
        dispatcher.forward(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int productID = Integer.parseInt(request.getParameter("productID");
//        String username = request.getParameter("username");
//        String type = request.getParameter("type");
//        String img = request.getParameter("img");
//        Double total = Double.valueOf(request.getParameter("total"));
//        Account account = new Account(productID,username,type,img,total);
//        response.sendRedirect("productUser.jsp");
//        String type = request.getParameter("type");
//        System.out.println("pd user" + type);
//        if (type.equals("A1")) {
//            List<ProductAddmin> list = ProductAddminDAO.getByType("A1");
//            request.setAttribute("sanphams", list);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("productUser.jsp");
//            dispatcher.forward(request, response);
//        }
//        if (type.equals("A2")) {
//            List<ProductAddmin> list = ProductAddminDAO.getByType("A2");
//            request.setAttribute("sanphams", list);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("productUser.jsp");
//            dispatcher.forward(request, response);
//        }
//        if (type.equals("A3")) {
//            List<ProductAddmin> list = ProductAddminDAO.getByType("A3");
//            request.setAttribute("sanphams", list);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("productUser.jsp");
//            dispatcher.forward(request, response);
//        }
//    }
//}
    }
