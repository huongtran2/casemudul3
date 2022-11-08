package controller;

import dao.ProductAddminDAO;
import model.ProductAddmin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hoadonchitiet")
public class HoaDonChiTietServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int hoadonchitietID = Integer.parseInt(req.getParameter("hoadonchitietID"));
        int productID = Integer.parseInt(req.getParameter("productID"));
        int hoadonID = Integer.parseInt(req.getParameter("hoadonID"));
        ProductAddmin productAddmin = ProductAddminDAO.getById(hoadonID);



        req.setAttribute("sanpham", productAddmin);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/hoaDonchitiet.jsp");
        dispatcher.forward(req,resp);

    }
}
