package service;

import dao.ProductAddminDAO;
import model.ProductAddmin;

import java.util.List;

public class ProductServiceAddmin {
    public static List<ProductAddmin> productAddmins = ProductAddminDAO.getAll();

    public List<ProductAddmin> show(){
        for (ProductAddmin g:
                productAddmins) {
            g.getProductID();
        }
        return productAddmins;
    }

    public static void add(ProductAddmin product) {
        productAddmins.add(product);
        ProductAddminDAO.save(product);
    }

    public static boolean checkid(int productID) {
        for (int i = 0; i < productAddmins.size(); i++) {
            if (productAddmins.get(i).getProductID() == productID) {
                return false;
            }
        }
        return true;
    }
    public static void edit ( int productID, ProductAddmin productAddmin){
        for (int i = 0; i < productAddmins.size(); i++) {
            if (productAddmins.get(i).getProductID() == productID) {
                productAddmins.set(i, productAddmin);
            }
        }
    }

    public static void delete ( int productID){
        for (int i = 0; i < productAddmins.size(); i++) {
            if (productAddmins.get(i).getProductID() == productID) {
                productAddmins.remove(i);
            }
        }
        ProductAddminDAO.delete(productID);
    }
}









