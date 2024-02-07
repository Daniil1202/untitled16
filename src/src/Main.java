package src;

import GenderType.Gender;

public class Main {
    static Buyer [] buyers = new Buyer[3];
    static Product[] products = new Product[7];

    public static void main(String[] args) throws BuyerException, ProductException {


        buyers[0] = new Buyer("Petr", "Petrov", 34, Gender.MALE);
        buyers[1] = new Buyer("Ivan", "Ivanov", 23, Gender.MALE);
        buyers[2] = new Buyer("Ekaterina", "Noskova", 26, Gender.FAMALE);


        products[0] = new Product("TV", 55.500);
        products[1] = new Product("Headphones", 15.800);
        products[2] = new Product("Phone", 40.500);
        products[3] = new Product("Computer", 120.000);
        products[4] = new Product("Laptop", 90.000);
        products[5] = new Product("Applewatch", 25.700);
        products[6] = new Product("Smartphone", 88.00);

        Shop.productPurchase(buyers[0],products[0]);
        Shop.productPurchase(buyers[1],products[5]);
        Shop.productPurchase(buyers[2], products[2]);
        System.out.println(Shop.getInfo());

    }


}












//        Random random = new Random();
//        int orderCount = random.nextInt(10)+1;
//        Orders [] orders = new Orders[orderCount];
//
//        for (int i = 0; i < orders.length; i++) {
//            Buyer buyer = buyers[random.nextInt(buyers.length)];
//            Product product = products[random.nextInt(products.length)];


//        Random random = new Random();
//        int orderCount = random.nextInt(10) + 1;
//        Orders[] orders = new Orders[orderCount];
//
//        for (int i = 0; i < orders.length; i++) {
//            Buyer[] buyers = new Buyer[3];
//            Buyer buyer = buyers[random.nextInt(buyers.length)];
//            Product product = products[random.nextInt(products.length)];
//
//            int countOrders = random.nextInt(5) +1;
//
//            try {
//                orders[i] = productPurchase(buyer.getFirstName(), product.getName(), countOrders);
//                System.out.println("Заказ: " + orders[i].getProduct().getName() + "количесвто: "
//                        + orders[i].getCountOrders());
//            } catch (CountOrdersException e) {
//                System.out.println(e.getMessage() + "(" + orderCount + ")");
//            } catch (BuyerException e) {
//                System.out.println(e.getMessage() + "(" + buyer.getFirstName() + ")");
//            } catch (ProductException e) {
//                System.out.println(e.getMessage() + "(" + product.getName() + ")");
//            }
//        }
//    }
//
//    public int OrderCount(){
//
//        int count = 0;
//        Orders[] orders = new Orders[0];
//        for (Orders orderss: orders ){
//            if (orderss != null){
//                count++;
//            }
//        }
//
//        System.out.println("Количесвто совершенных покупок: " +count);
//        return count;
//    }
//
//
//    public static  <buyer > Orders productPurchase(String firstName, String productName, int countOrders)
//            throws BuyerException, ProductException, CountOrdersException {
//        Buyer buyer = null;
//        for (Buyer b : buyers) {
//            if (b.getFirstName().equals(firstName)) {
//                buyer = b;
//                break;
//            }
//
//        }
//        if (buyer == null){
//            throw new BuyerException("Такого покупателя не существует: " + firstName);
//        }
//        Product product = null;
//        for (Product pr : products){
//            if(pr.getName().equals(productName)){
//                product = pr;
//                break;
//            }
//        }
//        if (product == null){
//            throw new ProductException("Такого товара не сущесвтует: " + productName);
//        }
//        if (countOrders <= 0 || countOrders > 95){
//            throw new CountOrdersException("Неверное количесвто продукта: " + " "+ firstName + " " + productName);
//        }
//        return new Orders(buyer,product,countOrders);
//    }



//}
