package HomeWork4;

public class HomeWork4 {

    /*
     * Необходимо взять код из первого дз и переработать его с учетом обобщений т.е
     * избавиться от классов под каждый тип продукта, заменив единым классом -
     * торговым автоматом
     * 
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Hot drinks:");
        VendingMachine<HotDrink> m = new VendingMachine<>();
        m.addProduct(new HotDrink("espresso", 30, 85, 0.06));
        m.addProduct(new HotDrink("mochachino", 40, 60, 0.14));
        for (HotDrink product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(m.getProduct(30));
        System.out.println(m.getProduct("mochachino"));
        System.out.println("\nBars:");
        VendingMachine<Bar> m2 = new VendingMachine<>();
        m2.addProduct(new Bar("Snickers", 42, 0.05));
        m2.addProduct(new Bar("SuperKontik", 40, 0.06));
        for (Bar product : m2.getProducts()) {
            System.out.println(product);
        }
    }
}
