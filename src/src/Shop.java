package src;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    Buyer buyer;
    Product product;
    static List<Order> orders = new ArrayList<>();


    public static void productPurchase(Buyer buyer, Product product) throws BuyerException, ProductException {
        Order order = new Order(buyer, product);
        orders.add(order);
        try {
            if (buyer == null) throw new BuyerException("Такого пользователя не существует");
        } catch (BuyerException e) {
            System.out.println(e.getMessage() + "(" + buyer.getFirstName() + ")");

            try {
                if (product == null) throw new ProductException("Такого продукта нет");
            } catch (ProductException ex) {
                System.out.println(ex.getMessage() + "(" + product.getName() + ")");
            }
        }
    }



    public static String getInfo() {
        StringBuilder sb = new StringBuilder();
        for (Order order : orders) {
            sb.append("Список совершенных покупок: ");
            sb.append(order.getBuyer().getFirstName() + " купил(а) " + order.getProduct().getName() + "\n");

        }
        return sb.toString();
    }

}
