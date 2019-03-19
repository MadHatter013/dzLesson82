package task4;

public class Flower {
    static int col;

    private String productionCountry;
    private int shelfLife;
    private double price;

    public Flower() {
        col++;
    }

    public Flower(String productionCountry, int shelfLife, double price) {
        this.productionCountry = productionCountry;
        this.shelfLife = shelfLife;
        this.price = price;
        col++;
    }

    public static int getCol() {
        return col;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public static void setCol(int col) {
        Flower.col = col;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
