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

@WebServlet(urlPatterns = "/editProduct")
public class EditProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int productID = Integer.parseInt(req.getParameter("productID"));
        for (ProductAddmin p: ProductServiceAddmin.productAddmins) {
            if (p.getProductID() == productID){
                req.setAttribute("sp", p);
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editProduct.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int productID = Integer.parseInt(req.getParameter("productID"));
        String username = req.getParameter("username");
        String type = req.getParameter("type");
        String img = req.getParameter("img");
        Double total = Double.valueOf(req.getParameter("total"));
        ProductServiceAddmin.edit(productID,new ProductAddmin(productID,username,type,img,total));
        resp.sendRedirect("/productAddmin");
    }
}
