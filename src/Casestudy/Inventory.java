package Casestudy;

import java.util.Scanner;
import java.util.InputMismatchException;
    public class Inventory {
        Products[] products = new Products[100];
        int counter = 0;

        public void addProduct(Products product) {
            if (counter < products.length) {
                products[counter++] = product;
                System.out.println("Product added successfully!");
            } else {
                System.out.println("Inventory has no space.Cannot add more products.");
            }
        }

        public void removeProducts(int id) {
            for (int i=0; i<products.length; i++) {
                if (products[i]!=null && products[i].getId() == id) {
                    for (int j = i; j < products.length - 1; j++) {
                        products[j] = products[j + 1];
                    }
                    System.out.println("Product removed successfully");
                    return;
                }
            }
        }

        public void updateProduct(int id, Products product) {
            for (int i = 0; i < counter; i++) {
                if (products[i].getId() == id) {
                    products[i] = product;
                    System.out.println("Product updated successfully!");
                    return;
                }
            }
            System.out.println("Product not available");
        }


        public Products searchProduct() {
            int option=0;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter 1 to search by ID and Enter 2 to search by name ");
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter an integer value");
                return null;
            }

            if (option == 1) {
                System.out.print("Enter the product ID: ");
                try{
                    int id = scanner.nextInt();
                    for (int i = 0; i < counter; i++) {
                        if (products[i].getId() == id) {
                            System.out.println("Product found:");
                            System.out.println(products[i]);
                            return products[i];
                        }
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Input mismatch");
                }

            } else if (option == 2) {
                System.out.print("Enter the product name: ");
                String name = scanner.nextLine();
                for (int i = 0; i < counter; i++) {
                    if (products[i].getName().equals(name)) {
                        System.out.println("Product found:");
                        System.out.println(products[i]);
                        return products[i];

                    }
                }

            }
            else {
                System.out.println("Invalid choice...");

            }
            System.out.println("Product not found");
            return null;

        }
        public void getDetails() {
            System.out.println("Inventory Details:");
            for (int i=0;i< counter;i++) {
                System.out.println(products[i]);
            }
        }
    }


