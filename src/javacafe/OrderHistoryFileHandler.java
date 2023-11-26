package javacafe;

import java.io.*;
import java.util.ArrayList;

    public class OrderHistoryFileHandler {
        private static final String ORDER_HISTORY_FILE_PATH = "order_history.txt";

        public static void writeOrderHistory(ArrayList<Menu> orderList) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ORDER_HISTORY_FILE_PATH))) {
                outputStream.writeObject(orderList);
                System.out.println("Order history written to file successfully.");
            } catch (IOException e) {
                System.err.println("Error writing order history to file: " + e.getMessage());
            }
        }

        public static ArrayList<Menu> readOrderHistory() {
            ArrayList<Menu> orderHistory = new ArrayList<>();
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ORDER_HISTORY_FILE_PATH))) {
                orderHistory = (ArrayList<Menu>) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error reading order history from file: " + e.getMessage());
            }
            return orderHistory;
        }
    }


