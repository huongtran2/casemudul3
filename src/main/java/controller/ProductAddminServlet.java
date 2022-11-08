package controller;

import service.ProductServiceAddmin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/productAddmin")
public class ProductAddminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(ProductServiceAddmin.productAddmins.get(0).getPrice());
        req.setAttribute("sanphams", ProductServiceAddmin.productAddmins);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/productAddmin.jsp");
        dispatcher.forward(req, resp);



    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(ProductServiceAddmin.productAddmins.get(0).getPrice());
//        req.setAttribute("sanphams", ProductServiceAddmin.productAddmins);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/PdUserServlet");
//        dispatcher.forward(req, resp);
//    }
}
