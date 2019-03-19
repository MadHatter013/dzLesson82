package task4;

public class MainTask4 {
    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[3];
        Flower[] bouquet2 = new Flower[3];
        Flower[] bouquet3 = new Flower[3];
        double totalCost = 0;


        bouquet1[0] = new Lily("Netherlands", 4, 8);
        bouquet1[1] = new Rose("Netherlands", 3, 18);
        bouquet1[2] = new Tulip("Belgium", 6, 4);

        for (int i = 0; i < bouquet1.length; i++) {
            totalCost = totalCost + bouquet1[i].getPrice();
        }
        System.out.println("Стоимость первого букета: " + totalCost);
        totalCost = 0;

        bouquet2[0] = new Snowdrop("Germany", 1, 9);
        bouquet2[1] = new Carnation("Italy", 5, 22);
        bouquet2[2] = new Lily("Narnia", 4, 7);

        for (int i = 0; i < bouquet2.length; i++) {
            totalCost = totalCost + bouquet2[i].getPrice();
        }
        System.out.println("Стоимость второго букета: " + totalCost);
        totalCost = 0;

        bouquet3[0] = new Snowdrop("Luxembourg", 1, 9);
        bouquet3[1] = new Rose("Narnia", 3, 18);
        bouquet3[2] = new Tulip("Belgium", 6, 4);

        for (int i = 0; i < bouquet3.length; i++) {
            totalCost = totalCost + bouquet3[i].getPrice();
        }
        System.out.println("Стоимость третьего букета: " + totalCost);
        totalCost = 0;

        System.out.println("Цветов продано всего: " + Flower.getCol());

    }
}
