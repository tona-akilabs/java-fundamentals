package oo;

import java.util.List;

public class DataOrientedDemo {
    sealed interface Transaction permits Order, Refund {}

    record Order(String product, int quantity, double price) implements Transaction {}

    record Refund(String reason, double amount) implements Transaction {}

    record Customer(String name, String address, String State, List<Transaction> orders) {}

    void process(List<Customer> customers) {
        for (Customer c : customers) {
            double balance = 0;
            for (Transaction tx: c.orders) {
                switch (tx) {
                    case Order(String p, int q, double price) -> {
                        System.out.printf("Invoice %s for %d %s for $%7.2f\n",
                                c.name(), q, p, price);
                        balance += price;
                    }
                    case Refund(String reason, double amount) -> {
                        System.out.printf("Credit %s $%7.2f due to %s\n",
                                c.name(), amount, reason);
                        balance -= amount;
                    }
                }
            }
            System.out.printf("Net balance for %s is %f", c.name(), balance);
        }
    }

    void main() {
        List<Transaction> txlist = List.of(
                new Order("Widgets", 10, 200.00),
                new Order("Whatzits", 5, 125.00),
                new Refund("Lost shipment #456", 175.00)
        );
        var cust = new Customer("Whizzy Systems Inc", "123 Erewhon St", "Confusion", txlist);
        process(List.of(cust));
    }
}
