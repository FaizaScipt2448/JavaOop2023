package Casestudy;

    public class Products {
        private int id;
        private String name;
        private double price;
        private int stockQuantity;
        private double taxationSpecifics;
        ProductType category;
        private static int counter=0;

        public Products(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category) {
            this.id = ++counter;
            this.name = name;
            this.price = price;
            this.stockQuantity = stockQuantity;
            this.taxationSpecifics = taxationSpecifics;
            this.category=category;
        }
        public int getId(){
            return id;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getStockQuantity() {
            return stockQuantity;
        }

        public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
        }

        public double getTaxationSpecifics() {
            return taxationSpecifics;
        }

        public void setTaxationSpecifics(double taxationSpecifics) {
            this.taxationSpecifics = taxationSpecifics;
        }

        public ProductType getCategory() {
            return category;
        }

        public void setCategory(ProductType category) {
            this.category = category;
        }

        @Override
        public String toString(){

            return String.format("%-7d %-13s %-8.1f %-13d %-8.1f %-17s",id,name,price,stockQuantity,taxationSpecifics,category);
        }
    }


