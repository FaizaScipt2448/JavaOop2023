package Labassesment2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public class TransactionHistory {
        private List<Transaction> transactions;

        public TransactionHistory() {
            transactions = new ArrayList<>();
        }

        public void addTransaction(String fromCurrency, String toCurrency, double amount, double result) {
            Transaction transaction = new Transaction(fromCurrency, toCurrency, amount, result);
            transactions.add(transaction);
        }

        public void printTransactionHistory() {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }

        private static class Transaction {
            private String fromCurrency;
            private String toCurrency;
            private double amount;
            private double result;
            private Date timestamp;

            public Transaction(String fromCurrency, String toCurrency, double amount, double result) {
                this.fromCurrency = fromCurrency;
                this.toCurrency = toCurrency;
                this.amount = amount;
                this.result = result;
                this.timestamp = new Date();
            }

            @Override
            public String toString() {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return String.format(
                        "[%s] %s %s -> %s %.2f = %.2f",
                        dateFormat.format(timestamp),
                        amount, fromCurrency, toCurrency, result
                );
            }
        }
    }


