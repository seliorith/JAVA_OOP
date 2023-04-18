package HomeWork1;

public class HomeWork1 {

    /**
     * Создать наследника реализованного класса ГорячийНапиток с дополнительным
     * полем int температура.
     * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
     * реализовать перегруженный метод getProduct(int name, int volume, int
     * temperature) выдающий продукт соответствующий имени, объему и температуре
     * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
     * и воспроизвести логику заложенную в программе
     * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     */

    public static void main(String[] args) throws Exception {
        HotDrinksVendingMachine m = new HotDrinksVendingMachine();
        m.addProduct(new HotDrink("espresso", 30, 85, 0.06));
        m.addProduct(new HotDrink("mochachino", 40, 60, 0.14));
        m.addProduct(new HotDrink("chocolate", 30, 45, 0.14));
        m.addProduct(new HotDrink("americano", 30, 90, 0.14));
        m.addProduct(new HotDrink("latte", 35, 70, 0.14));
        m.addProduct(new HotDrink("boiling water", 15, 100, 0.14));
        for (Product product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(m.getProduct(100));
        System.out.println(m.getProduct("americano"));
        System.out.println(m.getProduct(0.06));
    }
}
