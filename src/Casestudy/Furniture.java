package Casestudy;


    public class Furniture extends Products{
        private String material;
        private String dimensions;

        public Furniture(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String material, String dimensions) {
            super(name, price, stockQuantity, taxationSpecifics,category);
            this.material = material;
            this.dimensions = dimensions;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getDimensions() {
            return dimensions;
        }

        public void setDimensions(String dimensions) {
            this.dimensions = dimensions;
        }
        public String toString(){
            return String.format("%s %s %s",super.toString(),material,dimensions);
        }
    }


