package com.week2.assignment.java8features;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task A
        List<Transaction> transactions = List.of(
                new Transaction("TXN001", "AAPL", "BUY", 10, 150.00, "2024-01-15T10:30:00", "USD"),
                new Transaction("TXN002", "TSLA" ,"SELL", 5, 700.00, "2024-01-16T11:00:00", "USD"),
                new Transaction("TXN003", "RELIANCE", "BUY", 100, 2400.00, "2024-01-20T09:15:00", "INR"),
                new Transaction("TXN004", "AAPL", "BUY", 20, 155.50, "2024-02-10T14:20:00", "USD"),
                new Transaction("TXN005", "MSFT", "BUY", 15, 300.00, "2024-02-12T10:00:00", "USD"),
                new Transaction("TXN006", "INFY", "SELL", 50, 1600.00, "2024-02-15T15:45:00", "INR"),
                new Transaction("TXN007", "TSLA", "BUY", 2, 650.00, "2024-03-01T09:30:00", "USD"),
                new Transaction("TXN008", "RELIANCE", "SELL", 30, 2500.00, "2024-03-05T10:10:00", "INR"),
                new Transaction("TXN009", "AAPL", "SELL", 5, 170.00, "2024-03-10T11:30:00", "USD"),
                new Transaction("TXN010", "GOOGL", "BUY", 8, 2800.00, "2024-03-25T13:00:00", "USD"),
                new Transaction("TXN011", "TCS", "BUY", 40, 3500.00, "2024-04-02T09:20:00", "INR"),
                new Transaction("TXN012", "MSFT", "SELL", 10, 310.00, "2024-04-05T16:00:00", "USD"),
                new Transaction("TXN013", "RELIANCE", "BUY", 200, 2350.00, "2024-04-10T11:00:00", "INR"),
                new Transaction("TXN014","INFY", "BUY", 100, 1550.00, "2024-05-12T09:45:00", "INR"),
                new Transaction("TXN015", "AAPL", "BUY", 12, 180.00, "2024-05-15T14:00:00", "USD"),
                new Transaction("TXN016", "TCS", "SELL", 20, 3600.00, "2024-06-01T10:30:00", "INR"),
                new Transaction("TXN017", "GOOGL", "SELL", 3, 2900.00, "2024-06-10T12:00:00", "USD"),
                new Transaction("TXN018", "ZOMATO", "BUY", 1000, 120.00, "2024-06-15T15:00:00", "INR"),
                new Transaction("TXN019", "MSFT", "BUY", 5, 320.00, "2024-06-20T10:00:00", "USD"),
                new Transaction("TXN020", "RELIANCE", "SELL", 50, 2600.00, "2024-06-25T11:30:00", "INR")
        );

        //Task B: High-Value Filtering
        List<Transaction> buyList = transactions.stream()
                .filter(a->a.getType().equals("BUY"))
                .filter(a->a.getQuantity()*a.getPrice()>5000)
                .collect(Collectors.toList());

        System.out.println(buyList);

        //Task C: Currency-Based Aggregation
        Map<String, Double>  aggregate = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency,
                        Collectors.summingDouble(a->a.getPrice()*a.getQuantity())));

        System.out.println(aggregate);

        //Task D: Finding the "Peak" Trade (Optional API)
        Optional<Double> op = aggregateTransactions(transactions, "AAPL");

        op.ifPresentOrElse(value-> System.out.println("Most expensive transaction: "+ value),
                () -> System.out.println("No data found"));

        //Task E: Market Activity Timeline (DateTime API)
        Map<String, Long> transactionsPerMonth = transactions.stream()
                .collect(Collectors.groupingBy(a->a.getTimestamp().getMonth().toString(), Collectors.counting()));

        System.out.println(transactionsPerMonth);

    }

    public static Optional<Double> aggregateTransactions(List<Transaction> list, String ticker){
        return list.stream()
                .filter(a->a.getTicker().equals(ticker))
                .map(a->a.getQuantity()*a.getPrice())
                .max(Double::compare);
    }
}
