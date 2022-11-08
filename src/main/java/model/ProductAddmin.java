package model;

public class ProductAddmin {
    private int productID;
    private String username;
    private String type;
    private String img;
    private Double total;

    public ProductAddmin() {
    }

    public ProductAddmin(int productID, String username, String type, String img, Double total) {
        this.productID = productID;
        this.username = username;
        this.type = type;
        this.img = img;
        this.total = total;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}