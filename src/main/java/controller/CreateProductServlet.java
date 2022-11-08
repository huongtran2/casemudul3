package controller;

import model.ProductAddmin;
import service.ProductServiceAddmin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/createProduct")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int productID = Integer.parseInt(req.getParameter("productID"));
        if( ProductServiceAddmin.checkid(productID))
        {
            String username = req.getParameter("username");
            String type = req.getParameter("type");
            String img = req.getParameter("img");
            Double total= Double.valueOf(req.getParameter("total"));
            ProductServiceAddmin.add(new ProductAddmin(productID,username,type,img,total));
            resp.sendRedirect("/productAddmin");
//            resp.sendRedirect("/PdUserServlet");
        }
        else {
            req.setAttribute("thongbaoproductID","Ban bi trung id, xin moi nhap lai :");
            RequestDispatcher dispatcher = req.getRequestDispatcher("createProduct.jsp");
            dispatcher.forward(req, resp);
        }

    }
}
