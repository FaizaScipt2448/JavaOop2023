package Casestudy;


    public class Seating extends Furniture{
        private int loadCapacity;

        public Seating(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String material, String dimensions, int loadCapacity) {
            super(name, price, stockQuantity, taxationSpecifics,category, material, dimensions);
            this.loadCapacity = loadCapacity;
        }

        public int getLoadCapacity() {
            return loadCapacity;
        }

        public void setLoadCapacity(int loadCapacity) {
            this.loadCapacity = loadCapacity;
        }
        @Override
        public String toString(){
            return String.format("%-23s %-7d",super.toString(),loadCapacity);
        }
    }


