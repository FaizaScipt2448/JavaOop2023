package Casestudy;


    public class Electronics extends Products {
        private String powerConsumption;
        private Date warranty;

        public Electronics(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String powerConsumption,Date warranty) {
            super(name, price, stockQuantity, taxationSpecifics,category);
            this.powerConsumption = powerConsumption;
            this.warranty = warranty;
        }
        public String getPowerConsumption(){
            return powerConsumption;
        }
        public void setPowerConsumption(String powerConsumption){
            this.powerConsumption=powerConsumption;
        }
        public Date getWarranty(){
            return warranty;
        }
        public void setWarranty(Date warranty){
            this.warranty=warranty;
        }
        @Override
        public String toString(){
            return String.format("%-23s %-7s %-13s",super.toString(),powerConsumption,warranty);
        }

    }

