package Casestudy;


    public class Groceries extends Products{
        Date expirationDate;
        String nutritionalValues;

        public Groceries(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, Date expirationDate, String nutritionalValues) {
            super(name, price, stockQuantity, taxationSpecifics,category);
            this.expirationDate = expirationDate;
            this.nutritionalValues = nutritionalValues;
        }

        public Date getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
        }

        public String getNutritionalValues() {
            return nutritionalValues;
        }

        public void setNutritionalValues(String nutritionalValues) {
            this.nutritionalValues = nutritionalValues;
        }
        @Override
        public String toString(){
            return String.format("%-23s %-13s %-17s",super.toString(),expirationDate,nutritionalValues);
        }
    }


