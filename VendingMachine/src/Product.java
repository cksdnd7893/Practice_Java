public class Product {
    public String p_name = new String();
    public int p_price;
    public int p_stock;

    public Product() {
    }
    public Product(String name, int price, int stock) {
        p_name = name;
        p_price = price;
        p_stock = stock;
    }
}
