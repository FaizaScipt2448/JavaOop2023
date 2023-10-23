package Casestudy;

    public class Table extends Furniture{
        private String shape;

        public Table( String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String material, String dimensions, String shape) {
            super(name, price, stockQuantity, taxationSpecifics,category, material, dimensions);
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }
        @Override
        public String toString(){
            return String.format("%s %s",super.toString(),shape);
        }
    }


