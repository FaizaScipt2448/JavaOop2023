package Casestudy;

    public class Laptop extends Electronics{
        String processorType;
        int ramSize;
        String screenDimensions;

        public Laptop(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String powerConsumption,Date warranty, String processorType, int ramSize, String screenDimensions) {
            super(name, price, stockQuantity, taxationSpecifics,category, powerConsumption, warranty);
            this.processorType = processorType;
            this.ramSize = ramSize;
            this.screenDimensions = screenDimensions;
        }

        public String getProcessorType() {
            return processorType;
        }

        public void setProcessorType(String processorType) {
            this.processorType = processorType;
        }

        public int getRamSize() {
            return ramSize;
        }

        public void setRamSize(int ramSize) {
            this.ramSize = ramSize;
        }

        public String getScreenDimensions() {
            return screenDimensions;
        }

        public void setScreenDimensions(String screenDimensions) {
            this.screenDimensions = screenDimensions;
        }

        @Override
        public String toString(){
            return String.format("%s %s %d %s",super.toString(),processorType,ramSize,screenDimensions);
        }

    }


