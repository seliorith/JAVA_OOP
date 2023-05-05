package HomeWork6.view;

import java.util.Map;

import HomeWork6.controller.VendingMachineController;

// Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, 
// усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему

/*
 * В процессе выполнения домашнего задания я постарался использовать в принцип SOLID в полной мере
 * Основной моей задачей было продемонстрировать как можно реализовать поставленную задачу таким образом, что бы дальнейшая
 * разработка была максимально простой, код читался легко, а функционал работал так как нам нужно.
 * 
 * Задача: Реализовать ПродуктовыйАвтомат, который будет продавать два типа продуктов.
 * 
 * Архитектурные слои:
 * 1) View ни чего не занет о том что у нас под капотом, имеет доступ только к контроллеру авттомата,
 *    может добавлять продукты, получать прайс лист, находить нужные продукты через контроллер
 * 2) Контроллер, ни чего не знает о классах продктов, его задача предоставить досутп для View к сервису
 * 3) Сервис отвечает только за работу с репозиторием и с конкертными типами продкутов
 * 4) Модель имеет абстрактный класс Product и наследников HotDrink и Bar
 * 5) Репозиторий - статический List<Product>
 * 
 * Что пришлось переделать в исходном коде семинара №4, так как мы придерживаемся принципа SOLID при проектировании данного приложения
 * пришлось переделать исходный код полностью, так как он не подлежал рефакторингу, так как нужно было изменить не только структуру,
 * но и саму реализацию методов, так как они не соответствовали принципам SOLID
 * 
 */

public class View {
    public static void main(String[] args) {
        VendingMachineController vMachineController = new VendingMachineController();
        vMachineController.addProduct("Bar", Map.of("name", "snikers", "cost", 50, "weight", 0.08));
        vMachineController.addProduct("Bar", Map.of("name", "bounty", "cost", 55, "weight", 0.06));
        vMachineController.addProduct("HotDrink",
                Map.of("name", "Green tea", "cost", 90, "volume", 0.22, "temperature", 70));
        vMachineController.addProduct("HotDrink",
                Map.of("name", "Black tea", "cost", 90, "volume", 0.22, "temperature", 80));

        for (String priceItem : vMachineController.getPpriceList()) {
            System.out.println(priceItem);

        }
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("cost", 50)));

    }
}
