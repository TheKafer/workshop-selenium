package dto;

public class ProductDto {
    private String productName;
    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ProductDto(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }
}
